import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends Component implements ActionListener{
	
	private int clicks;
	private JButton button;
	
	public Button() {
		button = new JButton("Fick äh Klick mich!");
		clicks = 0;
	}
	
	public int getClicks() {
		return this.clicks;
	}
	
	public void setClicks(int newClicks) {
		this.clicks = newClicks;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(button.getModel().isPressed()) {
			this.clicks += 1;
			View.setCounter(this.clicks);
		}
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
}
