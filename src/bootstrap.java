import javax.swing.JFrame;

public class bootstrap {

	public static void main(String[] args) {
		JFrame thisFrame = new JFrame();
		presenter.Erfahrungsgrad startPresenter = new presenter.Erfahrungsgrad(thisFrame);
		thisFrame.setVisible(true);
	}
	
}
