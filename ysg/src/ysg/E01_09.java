package ysg;

import java.util.Scanner;

public class E01_09 {
	public static void main(String [] arg) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap = 0, i;
		
		for (i = 0; i<=3; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i+1);
			aa[i] = s.nextInt();
		}
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
	
		System.out.printf(" �հ� ==> %d \n", hap);
	}

}
