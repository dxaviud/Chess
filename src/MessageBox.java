/*
 * Copyright � 2020 David Xu All rights reserved. Use only for non-commercial purposes. Authorization required for other purposes. Use at your own risk.
 * This class is part of a chess game made for the AP Computer Science A's final project at University High School, Irvine CA. 
 */

import javax.swing.JOptionPane;

class MessageBox {
	public static void infoBox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}
