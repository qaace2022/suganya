package com.sirius.sample;

import java.io.File;

import java.util.Scanner;


import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {
	public static void main(String[] args) throws Exception{
		ObjectMapper mapper=new ObjectMapper();
		Menu pal=mapper.readValue(new File(("data/samp.json")),Menu.class);
	    int n=1;
		for(int s=0;s<n;s++) {
		Scanner scn=new Scanner(System.in);
		  System.out.println("WELCOME TO "+pal.getBank());
		  System.out.println("1.Admin login 2.Customer login ");
		  int login=scn.nextInt();
if(login==1) {
			  System.out.println("Enter your name");
			  String adminName=scn.next();
			  System.out.println("Enter your password");
			  int password=scn.nextInt();
	for(int y=0;y<pal.admin.length;y++) {
		if(adminName.equalsIgnoreCase(pal.getAdmin()[y].getAdminname())&& password==pal.getAdmin()[y].getPassword()) {
			  System.out.println("Welcome "+pal.getAdmin()[y].getAdminname());
			  int t=1;
		  for(int menu=0;menu<t;menu++) {
			  System.out.println("Are you want to see the menu Yes/No");
			  String str=scn.next();
		   if(str.equalsIgnoreCase("yes")) {
				
			  System.out.println("Hello bank administrator\nSelect the operation to perform\n 1.view all customer details\n 2.view all issued cards\n 3.Add new customer\n 4.Issue new credit card\n 5.view blocked cards\n 6.close/block credit card\n 7.logout ");
			  int choose=scn.nextInt();
	         switch(choose) {
			       case 1:System.out.println("Records for all the customers");
			                for(int k=0;k<pal.customers.length;k++) {
			                  for(int l=0;l<pal.getCustomers()[k].cards.length;l++){
			                    System.out.print(" Customer name = "+pal.getCustomers()[k].getName());
			                    System.out.print(" id = "+pal.getCustomers()[k].getId());
			                    System.out.print(" Cardno = "+pal.getCustomers()[k].getCards()[l].getCardno());
			                    System.out.print(" Balance = "+pal.getCustomers()[k].getCards()[l].getBalance());
			                    System.out.println(" Active = "+pal.getCustomers()[k].getCards()[l].isActive());
			              }}
			       break;
			       case 2:System.out.println("The issued card details");
			              int no=1;
			              for(int p=0;p<pal.customers.length;p++) {
			                 for(int q=0;q<pal.getCustomers()[p].cards.length;q++){
			                    System.out.print(no+" Cardno = "+pal.getCustomers()[p].getCards()[q].getCardno());
			                    System.out.print(no+" Balance = "+pal.getCustomers()[p].getCards()[q].getBalance());
			                    System.out.println(no+" Active = "+pal.getCustomers()[p].getCards()[q].isActive());
			                    no++;
			              }}
			       break;
			       case 3: System.out.println("enter the customer name");
			               String name=scn.next();
			               System.out.println("enter the unique id");
			               int id=scn.nextInt();
			    	       mapper.writeValue(new File("data/output.json"),new Customers(name,id));
			    	       System.out.println("Customer added successfully");
			      break;
			      case 4: int z=1000;
					     boolean card=false;
					     System.out.println("Enter card no");
						 int a=scn.nextInt();
						 System.out.println("enter the customer name");
			             String cust_Name=scn.next();
			             System.out.println("enter the unique id");
			             int unique_Id=scn.nextInt();
							for(int j=0;j<pal.getCustomers()[j].cards.length;j++) { 
								if(a==pal.getCustomers()[j].getCards()[j].getCardno()){
									card=true;
							   break;
							}}
							if(card==false) {
								System.out.println("card created successfully\npassword is "+z);
							    mapper.writeValue(new File("data/output.json"),new Cards(a,0,z,true));
							    z++;}
							else 
								System.out.println("Hello administrator card number already there so,try new one!!");    
				  break;
			      case 5:for(int i=0;i<pal.customers.length;i++) { 
			    		   for(int j=0;j<pal.getCustomers()[i].cards.length;j++) { 
			    	          if(false==pal.getCustomers()[i].getCards()[j].isActive()) {
							    System.out.println(" Cardno = "+pal.getCustomers()[i].getCards()[j].getCardno());
							  }}}
			      break;
			      case 6:System.out.println("Enter card no");
					     int w=scn.nextInt();
					     for(int i=0;i<pal.customers.length;i++) { 
			    	       for(int j=0;j<pal.getCustomers()[i].cards.length;j++) { 
			    		     if(w==pal.getCustomers()[i].getCards()[j].getCardno()) {
							   if(false!=pal.getCustomers()[i].getCards()[j].isActive()) {
							       System.out.println("Card blocked successfully");
							       mapper.writeValue(new File("data/output.json"),new Cards(w,0,0,false));}
							    else
							 	   System.out.println("This card is already blocked");
								
						   }}}
				  break;
			      case 7:System.out.println("THANK YOU");
			      break;
			 
			                   default:System.out.println("Enter valid option");
	              }
	           t++;
	          }
			  else
	        	  {
				   System.out.println("THANK YOU"); 
	        	   break;
	        	   }
     }}}}
else if(login==2) {
		         System.out.println("Enter your name");
		         String name=scn.next();
		   for(int b=0;b<pal.customers.length;b++) {
			    int val=0;
		  	    if(name.equalsIgnoreCase(pal.getCustomers()[b].getName())) {
				   System.out.println("Welcome "+pal.getCustomers()[b].getName());
			       System.out.println("Enter your card number");
				   int cno=scn.nextInt();
				   System.out.println("Enter your password");
				   int pw=scn.nextInt();
				   System.out.println("Are you want to\n1.Check Balance \n2.Cash withdraw \n3.credit amount\n 4.Close/block credit card\n 5.Apply for new credit card\n 6.Logout");
			       int option=scn.nextInt();
			       
		       switch(option){
				  case 1:for(int j=0;j<pal.getCustomers()[b].cards.length;j++) { 
				           if(cno==pal.getCustomers()[b].getCards()[j].getCardno()&&pw==pal.getCustomers()[b].getCards()[j].getPassword()) {
						      if(false!=pal.getCustomers()[b].getCards()[j].isActive()) {
						          val=pal.getCustomers()[b].getCards()[j].getBalance(); 
					              System.out.println("Your balance = "+ val);}
				              else
					              System.out.println("This card is blocked so, you can't see the balance ");
					   }}
			       break;
				   case 2: for(int j=0;j<pal.getCustomers()[b].cards.length;j++) { 
						     if(cno==pal.getCustomers()[b].getCards()[j].getCardno()&&pw==pal.getCustomers()[b].getCards()[j].getPassword()) {
						        if(false!=pal.getCustomers()[b].getCards()[j].isActive()) {
					            	val=pal.getCustomers()[b].getCards()[j].getBalance();
				                    System.out.println("Enter the amount");
						            int amount=scn.nextInt();
				                    int balance=val-amount;
					                System.out.println("Take your amount "+amount+"\n"+"your current balance ="+balance+"\n"+"THANKYOU");
					                pal.getCustomers()[b].getCards()[j].setBalance(balance);}
						
				              	else
						           System.out.println("This card is blocked so,you can't debit amount");
					}}
				 break;
				 case 3:for(int j=0;j<pal.getCustomers()[b].cards.length;j++) { 
			              if(cno==pal.getCustomers()[b].getCards()[j].getCardno()&&pw==pal.getCustomers()[b].getCards()[j].getPassword()) {
						     if(false!=pal.getCustomers()[b].getCards()[j].isActive()) {
							    val=pal.getCustomers()[b].getCards()[j].getBalance();
		                        System.out.println("Put the cash what you credited in your account");
						        int credit=scn.nextInt();
						        int balance=val+credit;
						        System.out.println("Your amount is credited successfully"+"\n"+"your current balance = "+balance+"\n"+"THANKYOU");
						        pal.getCustomers()[b].getCards()[j].setBalance(balance);}
						    else if(false==pal.getCustomers()[b].getCards()[j].isActive()) 
							    System.out.println("This card is blocked so,you can't credit amount");
					}}
				break;
				case 4:for(int j=0;j<pal.getCustomers()[b].cards.length;j++) { 
				         if(cno==pal.getCustomers()[b].getCards()[j].getCardno()&&pw==pal.getCustomers()[b].getCards()[j].getPassword()) {
						    if(false!=pal.getCustomers()[b].getCards()[j].isActive()) {
						       System.out.println("enter your password in reverse order");
						       int word=scn.nextInt();
						       int rev=0;
					            	while(pw>0) {
							          int bin=pw%10;
							          rev=rev*10+bin;
							          pw=pw/10;	}
						        if(rev==word) {
					               System.out.println("your card blocked successfully");
						           mapper.writeValue(new File("data/output.json"),new Cards(0,0,0,false));}
					          	else
							       System.out.println("Try again !!!!");}
						     else
							    System.out.println("This card is already blocked");}}
				break;
				case 5:	int z=1000;
					    boolean card=false;
					    System.out.println("Enter card no");
					    int a=scn.nextInt();
							for(int j=0;j<pal.getCustomers()[j].cards.length;j++) { 
								if(a==pal.getCustomers()[j].getCards()[j].getCardno()){
									card=true;
							        break;}}
							if(card==false) {
								System.out.println("card created successfully\n your password is "+z);
							    mapper.writeValue(new File("data/output.json"),new Cards(a,0,z,true));
							    z++;}
							else 
								System.out.println("card number already there so,try new one");
				case 6:System.out.println("THANK YOU");
				break;
				default:System.out.println("Enter valid option");}}}}
n++;}}}

			  
	
	   
				  
		 
	

	
	

 
		
	
		
	


