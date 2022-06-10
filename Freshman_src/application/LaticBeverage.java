package application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LaticBeverage {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Button b;
	
	 //背景
	public void background() {
		Image image = new Image(getClass().getResourceAsStream("background.jpeg"));
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
