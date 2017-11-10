import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ActionListener {
	
	static int counter;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Clicker");
		JPanel panel = new JPanel();
		ImageIcon horusButton = createImageIcon("/res/horus.jpg");
		JButton button = new JButton(horusButton);
		
		counter = 0;
		
		button.setMnemonic(KeyEvent.VK_ENTER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				System.out.println(counter);
			}
		});
		
		frame.setSize(310, 320);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		panel.add(button);
		frame.add(panel);
	}
	
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Main.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {		
	}

}
