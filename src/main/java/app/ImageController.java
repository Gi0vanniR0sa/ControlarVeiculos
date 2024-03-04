/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController implements Initializable {

    @FXML
    private ImageView imageView;
    
    @FXML
    private Button button;
    
    Image image = new Image(getClass().getResourceAsStream("cadeado.png"));
    Image image2 = new Image(getClass().getResourceAsStream("sistemaGerenciamento.png"));
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
