package com.ls.itemmanagement.common;

public class GlobalConstant {
    public static final String IS_COOKIE_EMPTY = "isCookieEmpty";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String TOKEN = "token";
    public static final String COOKIE = "cookie";
    public static final String IS_LOGIN = "isLogin";

    public static final String GOODS_ID = "goodsId";


    public static final String IS_DEFAULT_ADDRESS = "1";

    public static final String ADDRESS_ID = "addressId";
    public static final String GET_ADDRESS = "getAddress";
    public static final String IS_URL = "^(http|https|ftp)://([a-zA-Z0-9.\\-]+(:[a-zA-Z0-9.&amp;%$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(:[0-9]+)?(/[^/][a-zA-Z0-9.,?'\\\\/+&amp;%$#=~_\\-@]*)*$";
    public static final String IS_INTEGER = "[0-9]*";

    public static final String SELECT_CITY = "SELECT_CITY";
    public static final int SELECT_CITY_REQUEST_CODE = 1001;
    public static final String PRODUCT_NUM = "PRODUCT_NUM";
    public static final int REQUEST_ADDRESS = 1001;
    public static final String HAD_COLLECT = "success";
    public static final String HAD_COLLECTED = "已收藏";

    //Gallery 相册 画册
    public static final String GALLERY_MODE = "GALLERY_MODE";
    public static final String GALLERY_MODE_LOCAL_FILE = "GALLERY_MODE_LOCAL_FILE";
    public static final String GALLERY_MODE_URL_WITHOUT_BASE_URL = "GALLERY_MODE_URL_WITHOUT_BASE_URL";
    public static final String GALLERY_MODE_URL = "GALLERY_MODE_URL";
    public static final String GALLERY_MODE_BITMAP = "GALLERY_MODE_BITMAP";
    public static final String GALLERY_CURRENT_POSITION = "GALLERY_CURRENT_POSITION";
    public static final String CONFIRM_ORDER_MODE = "CONFIRM_ORDER_MODE";
    public static final String CONFIRM_ORDER_MODE_DIRECT = "CONFIRM_ORDER_MODE_DIRECT";
    public static final String CONFIRM_ORDER_MODE_TROLLEY = "CONFIRM_ORDER_MODE_TROLLEY";

    /**
     * 文件类型
     */
    public static final String DATA_TYPE_ALL = "*/*";//未指定明确的文件类型，不能使用精确类型的工具打开，需要用户选择
    public static final String DATA_TYPE_APK = "application/vnd.android.package-archive";
    public static final String DATA_TYPE_VIDEO = "video/*";
    public static final String DATA_TYPE_AUDIO = "audio/*";
    public static final String DATA_TYPE_HTML = "text/html";
    public static final String DATA_TYPE_IMAGE = "image/*";
    public static final String DATA_TYPE_PPT = "application/vnd.ms-powerpoint";
    public static final String DATA_TYPE_EXCEL = "application/vnd.ms-excel";
    public static final String DATA_TYPE_WORD = "application/msword";
    public static final String DATA_TYPE_CHM = "application/x-chm";
    public static final String DATA_TYPE_TXT = "text/plain";
    public static final String DATA_TYPE_PDF = "application/pdf";
    public static final String DATA_TYPE_VCF = "application/pdf";
    public static final String DATA_TYPE_SWF = "flash/*";


    public static final String OWNER_ID_TYPE = "OWNER_ID_TYPE";
    public static final String SEARCH_TYPE = "SEARCH_TYPE";
    public static final String OWNER_OF_GOOD_LIST = "OWNER_OF_GOOD_LIST";
    public static final String ID_OF_GOOD_LIST = "ID_OF_GOOD_LIST";
    public static final String TROLLEY_FROM = "TROLLEY_FROM";
    public static final String TROLLEY_FROM_GOODS_DETAILS = "TROLLEY_FROM_GOODS_DETAILS";
    public static final int SDK_PAY_FLAG = 1;
}
