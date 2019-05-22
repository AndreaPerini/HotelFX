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

	@FXML // fx:id="txtDataInizio"
	private TextField txtDataInizio; // Value injected by FXMLLoader

	@FXML // fx:id="txtDataFine"
	private TextField txtDataFine; // Value injected by FXMLLoader

	@FXML // fx:id="txtNome"
	private TextField txtNome; // Value injected by FXMLLoader

	@FXML // fx:id="txtCognome"
	private TextField txtCognome; // Value injected by FXMLLoader

	@FXML // fx:id="txtNumero"
	private TextField txtNumero; // Value injected by FXMLLoader

	@FXML // fx:id="btnInserisciPrivato"
	private Button btnInserisciPrivato; // Value injected by FXMLLoader

	@FXML // fx:id="txtAzienda"
	private TextField txtAzienda; // Value injected by FXMLLoader

	@FXML // fx:id="txtIva"
	private TextField txtIva; // Value injected by FXMLLoader

	@FXML // fx:id="txtIndirizzo"
	private TextField txtIndirizzo; // Value injected by FXMLLoader

	@FXML // fx:id="btnInserisciAzienda"
	private Button btnInserisciAzienda; // Value injected by FXMLLoader

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
	private Cliente c;

	@FXML
	void insertAzienda(ActionEvent event) {
		a = new Azienda();
		a.setNomeAzienda(txtAzienda.getText());
		a.setPartitaIVA(Integer.parseInt(txtIva.getText()));
		a.setIndirizzoFatturazione(txtIndirizzo.getText());
	}

	@FXML
	void insertPrivato(ActionEvent event) {

	}

	@FXML
	void searchDate(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtDataInizio != null : "fx:id=\"txtDataInizio\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtDataFine != null : "fx:id=\"txtDataFine\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtNumero != null : "fx:id=\"txtNumero\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnInserisciPrivato != null : "fx:id=\"btnInserisciPrivato\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtAzienda != null : "fx:id=\"txtAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtIva != null : "fx:id=\"txtIva\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtIndirizzo != null : "fx:id=\"txtIndirizzo\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnInserisciAzienda != null : "fx:id=\"btnInserisciAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtDate != null : "fx:id=\"txtDate\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert btnDate != null : "fx:id=\"btnDate\" was not injected: check your FXML file 'HotelView.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'HotelView.fxml'.";

	}
}