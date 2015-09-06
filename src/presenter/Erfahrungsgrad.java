package presenter;

import javax.swing.JFrame;

import model.Character;
import view.ErfahrungsGradView;
import view.ErfahrungsgradChangedListener;

public class Erfahrungsgrad implements ErfahrungsgradChangedListener<model.Erfahrungsgrad> {

	private ErfahrungsGradView view;
	
	private model.Character thisCharacter;
	
	public Erfahrungsgrad(JFrame thisFrame) {
		thisCharacter = new Character();
		view = new ErfahrungsGradView();
		thisFrame.add(view);
		view.addOnErfahrungsgradChangedListener(this);
		initValues();
	}

	private void initValues() {
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Unerfahren", 900, 11, 10, 8, 95, 8, 0));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Durchschnittlich", 1000, 13, 10, 10, 98, 10, 1));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Erfahren", 1100, 14, 10, 12, 100, 12, 2));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Kompetent", 1200, 15, 13, 14, 102, 14, 3));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Meisterlich", 1400, 16, 16, 16, 105, 16, 4));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Brillant", 1700, 17, 19, 18, 109, 18, 5));
		view.addErfahrungsgrad(
				new model.Erfahrungsgrad("Legendär", 2100, 18, 20, 20, 112, 20, 6));
		
	}

	@Override
	public void onChange(model.Erfahrungsgrad object) {
		view.updateValues(object);
		thisCharacter.setErfahrungsGrad(object);
	}

}
