package Email_Generator;

public class EmailApp {

	public static void main(String[] args) {
		
	Email em1=new Email("john", "Smith");
	Email em2=new Email("harsh", "tiwary");
	em1.setAlternativeEmail("fuckYou@gmail.com");
	System.out.println(em1.getInfo());
	System.out.println(em2.getInfo());
	}
}
