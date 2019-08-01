package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileWriter;


public class Controller {

    @FXML
    private JFXButton saveBtn, cancelBtn;

    @FXML
    private JFXTextArea contentArea;

    @FXML
    void saveAction(ActionEvent event) {
        try {
            System.out.println("save....");
            String content = contentArea.getText();
            File file = new File("D:\\test.txt");
            FileWriter out = new FileWriter(file);
            out.write(content);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
