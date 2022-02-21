package Workout;

public class PermutationCombination{

	public static void main(String[] args) {
		int n=7;
		int r=0;
		int p=n-r;
		int up=1;
		int down=1;
		int val=1;
		if(n>=r)
		{
		  while(n>0)
		  {
			  up=up*n;
			  n--;
		  }
		  while(r>0)
		  {
			  val=val*r;
			  r--;
		  }
		  
		  if(p>0)
		  {
		    while(p>0)
		    {
			  down=down*p;
			  p--;
			  
		    }
		  }
		  
		  
		  System.out.println("permutation is "+up/down);
		  System.out.println("combination is "+up/(val*down));
		}
	
	}

}
