class Account{
    private int accId;
    private String accName;
    private double accBal;
    //If we want to access private variables we have create setter and getter 
    public void setAccId(int id){  //setter method
        this.accId=id;
    }
    public int getAccId(){         //getter method
        return this.accId;
    }
    public void setAccName(String name){
        this.accName=name;
    }
    public String getAccName(){
        return this.accName;
    }
    public void setAccBal(double bal){
        this.accBal=bal;
    }
    public double getAccBal(){
        return this.accBal;
    } 
}