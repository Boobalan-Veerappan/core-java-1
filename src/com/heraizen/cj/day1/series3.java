package forloop;
import java.util.Scanner;
public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0,sum=0;
		System.out.println("Enter any Value");
		n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				sum = sum+i;
			}
		}
		System.out.println("Result is "+sum);
		
	}

}
