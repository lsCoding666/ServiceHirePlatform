package xyz.lsgdut.dhxt.utils;

public class User3 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
    public User3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public   void   testParameterTransfer01(User3  u){
        u.name="高小八";
    }

    public   void   testParameterTransfer02(User3  u){
        u  =  new  User3(200,"高三");
    }

    public static void main(String[] args) {
        User3   u1  =  new User3(100, "高小七");

        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
