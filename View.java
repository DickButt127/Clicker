import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame{
	JPanel panel;	
	
	public View() {
		setSize(600, 600);
		
		panel = new JPanel();
		JLabel text = new JLabel("Hier könnte Ihre Werbung stehen!");
		JButton button = new JButton("HIER KLICKEN!");
		text.setForeground(new Color(0xff7700));
		
		panel.setBackground(Color.black);
		panel.add(text);
		panel.add(button);
		add(panel);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}