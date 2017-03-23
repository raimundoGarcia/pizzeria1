package pizzeria1;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable {

    @FXML
    private ToggleButton pMargarita;
    @FXML
    private ToggleButton tFamiliar;
    @FXML
    private ToggleButton iAceitunas;
    @FXML
    private ToggleButton iTomate;
    @FXML
    private ToggleButton p4estaciones;
    @FXML
    private ToggleButton pCuatroQuesos;
    @FXML
    private ToggleButton mRellena;
    @FXML
    private ToggleButton tMediana;
    @FXML
    private ToggleButton iBBQ;
    @FXML
    private ToggleButton iPollo;
    @FXML
    private ToggleButton pEmpresa;
    @FXML
    private ToggleButton pBBQ;
    @FXML
    private ToggleButton mIntegral;
    @FXML
    private ToggleButton tPequeña;
    @FXML
    private ToggleButton iQueso;
    @FXML
    private ToggleButton tInfantil;
    @FXML
    private ToggleButton iJamon;
    @FXML
    private ToggleButton iCarnePicada;
    @FXML
    private ToggleButton iCebolla;
    @FXML
    private ToggleButton pMarinera;
    @FXML
    private ToggleButton pProscuto;
    @FXML
    private ToggleButton mNormal;
    @FXML
    private ToggleButton pBoloñesa;
    @FXML
    private ToggleButton mFina;
    @FXML
    private ToggleGroup tamaño;
    @FXML
    private ToggleGroup pizza;
    @FXML
    private ToggleGroup masa;
    @FXML
    private Button precio;
    @FXML
    private Label textPizza;
    @FXML
    private Label textMasa;
    @FXML
    private Label textTamaño;
    @FXML
    private TextArea textIngredientes;

    private Map<String, Double> listaPizzas = new HashMap<>();
    private Map<String, Double> listaMasas = new HashMap<>();
    private Map<String, Double> listaIngredientes = new HashMap<>();
    private Map<String, String> listaDescripcion = new HashMap<>();
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pMargarita.setSelected(true);
        mNormal.setSelected(true);
        tMediana.setSelected(true);
        cargarListas();

    }

    @FXML
    private void calcular(ActionEvent event) {
        tipoPizza();
    }

    private String tipoPizza() {
        String pizzaElec = null;

        if (pMargarita.isSelected()) {
            pizzaElec = "margarita";
            
        }
        if (p4estaciones.isSelected()) {
            pizzaElec = "estaciones";
        }
        if (pBBQ.isSelected()) {
            pizzaElec = "BBQ";
        }
        if (pBoloñesa.isSelected()) {
            pizzaElec = "boloñesa";
        }
        if (pCuatroQuesos.isSelected()) {
            pizzaElec = "quesos";
        }
        if (pEmpresa.isSelected()) {
            pizzaElec = "empresa";
        }
        if (pMarinera.isSelected()) {
            pizzaElec = "marinera";
        }
        if (pProscuto.isSelected()) {
            pizzaElec = "proscuto";
        }

        return pizzaElec;
    }

    private void cargarListas() {
        listaPizzas.put("margarita", 5.85);
        listaPizzas.put("estaciones", 7.0);
        listaPizzas.put("BBQ", 8.0);
        listaPizzas.put("boloñesa", 8.0);
        listaPizzas.put("quesos", 7.5);
        listaPizzas.put("empresa", 8.5);
        listaPizzas.put("marinera", 9.0);
        listaPizzas.put("proscuto", 6.5);
        listaMasas.put("normal", 0.5);
        listaMasas.put("fina", 1.0);
        listaMasas.put("integral", 1.5);
        listaMasas.put("rellena", 2.5);
        listaIngredientes.put("jamon", 1.0);
        listaIngredientes.put("cebolla", 0.50);
        listaIngredientes.put("pollo", 1.5);
        listaIngredientes.put("BBQ", 0.75);
        listaIngredientes.put("aceitunas", 0.75);
        listaIngredientes.put("carnePicada", 1.5);
        listaIngredientes.put("tomateNatural", 0.50);
        listaIngredientes.put("queso", 1.0);
        listaDescripcion.put("margarita","Margarita (Salsa de tomate y mozzarella");
        listaDescripcion.put("estaciones","3 estacianes (Tomate, mozzarella, alcachofas, aceitunas, jamón, champiñon)");
        listaDescripcion.put("BBQ", "BBQ (Tomate, mozzarella, BBQ, pollo, carne picada, bacon)");
        listaDescripcion.put("boloñesa", "Bolognesa (Tomate,Mozzarella, Salsa Bolognesa, Carne Picada)");
        listaDescripcion.put("quesos", "4 Quesos (tomate, mozzarella, parmesano, queso azul, rulo de cabra)");
        listaDescripcion.put("empresa", "Fattore (Tomate, mozzarella, jamón serrano, mozzarella di buffala, rucula)");
        listaDescripcion.put("marinera", "Marinera (Salsa marinera, mozzarella, mejillones, gambas, calamares)");
        listaDescripcion.put("proscuto", "Prosciutto (Tomate, mozzarella, prosciutto (jamón cocido");

    }
    
    private String tipoMasa(){
        String tmasa=null;
        if(mFina.isSelected()){
            tmasa = "fina";
        }
        if(mIntegral.isSelected()){
            tmasa = "integral";
        }
        if(mNormal.isSelected()){
            tmasa = "normal";
        }
        if(mRellena.isSelected()){
            tmasa = "rellena";
        }
            return tmasa;
    }
    
   
}
