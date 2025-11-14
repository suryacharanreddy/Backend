class Terinary{
    public static void variable(){
        int esal=45000;
        String msg=esal>=40000?"Eligible":"Not Eligible";
        System.out.println(msg);
    }
    public static void direct(){
        int esal=45000;
        System.out.println(esal>=40000?"Eligible":"Not Eligible");
    }
    public static void main(String[]args){
        variable();
        direct();
    }
}