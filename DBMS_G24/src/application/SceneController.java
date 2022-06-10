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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController implements Initializable{
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Label myLabel;
	
	@FXML
	private ChoiceBox<String> weekChoice = new ChoiceBox<>();
	@FXML
	private ChoiceBox<String> timeChoice = new ChoiceBox<>();
	@FXML
	private ChoiceBox<String> peopleChoice = new ChoiceBox<>();
	@FXML
	private ChoiceBox<String> scoreChoice = new ChoiceBox<>();
	
	@FXML
	private Button orderButton;
	
	@FXML
	private AnchorPane bookingPane;
	
	
	private String[] week = {"一","二","三","四","五","六","日"};
	private String[] time = {"9","10","11","12","13","14","15","16","17","18","19","20","21"};
	private String[] people = {"1","2","3","4","5","6","7","8","9","10"};
	private String[] score = {"1","2","3","4","5"};

	
	
	public void switchToUserPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToUserBooking(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("UserBooking.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToUserComments(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("UserComments.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToRestaurantComment(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("RestaurantComment.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		weekChoice.getItems().addAll(week);
		timeChoice.getItems().addAll(time);
		peopleChoice.getItems().addAll(people);
		scoreChoice.getItems().addAll(score);
	}
	
	public void sendOrder(ActionEvent event) throws IOException {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("DBMS_G24訂位系統");
		alert.setHeaderText("你的訂位已成功送出");
		alert.setContentText("是否要結束系統");
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) bookingPane.getScene().getWindow();
			//System.out.print("你的訂位資訊已送出");
			stage.close();
		}
		else {
			Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
	}
	
	public void sendComment(ActionEvent event) throws IOException {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("DBMS_G24訂位系統");
		alert.setHeaderText("你的評論已成功送出");
		alert.setContentText("是否要結束系統");
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) bookingPane.getScene().getWindow();
			//System.out.print("你的訂位資訊已送出");
			stage.close();
		}
		else {
			Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
	}



}
