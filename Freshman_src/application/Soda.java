package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Soda {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	
	Button b;
	
	 //背景
	public void background() {
		Image image = new Image(getClass().getResourceAsStream("background.jpeg"));
    }
	
	public void drinksPicture() {
		Image meow1 = new Image(getClass().getResourceAsStream("雪碧2000ml.jpeg"));
	}
	
	
		 
	public void switchToSelectPage(ActionEvent event) throws IOException {
	    	Parent root = FXMLLoader.load(getClass().getResource("SelectPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	
	
	public void switchToResultPage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ResultPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void comparison(ActionEvent event) throws IOException, SQLException {
		
		b = (Button)event.getSource();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultPage.fxml"));
		
		root = loader.load();
		ResultPage r = loader.getController();
		
	    
		//呼叫getDrinkData的code, b.getText()是按鈕上的飲料名稱
		r.changeName(b.getText());
		r.getDrinkData(b.getText());
		r.Draw();
		
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	



	
}
