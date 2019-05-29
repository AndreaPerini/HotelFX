/**
 * Sample Skeleton for 'HotelView.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HotelController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="inizio"
	private TextField inizio; // Value injected by FXMLLoader

	@FXML // fx:id="fine"
	private TextField fine; // Value injected by FXMLLoader

	@FXML // fx:id="numcamera"
	private TextField numcamera; // Value injected by FXMLLoader

	@FXML // fx:id="dateInizio"
	private DatePicker dateInizio; // Value injected by FXMLLoader

	@FXML // fx:id="dateFine"
	private DatePicker dateFine; // Value injected by FXMLLoader

	@FXML // fx:id="txtCamera"
	private TextField txtCamera; // Value injected by FXMLLoader

	@FXML // fx:id="nome"
	private TextField nome; // Value injected by FXMLLoader

	@FXML // fx:id="cognome"
	private TextField cognome; // Value injected by FXMLLoader

	@FXML // fx:id="telefono"
	private TextField telefono; // Value injected by FXMLLoader

	@FXML // fx:id="txtNome"
	private TextField txtNome; // Value injected by FXMLLoader

	@FXML // fx:id="txtCognome"
	private TextField txtCognome; // Value injected by FXMLLoader

	@FXML // fx:id="txtNumero"
	private TextField txtNumero; // Value injected by FXMLLoader

	@FXML // fx:id="btnInserisciPrivato"
	private Button btnInserisciPrivato; // Value injected by FXMLLoader

	@FXML // fx:id="azienda"
	private TextField azienda; // Value injected by FXMLLoader

	@FXML // fx:id="iva"
	private TextField iva; // Value injected by FXMLLoader

	@FXML // fx:id="indirizzo"
	private TextField indirizzo; // Value injected by FXMLLoader

	@FXML // fx:id="txtAzienda"
	private TextField txtAzienda; // Value injected by FXMLLoader

	@FXML // fx:id="txtIva"
	private TextField txtIva; // Value injected by FXMLLoader

	@FXML // fx:id="txtIndirizzo"
	private TextField txtIndirizzo; // Value injected by FXMLLoader

	@FXML // fx:id="btnInserisciAzienda"
	private Button btnInserisciAzienda; // Value injected by FXMLLoader

	@FXML // fx:id="ncamera"
	private TextField ncamera; // Value injected by FXMLLoader

	@FXML // fx:id="dataCerca"
	private TextField dataCerca; // Value injected by FXMLLoader

	@FXML // fx:id="txtDate"
	private TextField txtDate; // Value injected by FXMLLoader

	@FXML // fx:id="date"
	private DatePicker date; // Value injected by FXMLLoader

	@FXML // fx:id="btnDate"
	private Button btnDate; // Value injected by FXMLLoader

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader

	private Hotel h = new Hotel();
	private Azienda a;
	private Privato p;
	private int n;

	@FXML
	void insertAzienda(ActionEvent event) {
		a = new Azienda();
		a.setNomeAzienda(txtAzienda.getText());
		a.setPartitaIVA(Integer.parseInt(txtIva.getText()));
		a.setIndirizzoFatturazione(txtIndirizzo.getText());
		n = h.aggiungiCliente(Integer.parseInt(txtCamera.getText()), a, dateInizio.getValue(), dateFine.getValue());
		if (n == 0)
			txtResult.setText("Camera occupata nel periodo");
		if (n == -1)
			txtResult.setText("La data finale viene prima della data iniziale");
		if (n == 1)
			txtResult.setText("Cliente inserito");
		txtAzienda.setText("");
		txtIva.setText("");
		txtIndirizzo.setText("");
		txtCamera.setText("");
	}

	@FXML
	void insertPrivato(ActionEvent event) {
		p.setNome(txtNome.getText());
		p.setCognome(txtCognome.getText());
		p.setNumeroTelefono(Integer.parseInt(txtNumero.getText()));
		h.aggiungiCliente(Integer.parseInt(txtCamera.getText()), p, dateInizio.getValue(), dateFine.getValue());
		txtNome.setText("");
		txtCognome.setText("");
		txtNumero.setText("");
		txtCamera.setText("");
	}

	@FXML
	void searchDate(ActionEvent event) {
		if (h.controllaCamera(Integer.parseInt(txtDate.getText()), date.getValue()) == null)
			txtResult.setText("Camera libera");
		else
			txtResult.setText(
					"Camera occupata da " + h.controllaCamera(Integer.parseInt(txtDate.getText()), date.getValue()));

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert inizio != null : "fx:id=\"inizio\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert fine != null : "fx:id=\"fine\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert numcamera != null : "fx:id=\"numcamera\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert dateInizio != null : "fx:id=\"dateInizio\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert dateFine != null : "fx:id=\"dateFine\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtCamera != null : "fx:id=\"txtCamera\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert nome != null : "fx:id=\"nome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert cognome != null : "fx:id=\"cognome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert telefono != null : "fx:id=\"telefono\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtNumero != null : "fx:id=\"txtNumero\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnInserisciPrivato != null : "fx:id=\"btnInserisciPrivato\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert azienda != null : "fx:id=\"azienda\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert iva != null : "fx:id=\"iva\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert indirizzo != null : "fx:id=\"indirizzo\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtAzienda != null : "fx:id=\"txtAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtIva != null : "fx:id=\"txtIva\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtIndirizzo != null : "fx:id=\"txtIndirizzo\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnInserisciAzienda != null : "fx:id=\"btnInserisciAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert ncamera != null : "fx:id=\"ncamera\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert dataCerca != null : "fx:id=\"dataCerca\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtDate != null : "fx:id=\"txtDate\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnDate != null : "fx:id=\"btnDate\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'HotelView.fxml'.";

	}
}
