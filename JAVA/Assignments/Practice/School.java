public class School {
    int id;
    String name;
    double marks;
    static String schoolName = "ABC High School";
    public School(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Id          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("School Name : " + schoolName);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        School s1 = new School(1, "Rahul", 89);
        School s2 = new School(2, "Sonia", 76);
        School s3 = new School(3, "Kiran", 93);

        s1.display();
        s2.display();
        s3.display();

        School.schoolName = "XYZ International School";

        s1.display();
        s2.display();
        s3.display();
    }
}
