package Practice;

import java.util.Scanner;

public class Solution {
    
    public void myString(String myString){
    	System.out.print(myString);
    	String[] arr=myString.split("\\s+");
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        int count=arr[0].length();
        int space = 15-count;
        for(int i=0;i<space;i++){
            System.out.print(" ");
        }
        int numCount=arr[1].length();
        if(numCount==3){
            System.out.print(arr[1]);
        }
        else if(numCount<3){
            int zero=3-numCount;
            for(int i=0;i<zero;i++){
                System.out.print("0");
            }
            System.out.print(arr[1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
    	Solution obj = new Solution();
		  Scanner scan = new Scanner(System.in); 
		  String name= scan.nextLine();
		  obj.myString(name);
	        name+=scan.nextLine();
	         scan.close();
		 
        System.out.print("================================");
        System.out.println();
       // Solution obj = new Solution();
        //obj.myString("java 100");
        //obj.myString("cpp 65");
        //obj.myString("python 50");
        
        System.out.print("================================");
    }
}