package afterGoldManRoundOne;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(palindrome("abba"));
	}
	
	public static boolean palindrome(String abc){
		//abc.toCharArray();
		boolean flag = false;
		int j =abc.length()-1;
		for (int i = 0; i <j; i++) {
			System.out.println(abc.charAt(i)+" "+abc.charAt(j));
			if(abc.charAt(i)==abc.charAt(j)){
				flag = true;
				j--;
			}
			else{
				j--;
				flag = false;
			}
		}
		return flag;
	}
}
