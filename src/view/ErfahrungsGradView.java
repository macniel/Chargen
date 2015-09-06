package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSeparator;

import model.Erfahrungsgrad;

@SuppressWarnings("serial")
public class ErfahrungsGradView extends JPanel {
	
	public ErfahrungsGradView() {
		init();
		
		
	}
	
	private JComboBox<Erfahrungsgrad> gradCombobox;
	// resulting
	private JLabel ap;
	private JLabel maxEigenschaft;
	private JLabel maxFertigkeit;
	private JLabel maxKampffertigkeit;
	private JLabel maxEigenschaftspunkte;
	private JLabel maxZauber;
	private JLabel maxFremdZauber;
	private ArrayList<ErfahrungsgradChangedListener<Erfahrungsgrad>> erfahrungsgradChangedListener;
	
	public void addErfahrungsgrad(Erfahrungsgrad grad) {
		gradCombobox.addItem(grad);
	}
	
	@PostConstruct
	private void init() {
		initGui();
		gradCombobox.addItemListener(e -> {
			for ( ErfahrungsgradChangedListener<Erfahrungsgrad> listener : erfahrungsgradChangedListener ) {
				listener.onChange((Erfahrungsgrad)e.getItem());
			}
		});
		reset();
		
	}
	
	public void addOnErfahrungsgradChangedListener(ErfahrungsgradChangedListener<Erfahrungsgrad> listener) {
		if (null == this.erfahrungsgradChangedListener) {
			this.erfahrungsgradChangedListener = new ArrayList<ErfahrungsgradChangedListener<Erfahrungsgrad>>();
		}
		this.erfahrungsgradChangedListener.add(listener);
	}
	
	private void initGui() {
setLayout(new MigLayout("", "[75px][grow]", "[14px][][][][][][][][]"));
		
		JLabel lblErfahrungsgrad = new JLabel("Erfahrungsgrad");
		add(lblErfahrungsgrad, "cell 0 0,alignx trailing,aligny top");
		
		gradCombobox = new JComboBox<>();
		add(gradCombobox, "cell 1 0,growx");
		
		JSeparator separator = new JSeparator();
		add(separator, "cell 0 1 2 1");
		
		JLabel lblStartAbenteuerpunkte = new JLabel("Start Abenteuerpunkte");
		add(lblStartAbenteuerpunkte, "cell 0 2,alignx right");
		
		ap = new JLabel();
		add(ap, "cell 1 2");
		
		JLabel lblHchstwertEigenschaft = new JLabel("H\u00F6chstwert Eigenschaft");
		add(lblHchstwertEigenschaft, "cell 0 3,alignx right");
		
		maxEigenschaft = new JLabel();
		add(maxEigenschaft, "cell 1 3");
		
		JLabel lblMaximaleEigenschaftspunkte = new JLabel("Maximale Eigenschaftspunkte");
		add(lblMaximaleEigenschaftspunkte, "cell 0 4");
		
		maxEigenschaftspunkte = new JLabel();
		add(maxEigenschaftspunkte, "cell 1 4");
		
		JLabel lblHchstwertFertigkeit = new JLabel("H\u00F6chstwert Fertigkeit");
		add(lblHchstwertFertigkeit, "cell 0 5,alignx right");
		
		maxFertigkeit = new JLabel();
		add(maxFertigkeit, "cell 1 5");
		
		JLabel lblHchstwertKampffertigkeit = new JLabel("H\u00F6chstwert Kampffertigkeit");
		add(lblHchstwertKampffertigkeit, "cell 0 6,alignx right");
		
		maxKampffertigkeit = new JLabel();
		add(maxKampffertigkeit, "cell 1 6");
		
		JLabel lblMaximaleAnzahlZauberliturgien = new JLabel("<html>Maximale Anzahl<br>Zauber/Liturgien</html>");
		add(lblMaximaleAnzahlZauberliturgien, "cell 0 7,alignx right");
		
		maxZauber = new JLabel();
		add(maxZauber, "cell 1 7");
		
		JLabel lblDavonFremd = new JLabel("Davon fremd");
		add(lblDavonFremd, "cell 0 8,alignx right");
		
		maxFremdZauber = new JLabel();
		add(maxFremdZauber, "cell 1 8");
	}
	
	private void reset() {
		
	}

	public void updateValues(model.Erfahrungsgrad object) {
		ap.setText(""+object.getAp());
		maxEigenschaft.setText(""+object.getMaxEigenschaft());
		maxEigenschaftspunkte.setText(""+object.getMaxEigenschaftspunkte());
		maxFertigkeit.setText(""+object.getMaxFertigkeit());
		maxKampffertigkeit.setText(""+object.getMaxKampfwertFertigkeit());
		maxZauber.setText(""+object.getMaxZauber());
		maxFremdZauber.setText(""+object.getMaxFremdZauber());
	}
	
}
