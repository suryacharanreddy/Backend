class Ass9{
    static int[] prices={199,129,98,78,11,171,1055};
    public static void arrPrices(){
        for (int i=0; i<prices.length; i++){
            if (prices[i]<=400){
                System.out.println(prices[i]);
            }
        }
    }
    public static void newArr(){
        int[] prodPrices=new int[prices.length];
        System.out.println("New array is created :");
        for (int i=0;i<=prices.length-1;i++){
            prodPrices[i]=prices[i];
            System.out.println(prodPrices[i]);
        }
    }
    public static void main(String[]args){
        arrPrices();
        newArr();
    }
    
}
