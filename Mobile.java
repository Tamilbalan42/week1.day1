package week1.day1;

public class Mobile {
	String name ="Balan";
    public void sendMsg () {
    	System.out.println("Hi");
    }
    private void makeCall() 
    {
    	long mobileNumber= 7864723434L;
    	System.out.println(mobileNumber);
    }
    public void saveContact() {
    	String contactName = "Balan";
    	System.out.println(contactName);
    }
    public static void main(String[] args) {
		Mobile object = new Mobile();
		object.makeCall();
		object.sendMsg();
		object.saveContact();
		System.out.println("contact name: "+object.name);
	}
}
