package application;

import javafx.application.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.*;

import javafx.stage.*;



public class css_styling extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getResource("css_styling.fxml"));
			Scene scene = new Scene(root);
			String css = getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			stg.setScene(scene);
			stg.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
