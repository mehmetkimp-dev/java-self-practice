package SiniflaraGiris;

public class Bankaccount {

    public double balance;
    public String accountHolder;
    public long accountNumber;




public void deposit(double amount){
    balance+=amount;
    System.out.println("Depositing "+amount+" to "+ accountNumber);
}

    @Override
    public String toString() {
        return "Bankaccount{" +
                "balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public void withdraw(double amount){
    balance-=amount;
  if (amount>balance){
      System.out.println("Insufficent funds in "+ accountNumber+" Your balance is:"+"$"+balance);
  }else {
      System.out.println("Withdrawing"+"$"+amount+"from"+ accountNumber);
  }


}

public void showBalance(){
    System.out.println("------------");
    System.out.println("Account Holder: "+ accountHolder);
    System.out.println("Account Number: "+ accountNumber);
    System.out.println("Balance       : $" + balance);
}
public void charge(String item,double price){
    balance-=price;
    if (price>balance){
        System.out.println("insufficient funds to purchase "+ item +" from "+ accountNumber);
    }else {
        System.out.println("Buying " + item +"for $"+ price +" from "+ accountNumber);
    }
}


}
