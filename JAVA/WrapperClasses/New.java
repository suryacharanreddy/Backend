class New{
    public static void main(String []args){
        int a=100;// primitive datatype
        Integer b=Integer.valueOf(a);//This method is used to convert primitive to object.
        Integer c=a;//It is known as Autoboxing instead of writting above line we use like this.
                    //This automatically converts primitive datatype to object due to wrapper classes
        Integer d=100; //object
        int e=d.intValue();//this line converts object to primitive datatype .this also known as unboxing.
        int f=d; //Instead of writing above line we use this method to convert object to primitive datatype.
        //System.out.println(a.equals(b));
        System.out.println(b.equals(d));
    }
    
}