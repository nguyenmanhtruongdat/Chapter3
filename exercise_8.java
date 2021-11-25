
public class exercise_8 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=100; i++)
		{
			sum=sum+i;
		}
		
		double aver= sum/100;
		System.out.println("Average of all integer from 1 to 100: "+ aver);
	}

}
