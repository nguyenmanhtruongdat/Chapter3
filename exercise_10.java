
public class exercise_10 {
	public static void main(String[] args) {
		
		int sum =0;
		for (int i=1; i<=100; i++)
		{	if (i%7==0) 
			{
			sum=sum+i;
			i++;
			}	
		}
		
		System.out.println("Sum of all number from 1 to 100 devide 7 without residual: "+sum);
		
		}
}	