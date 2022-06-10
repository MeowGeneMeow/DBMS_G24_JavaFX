package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;


public class SelectPage implements Initializable{
	
	private Button button;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	private static String url;
	private static String username="TG08";
	private static String password="fyr0v7";
	private static Connection conn;
	
	@FXML
	private ChoiceBox<String> choice;
	
	public void getConnection() throws SQLException {
		String server = "jdbc:mysql://140.119.19.73:9306/";
		String database = "TG08";
		String config = "?useUnicode=true&characterEncoding=utf8";
		
		url = server + database + config;
		username = "TG08";
		password = "fyr0v7";
		conn = null;
		this.initializing();
	}
	
    private void initializing() throws SQLException {
		
		conn = DriverManager.getConnection(url, username, password);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			getConnection();
			String query = "SELECT Name FROM Drinks";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				choice.getItems().add(rs.getString(1));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void search(ActionEvent event) throws SQLException, IOException {
		button = (Button)event.getSource();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ResultPage.fxml"));
		
		root = loader.load();
		ResultPage r = loader.getController();
		
		String name = choice.getValue();
		
		
		//呼叫getDrinkData的code, name是choiceBox上的飲料名稱
		r.changeName(name);
		r.getDrinkData(name);
		r.Draw();
		
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
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
