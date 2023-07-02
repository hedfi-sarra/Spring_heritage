// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount("Sarah",435.7);

String msg=  ba.affiche();
System.out.println(msg);
ba.deposit(60);
String msg2=ba.affiche();
System.out.println(msg2);
ba.drowal(43);
String msg3=ba.affiche();
System.out.println(msg3);
CheckingAccount ca=new CheckingAccount("chiheb",6540.8,80);
ca.process();
String msg4=  ca.affiche();
System.out.println(msg4);
ca.drowal(200);
ca.process();


    }
}