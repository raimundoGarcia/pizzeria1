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
    private Map<String, Double> listaTamaños = new HashMap<>();
    @FXML
    private Label precioPizza;
    @FXML
    private Label precioMasa;
    @FXML
    private Label precioTamaño;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pMargarita.setSelected(true);
        mNormal.setSelected(true);
        tMediana.setSelected(true);
        cargarListas();

    }

    @FXML
    private void calcular(ActionEvent event) {
        textPizza.setText(listaDescripcion.get(tipoPizza()));
        textTamaño.setText("Tamaño " + tipoTamaño());
        textMasa.setText("Masa tipo " + tipoMasa());
        precioPizza.setText(String.valueOf(listaPizzas.get(tipoPizza())));
        precioMasa.setText(String.valueOf(listaMasas.get(tipoMasa())));
        precioTamaño.setText(String.valueOf(listaTamaños.get(tipoTamaño())));
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
        listaDescripcion.put("margarita", "Margarita (Salsa de tomate y mozzarella)");
        listaDescripcion.put("estaciones", "3 Estaciones (Tomate, mozzarella, alcachofas, aceitunas, jamón, champiñon)");
        listaDescripcion.put("BBQ", "BBQ (Tomate, mozzarella, BBQ, pollo, carne picada, bacon)");
        listaDescripcion.put("boloñesa", "Bolognesa (Tomate,Mozzarella, Salsa Bolognesa, Carne Picada)");
        listaDescripcion.put("quesos", "4 Quesos (tomate, mozzarella, parmesano, queso azul, rulo de cabra)");
        listaDescripcion.put("empresa", "Fattore (Tomate, mozzarella, jamón serrano, mozzarella di buffala, rucula)");
        listaDescripcion.put("marinera", "Marinera (Salsa marinera, mozzarella, mejillones, gambas, calamares)");
        listaDescripcion.put("proscuto", "Prosciutto (Tomate, mozzarella, prosciutto (jamón cocido");
        listaTamaños.put("infantil",0.5);
        listaTamaños.put("pequeña",1.0);
        listaTamaños.put("mediana",1.25);
        listaTamaños.put("familiar",1.5);

    }

    private String tipoMasa() {
        String tmasa = null;
        if (mFina.isSelected()) {
            tmasa = "fina";
        }
        if (mIntegral.isSelected()) {
            tmasa = "integral";
        }
        if (mNormal.isSelected()) {
            tmasa = "normal";
        }
        if (mRellena.isSelected()) {
            tmasa = "rellena";
        }
        return tmasa;
    }
    private String tipoTamaño(){
        String tTamaño = null;
        if(tFamiliar.isSelected()){
            tTamaño="familiar";
        }
        if(tMediana.isSelected()){
            tTamaño="mediana";
        }
        if(tInfantil.isSelected()){
            tTamaño="infantil";
        }
        if(tPequeña.isSelected()){
            tTamaño="pequeña";
        }
        return tTamaño;
    }
     

    @FXML
    private void seleccion(ActionEvent event) {
        bordePizza();
        bordeIngredientes();
        bordeMasa();
        bordeTamaño();
    }

    private void bordePizza() {
        if (pMargarita.isSelected()) {
            pMargarita.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pMargarita.setStyle("");
        }
        if (p4estaciones.isSelected()) {
            p4estaciones.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            p4estaciones.setStyle("");
        }
        if (pBBQ.isSelected()) {
            pBBQ.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pBBQ.setStyle("");
        }
        if (pBoloñesa.isSelected()) {
            pBoloñesa.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pBoloñesa.setStyle("");
        }
        if (pCuatroQuesos.isSelected()) {
            pCuatroQuesos.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pCuatroQuesos.setStyle("");
        }
        if (pEmpresa.isSelected()) {
            pEmpresa.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pEmpresa.setStyle("");
        }
        if (pMarinera.isSelected()) {
            pMarinera.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pMarinera.setStyle("");
        }
        if (pProscuto.isSelected()) {
            pProscuto.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            pProscuto.setStyle("");
        }
    }

    private void bordeMasa() {

        if (mFina.isSelected()) {
            mFina.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            mFina.setStyle("");
        }
        if (mNormal.isSelected()) {
            mNormal.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            mNormal.setStyle("");
        }
        if (mIntegral.isSelected()) {
            mIntegral.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            mIntegral.setStyle("");
        }
        if (mRellena.isSelected()) {
            mRellena.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            mRellena.setStyle("");
        }
    }

    private void bordeIngredientes() {
        
        if (iAceitunas.isSelected()) {
            iAceitunas.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iAceitunas.setStyle("");
        }
        if (iBBQ.isSelected()) {
            iBBQ.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iBBQ.setStyle("");
        }
        if (iCarnePicada.isSelected()) {
            iCarnePicada.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iCarnePicada.setStyle("");
        }
        if (iCebolla.isSelected()) {
            iCebolla.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iCebolla.setStyle("");
        }
        if (iJamon.isSelected()) {
            iJamon.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iJamon.setStyle("");
        }
        if (iPollo.isSelected()) {
            iPollo.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iPollo.setStyle("");
        }
        if (iQueso.isSelected()) {
            iQueso.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iQueso.setStyle("");
        }
        if (iTomate.isSelected()) {
            iTomate.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            iTomate.setStyle("");
        }

    }
    private void bordeTamaño(){
      
         if (tFamiliar.isSelected()) {
            tFamiliar.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            tFamiliar.setStyle("");
        }
          if (tMediana.isSelected()) {
            tMediana.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            tMediana.setStyle("");
        }
           if (tPequeña.isSelected()) {
            tPequeña.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            tPequeña.setStyle("");
        }
            if (tInfantil.isSelected()) {
            tInfantil.setStyle("-fx-border-width:3px;-fx-border-color:red;");
        } else {
            tInfantil.setStyle("");
        }
    }
}
