package ysg;

import javax.swing.JOptionPane;

public class E01_05 {

	public static void main(String[] args) {
		int a =0;
		String menu = "";
		
		a = Integer.parseInt(JOptionPane.showInputDialog("�� ���� �Է��� �ּ���."));
		
		for(int j=1; j<=9; j++) {
			menu += a + " X " + j + " = " + a*j + "\n";
		}
		
		JOptionPane.showConfirmDialog(null, "=== ������ " + a + "�� ===\n" + menu);
	}

}
