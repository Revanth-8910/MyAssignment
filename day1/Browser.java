package week2.day1;

public class Browser {

	public String launchBrowser(String Browsername)
	{
		System.out.println("Browser Launnched Succesfully");
		return Browsername;
	}
	
	
	public void loadurl() {
	
		System.out.println("Application url loaded successfully");
	
	}
	
	public static void main(String[] args) {
		Browser bo=new Browser();
	  bo.launchBrowser("Edge");
	  bo.loadurl();
	  
		
	}
}
