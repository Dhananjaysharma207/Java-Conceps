package com.dev;

import java.util.Arrays;

public class Allloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[][] arr = {{"1","2","3"},{"lee","bee","zee"},{"101","102","103"}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t\t");
		}
		System.out.println("");		
		}
	for(String[] i:arr) {
		for(String j:i) {
			System.out.print(j+"\t\t");
		}
		System.out.println("");
	}
		/*
		 * int[] arr = new int[6]; arr[0]=101; arr[1]=102; arr[2]=103; arr[3]=104;
		 * arr[4]=105; arr[5]=106; System.out.println("Length of array is :" + " "+
		 * arr.length); System.out.println("**************for loop*****************");
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 * System.out.println("**************for each loop*****************"); for(int
		 * j:arr) { System.out.println(j); }
		 * System.out.println("**************While loop*****************"); int k=0;
		 * while(k<arr.length) { System.out.println(arr[k]); k++; }
		 * System.out.println("********Lambda function***********");
		 * Arrays.stream(arr).forEach(element->System.out.println(element));
		 * System.out.println("**************do while loop*****************"); int i=0;
		 * do { System.out.println(arr[i]); i++; }while(arr.length>0);
		 */
        
	}

}
