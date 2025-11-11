package week2.day2;

public class LearnReversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName ="Testleaf";
		char[] charArray = companyName.toCharArray();
		System.out.println("Reversed String: ");
		for (int i =charArray.length-1 ; i >=0 ; --i) {
			System.out.println(charArray[i]);
		}
	}

}

