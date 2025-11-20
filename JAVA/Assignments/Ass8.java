class Counter{
    private static int count=0;
    public static void increment(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args){
        increment();
        increment();
        increment();
        System.out.println("final value :"+getCount());
    }
}