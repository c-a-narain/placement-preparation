//A positive integer N is passed as the input. If we print all the numbers from 1 to N continuosly, the program must find the number of characters(digits) C printed and print the count C as the output.

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s="";
		for(int i=1;i<=n;i++){
		    s+=Integer.toString(i);
		}
		System.out.println(s.length());
	}
}
