import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame{
	static JPanel panel;
	static JLabel counter;
	
	public View() {
		setSize(600, 600);
		
		panel = new JPanel();
		counter = new JLabel("0");
		counter.setForeground(new Color(0xff7700));
		
		panel.setBackground(Color.black);
		panel.add(counter);
		add(panel);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void setCounter(int newNumber) {
		counter.setText("" + newNumber);
	}
	
	public static JPanel getPanel() {
		return panel;
	}

}
