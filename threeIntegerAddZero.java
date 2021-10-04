public class threeIntegerAddZero
{
	public static void main(String[] args)
	{
      		int num[] = { 2, 3, 7, 1, -5, -8, -3, -11 };
		
		/*
		if(num.length < 3)
		{
			System.out.println("Minimum length of aaray should be 3");
			return;
		}
		*/
		
		int counter = 0;
		
		for(int i = 0; i < num.length - 2; i++)
		{
			for(int j = i+1; j < num.length - 1; j++)
			{
				for(int k = j+1; k < num.length; k++)
				{
					if( num[i] + num[j] + num[k] == 0 )
					{ 
						System.out.println("Yaaaay!! We found a triplet " +num[i]+ " " +num[j]+ " " +num[k]);
						++counter;
					}
				}
			}
		}
		
		System.out.println("We found " +counter+ " number of triplets");
						
		
	
	}
}
