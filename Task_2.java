//CodeAlpha
//@CodeAlpha

//Task-2

//Online Quiz Platform

import java.util.*;

class BankAccount{
    int balance;
    String CustomerName;
    String CustomerID;

    BankAccount(String cname,String cid){

        CustomerName=cname;
        CustomerID=cid;
    }

    void deposit(int amount){

        if(amount!=0){
            balance=balance+amount;
        }
    }

    void withdraw(int amount){

        if (balance!=0 && amount!=0) {

            balance=balance-amount;
            
        }
    }

    void option(){
        char opt='\0';
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome "+CustomerName+"sir");

        System.out.println("your ID "+CustomerID);

        System.out.println();

        System.out.println("A:Check Balance");
        System.out.println("B:Deposit Balance");
        System.out.println("C:Withdraw");
        System.out.println("D:Exit");

        do{
            System.out.println("=======================================================");
            System.out.println("Enter your Choice:");

            opt=sc.next().toUpperCase().charAt(0);

            switch (opt) {
                case 'A':
                        System.out.println("your Balance is:"+balance);
                    break;
                case 'B':
                    System.out.println("Enter amount to deposit:");
                    int amount1=sc.nextInt();
                    deposit(amount1);
                    break;
                case 'C':
                    System.out.println("Enter amount to withdraw:");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    System.out.println("=================================================");

                    System.out.println("Thank you sir!!!! for your beautiful visit have a nice Day");

                    System.out.println("===================================================");
                    break;
                default:
                    System.out.println("Invalid! Please do the operations..");
                    break;
            }
        }while(opt!='D');
            sc.close();
        }

    }
    
public class Task_2 {
    public static void main(String...args){

        BankAccount bankacc=new BankAccount("OMKAR JADHAV","2001");
        bankacc.option();
    }
    
}
