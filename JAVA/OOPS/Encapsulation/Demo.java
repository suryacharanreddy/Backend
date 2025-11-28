class Demo{
    public static void main(String[]args){
        Account a1=new Account();
        a1.setAccId(101);
        System.out.println(a1.getAccId());
        a1.setAccName("Surya");
        System.out.println(a1.getAccName());
        a1.setAccBal(45000.23);
        System.out.println(a1.getAccBal());
    }
}