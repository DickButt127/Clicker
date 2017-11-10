import javax.swing.JButton;

public class Button implements ActionListener{
	
	private int clicks;
	private JButton button;
	
	public Button() {
		setButton(new JButton("Hier klicken"));
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
		
		
		
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
}