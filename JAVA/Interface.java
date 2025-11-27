//wether we declare or not all interface methods are public and abstract
interface User{
    public abstract void login();
    public abstract void logout();
}
class UserImpl implements User{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("logout");
    }
    public static void main(String[]args){
        User u1=new UserImpl();
        u1.login();
        u1.logout();
    }
}