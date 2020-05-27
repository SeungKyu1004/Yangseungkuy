package ysg;

import javax.swing.JOptionPane;

public class E01_05 {

	public static void main(String[] args) {
		int a =0;
		String menu = "";
		
		a = Integer.parseInt(JOptionPane.showInputDialog("단 수를 입력해 주세요."));
		
		for(int j=1; j<=9; j++) {
			menu += a + " X " + j + " = " + a*j + "\n";
		}
		
		JOptionPane.showConfirmDialog(null, "=== 구구단 " + a + "단 ===\n" + menu);
	}

}
