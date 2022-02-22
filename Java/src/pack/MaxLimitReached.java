package pack;
class MaxLimitReached extends Exception{
	public MaxLimitReached(String str)
	{
		super(str);
	}
}

public class MaxLimit{
	  static int count=0;
	
		public MaxLimit()
		{
			count++;
			if(count>3) {
				throw new MaxLimitReached("you create more than 3 object");				
			}
			else 
				System.out.println("you create object "+count);
			
			
		}

	public static void main(String[] args) {
		MaxLimit m1=new MaxLimit();
		MaxLimit m2=new MaxLimit();
		MaxLimit m3=new MaxLimit();
		try {
		MaxLimit m4=new MaxLimit();
		}
		catch(MaxLimitReached e) {
			System.out.println(e.getMessage());
			
		  }
		}
		
		
		
	}


