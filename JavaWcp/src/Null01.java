
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		string1 = null;
		System.out.println(string1 + "の文字数：" + string1.length());
		
		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング
	}
}
