public class CheckingAccount extends BankAccount {
    private double insufficientFundsFee;

    public CheckingAccount(String owner, double balance,double insufficientFundsFee) {
        super(owner, balance);
        this.insufficientFundsFee=insufficientFundsFee;
    }

    public double getInsufficientFundsFee() {
        return insufficientFundsFee;
    }

    public void setInsufficientFundsFee(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }

    @Override
    public void drowal(double amount) {
         balance=balance-amount-this.insufficientFundsFee;
    }

    public void process(){
 System.out.println(super.affiche()+
         ", insufficientFundsFee=" + insufficientFundsFee);
    }

}

