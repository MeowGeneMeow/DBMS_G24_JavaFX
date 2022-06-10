package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ResultPage {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	private Button b;
	
	private static String url;
	private static String username="TG08";
	private static String password="fyr0v7";
	private static Connection conn;
	
	
	private Drinks meowDrink;
	
	private String ID,name,px_price,fm_price,sv_price,calories;

	@FXML
	Label drinksLabel,caloriesLabel,priceLabel;
	
	@FXML
	private BarChart<?,?> PriceChart;
	
	@FXML
	private CategoryAxis x;
	
	@FXML
	private NumberAxis y;
	
	//Connect to the server
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
	
	public void getDrinkData(String name) throws SQLException {
		
		getConnection();
		
		String query = "SELECT * FROM Drinks WHERE Name = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, name);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			String drinksName = rs.getString("Name");
			String drinkID = rs.getString("ID");
			String px_price = rs.getString("px_price");
			String sv_price = rs.getString("sv_price");
			String fm_price = rs.getString("fm_price");
			String calories = rs.getString("Calories");
		    meowDrink = new Drinks(drinkID,drinksName,px_price,sv_price,fm_price,calories);
		    
		    
		    this.ID = meowDrink.getID();
		    this.name = meowDrink.getName();
		    this.px_price = meowDrink.getPX_price();
		    this.fm_price = meowDrink.getFM_price();
		    this.sv_price = meowDrink.getSV_price();
		    this.calories = meowDrink.getCalories();
			
		}
		
	}
	
	public void Draw() {

		XYChart.Series set1 = new XYChart.Series<>();
		XYChart.Series set2 = new XYChart.Series<>();
		if(px_price.equals("")) {
			px_price = "0";
			if(Integer.parseInt(sv_price)>Integer.parseInt(fm_price)) {
				set1.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set2.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
			}
			else if(Integer.parseInt(sv_price)<Integer.parseInt(fm_price)) {
				set2.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set1.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
				
			}
			else {
				set2.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set2.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
			}
			
			/*set1.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
			set1.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
			set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
			PriceChart.getData().addAll(set1,set2);*/
			
			//Integer.parseInt(sv_price)
			//Integer.parseInt(fm_price)
			//Integer.parseInt(px_price)
			
		}else {
			if(Integer.parseInt(px_price)<Integer.parseInt(sv_price) && Integer.parseInt(px_price)<Integer.parseInt(fm_price)) {
				set1.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set1.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set2.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
			}
			else if(Integer.parseInt(sv_price)<Integer.parseInt(px_price) && Integer.parseInt(sv_price)<Integer.parseInt(fm_price)) {
				set2.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set1.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
			}
			else if(Integer.parseInt(fm_price)<Integer.parseInt(sv_price) && Integer.parseInt(fm_price)<Integer.parseInt(px_price)) {
				set1.getData().add(new XYChart.Data("Seven", Integer.parseInt(sv_price)));
				set2.getData().add(new XYChart.Data("Family", Integer.parseInt(fm_price)));
				set1.getData().add(new XYChart.Data("PX Mart", Integer.parseInt(px_price)));
				PriceChart.getData().addAll(set1,set2);
			}
			
			
		}
		
		
		caloriesLabel.setText("卡路里："+ calories);
		String priceInfo = "";
		priceInfo = "價錢";
		if(px_price.equals("0")) {
			priceInfo+="\n"+"7-11："+sv_price+"元";
			priceInfo+="\n"+"全家："+fm_price+"元";
			priceInfo+="\n"+"全聯：沒有販售";
		}
		else {
			priceInfo+="\n"+"7-11："+sv_price+"元";
			priceInfo+="\n"+"全家："+fm_price+"元";
			priceInfo+="\n"+"全聯："+px_price+"元";
		}
		priceLabel.setText(priceInfo);
		
		
	}
	
	public void background() {
		Image image = new Image(getClass().getResourceAsStream("background.jpeg"));
    }
	
	
	public void changeName(String name) {
		drinksLabel.setText(name + "的比價");
	}
	

	public void switchToSelectPage(ActionEvent event) throws IOException {
	    	Parent root = FXMLLoader.load(getClass().getResource("SelectPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	
	public void closePage(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ResultPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
    	stage.close();
    }
	
	 //搜尋
	 public void search(ActionEvent event) throws SQLException, IOException {
		   getConnection();
		
		 
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
