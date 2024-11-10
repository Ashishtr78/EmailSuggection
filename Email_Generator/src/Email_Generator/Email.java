package Email_Generator;

import java.util.Scanner;

public class Email {

	 
		private String firstName;
		private String lastName;
		private String password;
		private String changePassword;
		private String department;
		private int mailboxCapacity;
		private String email;
		private String alternateEmail;

		

		private int randomPasswordLength=10;
		private String companySufix="AcxiomConsulting";
		
		
		public Email(String firstName, String lastName)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			System.out.println("Email Creation:"+firstName+" "+lastName);
			this.department=setDepartment();
			System.out.println("Deptment :"+this.department);
			this.password=randomPassword(randomPasswordLength);
			System.out.println("Your Password is:"+password);
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySufix+".com";
			System.out.println("Email is :"+email);
			
		}
		
		private String setDepartment()
		{
			System.out.println("enter the department\n 1.for Sales\n 2.for Development\n 3.for Account \n 0.for none");
			Scanner in=new Scanner(System.in);
			int devchoice=in.nextInt();
			if(devchoice==1) {return "sales";}
			else if(devchoice==2) {return "Development";}
			else if(devchoice==3) {return "Accounting";}
			else {return "";}
			
		}
		
		public String randomPassword(int length)
		{
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890$!#%*";
			char[] password=new char[length];
			for(int i=0;i<length;i++)
			{
			int rand=(int)( Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
		public void setMailCapacity(int capacity)
		{
			this.mailboxCapacity=capacity;
		}
	
		public void setChangePassword(String paswword)
		{
		this.changePassword=paswword;
		}
		public void setAlternativeEmail(String alternativeemail)
		{
			this.alternateEmail=alternativeemail;
		}
	    public int getMailCapacity() { return mailboxCapacity;}
	    public String getChangePassword() { return password;}
	    public String getAlternativeEmail() { return alternateEmail;}
		
		public String getInfo()
		{
			return "Display Name :"+ firstName+" "+lastName+
					" Company Name :"+email+
					" Password :"+password+
			        " MailBoxCapacity :"+ mailboxCapacity+ "mb";
			        
		}
	}	

