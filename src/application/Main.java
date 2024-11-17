package application;
	


//import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
//import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.Label;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.image.Image;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;


public class Main extends Application {
	@Override
	public void start(Stage stg) throws Exception {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root, Color.BLACK);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			stg.setScene(scene);
//			stg.setTitle("Hello JavaFX");
//			stg.show();
//			stg.getIcons().add(new Image("telegram.png"));
//			stg.setWidth(400);
//			stg.setHeight(400);
//			stg.setResizable(false);
////			stg.setX(50);
////			stg.setY(50);\
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		 stg.setTitle("Hello JavaFX!");
//
//	        StackPane root = new StackPane();
//	        root.getChildren().add(new Label("Chào mừng đến với JavaFX"));
//
//	        Scene scene = new Scene(root, 300, 200);
//
//	        stg.setScene(scene);
//	        stg.show();
//		Parent root = FXMLLoader.load(getClass().getResource("image.fxml"));
//		Scene scene = new Scene(root);
//		
//		
//		
//		stg.setScene(scene);
//		stg.show();
		
		
		
//		Parent root = FXMLLoader.load(getClass().getResource("textfield.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("checkbox.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("radiobutton.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("datepicker.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("choicebox.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("slider.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("progressbar.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("menubar.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
		Parent root = loader.load();
		Controller controller = loader.getController();
		Scene scene = new Scene(root);
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getCode()) {
					case UP:
						controller.moveup();
						break;
					case DOWN:
						controller.movedown();
						break;
					case LEFT:
						controller.moveleft();
						break;
					case RIGHT:
						controller.moveright();
						break;
					default :
						break;
				}
			}
			
		});
		stg.setScene(scene);
		stg.show();
	}
//	
//	public void logout (Stage stage) {
//		
//		Alert alert = new Alert(AlertType.CONFIRMATION);
//		alert.setTitle("Logout!");
//		alert.setHeaderText("You're about to logout!");
//		alert.setContentText("Do you want to save before exit?");
//		
//		if (alert.showAndWait().get() == ButtonType.OK) {
//			System.out.println("Logout successfully!");
//			stage.close();
//		} 
//	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
