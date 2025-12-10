public class Student{
    private int id;
    private String name;
    private double marks;
    Student (int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
    public void calCulateDetails(){
        if(marks>=90){
            System.out.println("Grade :A");
        }
        else if(marks>=75 && marks<=90){
            System.out.println("Grade :B");
        }
        else if(marks>=50 && marks<=75){
            System.out.println("Grade :C");
        }
        else {
            System.out.println("Fail");
        }
    }
    public static void main(String []args){
        Student s1=new Student(1,"Rahul",92);
        Student s2=new Student(2,"Sonia",69);
        Student s3=new Student(3,"Modi",43.5);
        s1.displayDetails();
        s1.calCulateDetails();
        s2.displayDetails();
        s2.calCulateDetails();
        s3.displayDetails();
        s3.calCulateDetails();
    }
}