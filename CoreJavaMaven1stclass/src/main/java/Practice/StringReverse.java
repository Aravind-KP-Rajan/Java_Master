package Practice;

public class StringReverse {

//	public void newstring(String name1) {
//		String[] ss = name1.split(" ");
//		char[] cha = ss[1].toCharArray();
//		String reverse = "";
//		// char c = cha;
//		for (char c : cha) {
//			reverse = c + reverse;
//		}
//		System.out.println(ss[0] + " " + reverse + " " + ss[2]);
//	}

	// System.out.println(name.(" "));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello welcome java";
		String[] strArr = str.split(" ");
		char[] ch = strArr[1].toCharArray();
		String reversedStr = "";
		for (char c : ch)
		{
			reversedStr = c + reversedStr;
		}
		System.out.println(strArr[0] + " " + reversedStr + " " + strArr[2]);
		
		
		
		
		
		
		

//		StringReverse obj = new StringReverse();
//		obj.newstring("ari abcd juj");
//
//		
		 
		String originalStr = "arav abcd lokesh";
		  @SuppressWarnings("unused")
		String reversedStri = "";
		  StringBuilder strBuild = new StringBuilder(originalStr); 
		  System.out.println(strBuild.reverse());
		
//		char[] ch = originalStr.toCharArray();
//		
//		for(char c : ch) {
//			reversedStr = c + reversedStr;
//		}

		/*
		 * for (int i = 0; i < originalStr.length(); i++) { reversedStr =
		 * originalStr.charAt(i)+reversedStr; System.out.println(reversedStr); }
		 */

	}
	// System.out.println("Reversed string: "+ reversedStr);

}
