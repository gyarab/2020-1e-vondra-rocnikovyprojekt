/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malanasobilka;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tom
 */
public class UvodFormController implements Initializable {
    @FXML
    private CheckBox tezsiVerze; 
    @FXML
   private void malaNasobilkaNasobeni(ActionEvent event){
        Parent root;
        try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(10);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            Stage stage = new Stage();
            stage.setTitle("Malá Násobilka");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void malaNasobilkaDeleni(ActionEvent event){
        Parent root;
        try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(10);
            
            controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeOOpacnouOperaci(true);
            Stage stage = new Stage();
            stage.setTitle("Malá Násobilka dělení");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
@FXML
   private void velkaNasobilkaNasobeni(ActionEvent event){
          Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(20);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            //root = FXMLLoader.load(getClass().getResource("NasobilkaForm.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Velká Násobilka násobení");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void velkaNasobilkaDeleni(ActionEvent event){
        Parent root;
        try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(20);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeOOpacnouOperaci(true);
            Stage stage = new Stage();
            stage.setTitle("Velká Násobilka dělení");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void scitaniDoSta(ActionEvent event){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(100);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeONasobeni(false);
            Stage stage = new Stage();
            stage.setTitle("Sčítání do sta");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void odecitaniDoSta(ActionEvent event){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(100);
            controller.setJdeOOpacnouOperaci(true);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeONasobeni(false);
            Stage stage = new Stage();
            stage.setTitle("Odečítání do sta");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void scitaniDoDeseti(ActionEvent event){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(10);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeONasobeni(false);
            Stage stage = new Stage();
            stage.setTitle("Sčítání do deseti");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
   @FXML
   private void odecitaniDoDeseti(ActionEvent event){
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NasobilkaForm.fxml"));
            root =loader.load();
            NasobilkaFormController controller = loader.getController();
            controller.setMaximalniCislo(10);
              controller.setJdeOTezsiVerzi(tezsiVerze.isSelected());
            controller.setJdeOOpacnouOperaci(true);
            controller.setJdeONasobeni(false);
            Stage stage = new Stage();
            stage.setTitle("Odečítání do deseti");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
