package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.TextFieldSkin;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;



public class SceneController{
	
	private ChoiceBox<String> choice;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	 @FXML
	 
	 //背景
	 public void background() {
		 Image image = new Image(getClass().getResourceAsStream("background.jpeg"));
	 }
	 
	
	 
	 public void switchToStartPage(ActionEvent event) throws IOException {
	    	Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	
	
    public void switchToSelectPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("SelectPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		//image = new Image(getClass().getResourceAsStream("background.jpeg"));
	}
    
    
    
   
    
    public void closePage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ResultPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
    	stage.close();
    }
    
    public void switchToSodaPage(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("Soda.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToBlackTeaPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("BlackTea.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToGreenTeaPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("GreenTea.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToJuicePage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Juice.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToCoffeePage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Coffee.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToMilkTeaPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("MilkTea.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToFlavoredTeaPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("FlavoredTea.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToOtherTeaPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("OtherTea.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToFiberDrinksPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("FiberDrinks.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToWaterPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Water.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToSportsDrinkPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("SportsDrink.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToFlavoredMilkPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("FlavoredMilk.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToLaticBeveragePage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("LaticBeverage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToSparklingDrinksPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("SparklingDrinks.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
    public void switchToEnergyDrinksPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("EnergyDrinks.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	
	
    


	



}
