class Login{
    private String userName;
    private String password;
    public void setUserName(String name ){
        this.userName=name;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setPassword(String pass ){
        this.password=pass;
    }
    public String getPassword(){
        return this.password;
    }
}
class Display{
    public static void main(String[]args){
       Login l1=new Login();
       l1.setUserName("surya");
       System.out.println(l1.getUserName());
       l1.setPassword("Surya@4494");
       System.out.println(l1.getPassword()); 
    }
}
