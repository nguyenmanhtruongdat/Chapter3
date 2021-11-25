
public class exercise_9 {
	public static void main(String[] args) {
		
		int a = 0;
		for (int i=1; i<=100; i++)
		{	if (i%7==0) 
			{
			a=i; //using temporary variable
			i++;
			}	
		}
		
		System.out.println("The biggest number from 1 to 100 devide 7 without a residual= " +a);
	}
}	