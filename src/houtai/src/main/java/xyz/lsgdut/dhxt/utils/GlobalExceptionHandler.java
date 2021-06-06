package xyz.lsgdut.dhxt.utils;



import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public JSONResult exceptionHandler(HttpServletRequest request, Exception e) {

        String message;
        System.out.println(e.getClass());

        if(e instanceof BindException){// 参数类型不匹配异常

            StringBuilder sb = new StringBuilder("参数校验错误：");
            BindingResult bindingResult = ((BindException) e).getBindingResult();
            if (bindingResult!=null){
                List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
                if (!CollectionUtils.isEmpty(fieldErrorList)){
                    for (FieldError fieldError : fieldErrorList){

                        sb.append(fieldError.getField())
                                .append("->")
                                .append(fieldError.getCode())
                                .append(" ");
                    }
                }

            }
            return JSONResult.errorMsg(sb.toString());

        }else if(e instanceof MissingServletRequestParameterException){// 缺少参数异常

            MissingServletRequestParameterException ex = (MissingServletRequestParameterException) e;

            message = String.format("缺少参数: %s", ex.getParameterName());



        }else if(e instanceof HttpRequestMethodNotSupportedException){// 请求类型异常

            HttpRequestMethodNotSupportedException ex = (HttpRequestMethodNotSupportedException) e;

            message = String.format("接口请求类型应该为: %s", ex.getSupportedHttpMethods());

        }else{

            return JSONResult.errorMsg("服务器内部错误");

        }
        return JSONResult.errorMsg(message);

    }

}