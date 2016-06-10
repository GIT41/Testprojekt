/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojekt;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rominakehl
 */
public class Testprojekt extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
    //Das hier ist unser Zahlenarray
    float [] numbers;
    numbers = new float[6];
    
    //Hier wird ein Rechner erzeugt, der die Werte in Methoden verarbeitet
    Rechner rechner = new Rechner();
    
    //Hier entstehen Textfelder, in denen Werte eingegeben werden können
    TextField textInput1 = new TextField("0");
    TextField textInput2 = new TextField("0");
    TextField textInput3 = new TextField("0");
    TextField textInput4 = new TextField("0");
    TextField textInput5 = new TextField("0");
    TextField textInput6 = new TextField("0");
    
    //Hier wrden die Zahlen alle mittig ins Textfeld geschrieben
    //textInput1.setAlignment(Pos.CENTER);
    //textInput2.setAlignment(Pos.CENTER);
    //textInput3.setAlignment(Pos.CENTER);
    textInput4.setAlignment(Pos.CENTER);
    textInput5.setAlignment(Pos.CENTER);
    textInput6.setAlignment(Pos.CENTER);
        
    //Jetzt entstehen die Buuton mit Beschriftung und Event, wenn sie geklickt werden 
    Button average = new Button();
    average.setText("Durchschnitt");
    average.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Durchschnitt");
            }
        });
        
        Button bubble = new Button();
        bubble.setText("Bubble");
        bubble.setOnAction((ActionEvent event) -> {
			float[] nums = new float[] {
				Float.valueOf(textInput1.getText()),
				Float.valueOf(textInput2.getText()),
				Float.valueOf(textInput3.getText()),
				Float.valueOf(textInput4.getText()),
				Float.valueOf(textInput5.getText()),
				Float.valueOf(textInput6.getText())
			};
			
			rechner.bubble(nums);
			textInput1.setText(Float.toString(nums[0]));
			textInput2.setText(Float.toString(nums[1]));
			textInput3.setText(Float.toString(nums[2]));
			textInput4.setText(Float.toString(nums[3]));
			textInput5.setText(Float.toString(nums[4]));
			textInput6.setText(Float.toString(nums[5]));
		});
        
        Button partner = new Button();
        partner.setText("Partnertausch");
        partner.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Partnertausch");
            }
        });
        
        Button swapFirstLast = new Button();
        swapFirstLast.setText("Erster ist Letzter");
        swapFirstLast.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Erster ist Letzter");
            }
        });
        
        Button haelfte = new Button();
        haelfte.setText("Hälfte");
        haelfte.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hälfte");
            }
        });
        
        Button zweimal = new Button();
        zweimal.setText("Mal 2");
        zweimal.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                //Einlesen der Zahlen und schrieben ins Array, Methodenaufruf und Ausgabe des Rückgabearrays
                float a = Float.valueOf(textInput1.getText());
                float b = Float.valueOf(textInput2.getText());
                float c = Float.valueOf(textInput3.getText());
                float d = Float.valueOf(textInput4.getText());
                float e = Float.valueOf(textInput5.getText());
                float f = Float.valueOf(textInput6.getText());
                numbers[0] = a;
                numbers[1] = b;
                numbers[2] = c;
                numbers[3] = d;
                numbers[4] = e;
                numbers[5] = f;
                
                float durchschnitt = rechner.malzwei(numbers);
                
                System.out.println(durchschnitt);
                
            }
        });
        
                
        Button selection = new Button();
        selection.setText("Selection");
        selection.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Selection");
            }
        });
        
    
           
        //GUI erstellen
        GridPane myGrid = new GridPane();
        myGrid.add(textInput1, 1, 1);
        myGrid.add(textInput2, 1, 2);
        myGrid.add(textInput3, 1, 3);
        myGrid.add(textInput4, 1, 4);
        myGrid.add(textInput5, 1, 5);
        myGrid.add(textInput6, 1, 6);
        myGrid.add(average, 2, 1);
        myGrid.add(bubble, 2, 2);
        myGrid.add(selection, 2, 3);
        myGrid.add(zweimal, 2, 4);
        myGrid.add(partner, 2, 5);
        myGrid.add(swapFirstLast, 2, 6);
        myGrid.add(haelfte, 3, 1);
   
              
        Scene scene = new Scene(myGrid, 600, 250);
        
        primaryStage.setTitle("Werteverwerter");
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }

    
}
