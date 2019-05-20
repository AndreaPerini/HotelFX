/**
 * Sample Skeleton for 'HotelView.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
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

    @FXML // fx:id="txtNome"
    private TextField txtNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtCognome"
    private TextField txtCognome; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumero"
    private TextField txtNumero; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisciCliente"
    private Button btnInserisciCliente; // Value injected by FXMLLoader

    @FXML // fx:id="txtAzienda"
    private TextField txtAzienda; // Value injected by FXMLLoader

    @FXML // fx:id="txtIva"
    private TextField txtIva; // Value injected by FXMLLoader

    @FXML // fx:id="txtIndirizzo"
    private TextField txtIndirizzo; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisciAzienda"
    private Button btnInserisciAzienda; // Value injected by FXMLLoader

    @FXML // fx:id="btnCamera"
    private Button btnCamera; // Value injected by FXMLLoader

    @FXML // fx:id="data"
    private DatePicker data; // Value injected by FXMLLoader

    @FXML // fx:id="txtCalendario"
    private TextArea txtCalendario; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtNumero != null : "fx:id=\"txtNumero\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert btnInserisciCliente != null : "fx:id=\"btnInserisciCliente\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtAzienda != null : "fx:id=\"txtAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtIva != null : "fx:id=\"txtIva\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtIndirizzo != null : "fx:id=\"txtIndirizzo\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert btnInserisciAzienda != null : "fx:id=\"btnInserisciAzienda\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert btnCamera != null : "fx:id=\"btnCamera\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert data != null : "fx:id=\"data\" was not injected: check your FXML file 'HotelView.fxml'.";
        assert txtCalendario != null : "fx:id=\"txtCalendario\" was not injected: check your FXML file 'HotelView.fxml'.";

    }
}
