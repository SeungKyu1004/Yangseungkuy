package ysg;

public class E01_10 {

	public static void main(String[] args) {
		
		int i = 0; 
		int hap = 0;
		int num[]= new int[90];
		
		for (i = 0; i < 90; i++){
			{num[i] = (i+ 10) + i;
			hap = hap+num[i];
		}
			i =0;
			while(i<90)
				System.out.println(num[i]);
				i++;
		}
		
		System.out.println(hap);
	}

}
