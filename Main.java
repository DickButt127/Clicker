public class Main extends View{
	
	static View view;
	
	public static void main(String[] args) {
		view = new View();
		Button button = new Button();
		getPanel().add(button.getButton());
		
	}
}