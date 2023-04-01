package com.example.uml_tool;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.IOException;


public class UMLController {

@FXML
private HBox B;
        public void ButtonHovered(MouseEvent e)

        {
                System.out.println("Hovered");
           //     setBackground(new Background(new BackgroundFill(Color.RED, null, null)));

        }
        public void ButtonHover(MouseEvent e)

        {
                System.out.println("Hover");
                //     setBackground(new Background(new BackgroundFill(Color.RED, null, null)));

        }
public void Bold(MouseEvent e)
{
        System.out.println("Bold");
}
public void Exit(ActionEvent e) throws IOException
{
        try
        {
                Stage pstage = (Stage) B.getScene().getWindow();
                pstage.close();
                Parent root = FXMLLoader.load(getClass().getResource("UmlView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();}
        catch(Exception er) {
                System.out.println("Error found");
        }
}

        }
