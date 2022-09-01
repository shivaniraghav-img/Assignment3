
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=8;i++)// row loop
        {
        	for(int j=1;j<=8;j++) //column loop
        	{
        		if(j==1 || (i==8 &&j%2==1))
        		System.out.print("*");// print *
        		else
        			System.out.print(" ");//to get space between stars
        	}
        	System.out.println();// to print star next line
        }
	}

}
