public class ForEach{
    public static void Strings(){
        String[] enames={"surya","charan","reddy"};
        for(String ename:enames){
            System.out.println(ename);
        }
    }
    public static void numbers(){
        int[] eids={101,102,103,104,105,106};
        for(int eid:eids){
            System.out.println(eid);
        }
    }
    public static void main(String[]args){
        Strings();
        numbers();
    }
}