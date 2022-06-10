package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.fxml.*;
public class Main extends Application {
	
	public void start(Stage stage) throws Exception {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			stage.setResizable(false);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		 
	}
	public static void main(String[] args) throws Exception {
		//getConnection();
		
		launch(args);
		
    }
	
	/*public static Connection getConnection() throws Exception {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://140.119.19.73:9306/TG08", "TG08", "fyr0v7");  
		  System.out.println("Success");
		  return conn;
		 }*/

	
	
}
		
		/*Group root = new Group();
		
		Scene scene = new Scene(root,600,600);*/
		
		
		
		/*Text text = new Text();
		text.setText("銀料省很大");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.WHITE);
		
		Line line = new Line();
		line.setStartX(50);
		line.setStartY(75);
		line.setEndX(300);
		line.setEndY(75);
		line.setStrokeWidth(5);
		line.setStroke(Color.WHITE);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setStrokeWidth(5);
		rectangle.setWidth(50);
		rectangle.setHeight(50);
		rectangle.setFill(Color.WHITE);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				200.0,200.0,
				300.0,300.0,
				200.0,300.0
				);
		triangle.setFill(Color.AQUAMARINE);
		
		Circle circle = new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.BLUEVIOLET);
		
		Image icon = new Image("meow.jpg");
		primaryStage.getIcons().add(icon);
		
		Image image = new Image("wei.jpg");
		ImageView imageView = new ImageView(image);
		
		imageView.setX(350);
		imageView.setY(350);
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);*/
		
		
		
		
        /*primaryStage.setScene(scene);
		
		primaryStage.show();*/
		/*Image icon = new Image("meow.jpg");
		primaryStage.getIcons().add(icon);
		
		
		primaryStage.setTitle("Final Project");
		primaryStage.setWidth(420);
		primaryStage.setHeight(420);
		
		primaryStage.setFullScreen(true);
		primaryStage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press f");
		primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f"));//跳出全螢幕
		
		primaryStage.setScene(scene);
		primaryStage.show();*/
	
	
	

