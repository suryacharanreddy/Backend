public class Test {
    public static void main(String[] args) {
        SavingAcc sa1 = new SavingAcc(101, "surya", "surya@gmail.com", 34000.0);
        CurrentAcc ca1 = new CurrentAcc(101, "charan", "charan@gmail.com", 76000.0);

        System.out.println(AccountService.getService(sa1));
        System.out.println(AccountService.getService(ca1));
    }
}
