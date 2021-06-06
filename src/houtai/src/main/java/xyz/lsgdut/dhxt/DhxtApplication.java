package xyz.lsgdut.dhxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("xyz.lsgdut.dhxt.mapper")
@ComponentScan(basePackages={"xyz.lsgdut.dhxt"})
public class DhxtApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DhxtApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources((DhxtApplication.class));
	}

}
