/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malanasobilka;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

/**
 *
 * @author Tom
 */
public class NasobilkaFormController implements Initializable {

    private int maximalniCislo = 10;

    public int getMaximalniCislo() {
        return maximalniCislo;
    }

    public void setMaximalniCislo(int maximalniCislo) {
        this.maximalniCislo = maximalniCislo;
        znovu();
    }
    private boolean jdeONasobeni = true;

    public boolean isJdeONasobeni() {
        return jdeONasobeni;
    }

    public void setJdeONasobeni(boolean jdeONasobeni) {
        this.jdeONasobeni = jdeONasobeni;
        znovu();
    }

    private boolean jdeOOpacnouOperaci = false;

    public boolean isJdeOOpacnouOperaci() {
        return jdeOOpacnouOperaci;
    }

    public void setJdeOOpacnouOperaci(boolean jdeOOpacnouOperaci) {
        this.jdeOOpacnouOperaci = jdeOOpacnouOperaci;
        znovu();
    }
    private boolean jdeOTezsiVerzi = false;

    public boolean isJdeOTezsiVerzi() {
        return jdeOTezsiVerzi;
    }

    public void setJdeOTezsiVerzi(boolean jdeOTezsiVerzi) {
        this.jdeOTezsiVerzi = jdeOTezsiVerzi;
        zobraz();
        
    }
    

    @FXML
    private TextField priklad;
    @FXML
    private TextField zadanyVysledek;
    @FXML
    private TextField cas;
    @FXML
    private Label zbyva;
@FXML
private Button vyhodnotit;
    @FXML
    private TextField vysledek;
    @FXML
    private Button prvni;
    @FXML
    private Button znovu;
    @FXML
    private Button druhy;
    @FXML
    private Button treti;
    @FXML
    private Button ctvrty;
    @FXML
    private Button dalsi;

    private int spravnyVysledek;

    int spravneZbyva = 10;
private Button ktereJeSpravne(){
    if (prvni.getText().equals(""+spravnyVysledek) ){
     return prvni;   
    }
    if (druhy.getText().equals(""+spravnyVysledek)){
     return druhy;   
    }
    if (treti.getText().equals(""+spravnyVysledek)){
     return treti;   
    }if (ctvrty.getText().equals(""+spravnyVysledek)){
     return ctvrty;   
    }
    return null;
}
private void zobraz(){
    prvni.setVisible(!jdeOTezsiVerzi);
    druhy.setVisible(!jdeOTezsiVerzi);
    treti.setVisible(!jdeOTezsiVerzi);
    ctvrty.setVisible(!jdeOTezsiVerzi);
    zadanyVysledek.setVisible(jdeOTezsiVerzi); 
     vyhodnotit.setDisable(!jdeOTezsiVerzi);
     vyhodnotit.setVisible(jdeOTezsiVerzi);
}
    @FXML
    private void zmacknuti(ActionEvent event) {
        Button b = (Button) event.getTarget();
        nastavitCas();
       
if(jdeOTezsiVerzi){
    
      if (zadanyVysledek.getText().equals("" + spravnyVysledek)) {
          spravneZbyva--;
            vysledek.setText("správně");
            vysledek.setStyle("-fx-background-color: #00ff00; ");
            
        } else {
            vysledek.setText("špatně, správná odpověď je: "+ spravnyVysledek);
            vysledek.setStyle("-fx-background-color: #ff0000; ");
        }
}else{
        if (b.getText().equals("" + spravnyVysledek)) {
            spravneZbyva--;
            vysledek.setText("správně");
            b.setStyle("-fx-background-color: #00ff00; ");
        } else {
            vysledek.setText("špatně");
            b.setStyle("-fx-background-color: #ff0000; ");
            ktereJeSpravne().setStyle("-fx-background-color: #00ff00; ");
        }
        
}
zneaktivnit(true);
        
        dalsi.setVisible(true);
        
        if (spravneZbyva == 0) {
            priklad.setText("KONEC");
            znovu.setVisible(true);
            dalsi.setVisible(false);

        }
        zbyva.setText("" + spravneZbyva);
    }

    private void zneaktivnit(boolean neaktivni) {
        prvni.setDisable(neaktivni);
        druhy.setDisable(neaktivni);
        treti.setDisable(neaktivni);
        ctvrty.setDisable(neaktivni);
        zadanyVysledek.setDisable(neaktivni);
        vyhodnotit.setDisable(neaktivni || !jdeOTezsiVerzi);
    }

    @FXML
    private void znovu() {
        generovatPriklad();
        spravneZbyva = 10;
        startTime = System.currentTimeMillis();
        nastavitCas();
        zbyva.setText("" + spravneZbyva);
    }

    private void nastavitCas() {
        long stopTime = System.currentTimeMillis();
        long duration = stopTime - startTime;
        cas.setText("" + duration / 1000);
    }

    @FXML
    private void generovatPriklad() {
        prvni.setStyle("-fx-background-color: transparent;");
        druhy.setStyle("-fx-background-color: transparent;");
        treti.setStyle("-fx-background-color: transparent;");
        ctvrty.setStyle("-fx-background-color: transparent;");
        dalsi.setVisible(false);
        znovu.setVisible(false);
        zadanyVysledek.setText("");

        int randomNum = ThreadLocalRandom.current().nextInt(0, maximalniCislo)+1;
        int randomNum2 = ThreadLocalRandom.current().nextInt(0, maximalniCislo)+1;
        if(jdeOOpacnouOperaci){
            if (jdeONasobeni) {
            priklad.setText(randomNum * randomNum2 + " : "  + randomNum);
            spravnyVysledek = randomNum2;

        } else {
            priklad.setText(randomNum + randomNum2 + " - " + randomNum);
            spravnyVysledek = randomNum2;
           
        } 
        }else{
            
        
        if (jdeONasobeni) {
            priklad.setText(randomNum + " * " + randomNum2);
            spravnyVysledek = randomNum * randomNum2;

        } else {
            priklad.setText(randomNum + " + " + randomNum2);
            spravnyVysledek = randomNum + randomNum2;
        }
        }
        priklady();
        zneaktivnit(false);

    }
    long startTime = System.currentTimeMillis();

    private void priklady() {

        int[] vysledky = new int[4];
        for (int i = 0; i < vysledky.length; i++) {

            int randomNum;
            if (jdeOOpacnouOperaci) {
                randomNum = ThreadLocalRandom.current().nextInt(0, maximalniCislo)+1;
            } else {

                if (jdeONasobeni) {

                    randomNum = ThreadLocalRandom.current().nextInt(0, maximalniCislo * maximalniCislo)+1;
                } else {
                    randomNum = ThreadLocalRandom.current().nextInt(0, maximalniCislo + maximalniCislo)+1;
                }
            }
            vysledky[i] = randomNum;
            for (int j = 0; j < i; j++) {
                if (vysledky[j] == randomNum) {
                    i--;
                    break;
                }
            }

        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
        vysledky[randomNum] = spravnyVysledek;

        prvni.setText("" + vysledky[0]);
        druhy.setText("" + vysledky[1]);
        treti.setText("" + vysledky[2]);
        ctvrty.setText("" + vysledky[3]);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        vysledek.setEditable(false);
        priklad.setEditable(false);

        cas.setEditable(false);
        znovu();
        // TODO
    }

}
