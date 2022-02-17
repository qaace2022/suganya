package four;

import java.util.Scanner;

public class InstanceCount {
    static int count=0;
	public InstanceCount()
	{
		count++;
		
	}

	public static void main(String[] args) {
		
		InstanceCount c1=new InstanceCount();
		InstanceCount c2=new InstanceCount();
		InstanceCount c3=new InstanceCount();
		InstanceCount c4=new InstanceCount();
		InstanceCount c5=new InstanceCount();
		InstanceCount c6=new InstanceCount();
		InstanceCount c7=new InstanceCount();
		InstanceCount c8=new InstanceCount();
		System.out.println("The total number of instance create inside program is "+count);
		

	}
}

