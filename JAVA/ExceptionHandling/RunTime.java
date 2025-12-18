class RunTime{
    public static void main (String[]args){
        int[] arr={1,2,3,4,5};
        String ename=null;
        Thread t=new Thread();
        System.out.println("Gm");
        System.out.println(10/1);
        try{
            System.out.println(10/0);           //Runtime error
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        try{
            System.out.println(ename.length()); //Runtime error
        }
        catch(NullPointerException nl){
            System.out.println(nl);
        }
        System.out.println("GA");
    }
}