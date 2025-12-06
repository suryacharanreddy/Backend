public class Student{
    private int std_id;
    private String std_name,std_email,std_branch;
    Student(int id,String name,String email,String branch){
        this.std_id=id;
        this.std_name=name;
        this.std_email=email;
        this.std_branch=branch;
    }
    public void display(){
        System.out.println("Id :"+this.std_id);
        System.out.println("Name :"+this.std_name);
        System.out.println("Email :"+this.std_email);
        System.out.println("Brnach :"+this.std_branch);
    }

}