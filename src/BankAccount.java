public class BankAccount {

        protected String owner;
        protected double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void deposit(double amount){
             this.balance=balance+amount;
        }
        public void drowal(double amount){
             this.balance=balance-amount;
        }

        public String affiche() {
            return
                    "owner='" + owner + '\'' +
                    ", balance=" + balance;
        }
    }

