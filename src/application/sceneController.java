package application;

import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.TextField;

public class sceneController {
	
	@FXML
	TextField text_name;
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void login(ActionEvent e) throws Exception {
//		root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
		
		String username = text_name.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();
		scenecontroller2 scenecontroller2 = loader.getController();
		scenecontroller2.displayname(username);
		stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
}
