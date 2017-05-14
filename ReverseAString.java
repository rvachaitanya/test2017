package afterGoldManRoundOne;

public class ReverseAString {
	public static void main(String[] args) {
		String abc = "abc";
		reverse(abc.toCharArray());
	}
	
	public static void reverse(char[] abc){
		String res = ""+abc[abc.length-1];
		for (int i = abc.length-2; i >=0 ; i--) {
				res += abc[i];
		}
		System.out.println(res);
	}
}
