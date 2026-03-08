package SiniflaraGiris;

public class BankaccountObjects {
    public static void main(String[] args) {

        Bankaccount bankaccount1=new Bankaccount();
        bankaccount1.accountHolder="Mehmet";
        bankaccount1.accountNumber=999303458901L;

bankaccount1.deposit(100);
        bankaccount1.withdraw(100);
bankaccount1.showBalance();
bankaccount1.charge("gas",100);

    }
}
