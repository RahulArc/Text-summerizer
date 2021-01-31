/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textsummarizer2.pkg0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button addDoc;
    
    @FXML
    private TextArea input, output;
    
    
    public void addDocAction(ActionEvent event) throws FileNotFoundException, IOException{
        FileChooser fc = new FileChooser();
        
        File file = fc.showOpenDialog(null);

        
        if(file != null){
            try{
                Scanner scan = new Scanner(file);
                
                StringBuilder str = new StringBuilder("");
                
                while(scan.hasNextLine()){
                    //str.append(scan.nextLine());
                    input.appendText(scan.nextLine()+"\n");
                }
                
                //input.setText(str.toString());
                
                
            }catch(FileNotFoundException e){
                // do dome error handling..
            }
         
        }else{
            // handle this.
        }
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    
}
