package ysg;

public class E01_04 {

	public static void main(String[] args) {
		int i = 1;
		int evenSum = 0;
		int oddSum = 0;
		
		
		while(i <= 100) {
			if(i % 2 == 0) {
				evenSum += i;
			}else if(i % 2 ==1) {
				oddSum += i;
			}
			i++;
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : " + evenSum);
		System.out.println("È¦¼öÀÇ ÇÕ : " + oddSum);
	}

}
