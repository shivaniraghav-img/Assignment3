//this program prints prime number between 1 to 200
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=100,b=200;       //
      for(int i=a;i<=b;i++)  {  //for loop 
    	 if(checkPrime(i)){// check number is less than or equal to 200
    		   System.out.println(i+" ");
    	}
      }
	}
	// to check whether number is prime or not
       public static boolean checkPrime(int num) {
    	 
    	   if(num<2) {  
    		   return false;
    	   }
    	   else {
    		   int x=num/2;
    		   for(int i=2;i<x;i++){
    	       if (num%i==0) {
    	    	   return false;
    	       }
           }
     }
          return true;  //the number is prime reach here
       }
	}

