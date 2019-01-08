import java.util.*;
public class Conditionalstmt {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);   //defining scanner class to take input
		int number=input.nextInt();             //taking input from keyboard
		int i,fact_count=0;
		for(i=1;i<=number;i++)                 // loop for checking the factors of given number
		{
			if(number%i==0)
			{
				fact_count++;
			}
		}
		if(fact_count==2)                     //factors count is 2 then it is prime number
		{
			System.out.println(number+" is a prime number");
		}
		
		else                                 //otherwise it is not a prime number
		{
			System.out.println(number + " is not a prime number");
			
		}
		input.close();
	}

}
