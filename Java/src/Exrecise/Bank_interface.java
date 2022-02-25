package Exrecise;
interface HDFC{
	String ROI_hdfc(String User_name,double User_ID);
	
}
interface SBI{
	String ROI_sbi(String User_name,double User_ID);
	
}
interface AXIS{
	String ROI_axis(String User_name,double User_ID);
}
interface UBI{
	String ROI_ubi(String User_name,double User_ID);
}

	


public class Bank_interface implements HDFC,SBI,AXIS,UBI{
	String Cust_name;
	double Cust_ID;
    String acc_bal;
	@Override
	public String ROI_hdfc(String User_name,double User_ID) {
		 Cust_name ="Suganya";
		 Cust_ID=9123;
		 if(Cust_ID==User_ID && Cust_name.equalsIgnoreCase(User_name))
	   {
		   acc_bal="80000.23";
	   }
		 else
		 {
			 acc_bal="Please Enter valid credentials";
		 }
	return acc_bal;
	   
		
	}
	@Override
	public String ROI_sbi(String User_name,double User_ID) {
		 Cust_name ="k.suganya";
		 Cust_ID=1234;
		 if(Cust_ID==User_ID && Cust_name.equalsIgnoreCase(User_name) )
	   {
		   acc_bal="982347829";
	   }
		 else
		 {
			 acc_bal="Please Enter valid credentials";
		 }
	return acc_bal;
	}
	@Override
	public String ROI_ubi(String User_name,double User_ID) {
		
		 Cust_name ="Sugan";
		 Cust_ID=5678;
		 if(Cust_ID==User_ID && Cust_name.equalsIgnoreCase(User_name) )
	   {
		   acc_bal="66372";
	   }
		 else
		 {
			 acc_bal="Please Enter valid credentials";
		 }
	return acc_bal;
	}
	@Override
	public String ROI_axis(String User_name,double User_ID) {
		 Cust_name ="Suganya kandasamy";
		 Cust_ID=9876;
		 if(Cust_ID==User_ID && Cust_name.equalsIgnoreCase(User_name))
	   {
		   acc_bal="901277";
	   }
		 else
		 {
			 acc_bal="Please Enter valid credentials";
		 }
	return acc_bal; 
	}
	public static void main(String[] args) {
		
		Bank_interface c=new Bank_interface();
		String out1=c.ROI_hdfc("Suganya",9135);
		String out2=c.ROI_sbi("k.suganya",1234);
		String out3=c.ROI_ubi("sugan", 5678);
		String out4=c.ROI_axis("suganya kandasamy",9876);
		System.out.println("yout account HDFC balance is "+ out1);
		System.out.println("yout account SBI balance is "+ out2);
		System.out.println("yout account UBI balance is "+ out3);
		System.out.println("yout account AXIS balance is "+ out4);
		

	}

}
