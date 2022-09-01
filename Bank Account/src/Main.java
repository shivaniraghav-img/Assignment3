import java.util.*;
import java.util.Scanner;
//Super class
 class Account{
    String name, type;   //instance variable
   int ac_no;  //instance variable
   float amount;
   void details(int n,String nam,String t,float a )
   {
	   ac_no=n;
	   name=nam;
	   type=t;
	   amount=a;
   }   
	   void show()
	   {
		   System.out.println(ac_no+" "+name+" "+type+" "+amount);
   }
	   void deposit(float a)
	   {
		   amount+=a;
		   System.out.println("Deposit Amount"+a);
	   }
	   void withdraw(float a)
	   {
		   if(amount<a)
		   System.out.println("Insufficient balance");
		   else
		   amount=a;
		   System.out.println("Withdraw Amount"+a);
}
	   void getbalance()
	   {
		   
		   System.out.println("Balance is"+amount);
	   }
 }
//Sub class1
class CurrentAccount extends Account{  
	Account ac1=new Account();	
}
//Sub class2
class SavingAccount extends Account
{
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
