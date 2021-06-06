package com.ls.itemmanagement.common;

import java.util.HashMap;

public class FinalDatas {

    public static final String PROJECT_ID = "PROJECT_ID";

    /**
     * 请求mediaType
     */
    public static final String REQUEST_JSON = "application/json; charset=utf-8";

    /**
     * 用户获取前Activity返回的信息的请求码
     */
    public static final int SPACE_SELECT_REQUEST_CODE = 10001;
    public static final int ADD_ITEM_REQUEST_CODE = 10002;
    public static final int EDIT_ITEM_REQUEST_CODE = 10003;
    public static final int PUBLISH_ITEM_REQUEST_CODE = 10004;

    public static final int MAX_LENGTH_USER_NAME = 1;
    public static final int MAX_LENGTH_PASSWORD = 1;

    public static final String GET_SQUARE_ITEMS_PAGE = "getSquarePage";
    //public static HashMap<String, String> orderType = new HashMap<>();
    public static String[][] sortType
            = new String[][]{{"最新发布", "time"},
            {"离我最近", "distance"},
            {"价格升序", "price"},
            {"价格降序", "price"},
            {"亲密度优先","intimacy"}};
    public static String[] selectStatusItems = new String[]{"全部", "闲置", "借入", "借出", "授权", "发布", "被授权"};
    public static String[] itemPublishOtherType = new String[]{"同城"};
    public static String[] modulesName = new String[]{"管理", "广场", "添加", "消息", "我的"};
    public static String[] itemPublishTypeName = new String[]{"借出", "出售", "分享", "赠与", "交换", "出租", "寻物"};
    public static String[] itemPublishObjectName = new String[]{"广场", "群", "好友"};
    public static String[] itemPublishIntimacy = new String[]{"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
    public static String[] itemGrantAuthorityNames = new String[]{"可出借", "可出租", "可共享", "可赠与", "可交换", "管理"};
    public static String[] itemGrantObjectNames = new String[]{"群", "好友"};

    private static String[] addItemPosition = new String[]{"里面", "外面", "上面", "下面", "左边", "右边", "前面", "后面"};
    public static String[] addItemClassify = new String[]{"化妆品", "文档"};

    /**
     * 用于Activity之间传输数据的name
     */
    public static final String ITEM_ID = "itemID";
    public static final String ITEM_NAME = "itemName";
    public static final String ACTIVITY_TYPE = "activityType";
    public static final String PIC_VIEWER_INDEX = "picViewerIndex";
    public static final String PIC_PATH_LIST = "picPathList";
    public static final String SQUARE_ITEM_ID = "squareItemId";
    public static final String SQUARE_ITEM_MODEL = "squareItemModel";
    public static final String INDENT_ITEM_MODEL = "indentModel";
    public static final String ITEM_STATE = "state";


    public static HashMap<String, Integer> statusMap = new HashMap<>();

    static {
        statusMap.put("全部", 0);
        statusMap.put("闲置", 1);
        statusMap.put("借入", 2);
        statusMap.put("借出", 3);
        statusMap.put("授权", 4);
        statusMap.put("发布", 5);
        statusMap.put("被授权", 6);
    }

    public static final String IS_COOKIE_EMPTY = "isCookieEmpty";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String TOKEN = "token";
    public static final String COOKIE = "cookie";
    public static final String IS_LOGIN = "isLogin";


    public static String[] getItemGrantAuthorityNames() {
        return itemGrantAuthorityNames;
    }

    public static String[] getItemGrantObjectNames() {
        return itemGrantObjectNames;
    }

    public static String[] getItemPublishIntimacy() {
        return itemPublishIntimacy;
    }

    public static String[] getItemPublishObjectName() {
        return itemPublishObjectName;
    }

    public static int getStatusIndex(String statusName) {
        return statusMap.get(statusName);
    }


    public static String[] getItemPublishTypeName() {
        return itemPublishTypeName;
    }

    public static String[] getAddItemPosition() {
        return addItemPosition;
    }

    public static String[] getAddItemClassify() {
        return addItemClassify;
    }

    public static String[] getSelectStatusItems() {
        return selectStatusItems;
    }

    public static String[] getModulesName() {
        return modulesName;
    }


}
