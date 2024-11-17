package application;
import javafx.fxml.*;
import javafx.scene.control.*;
public class scenecontroller2 {
	@FXML
	Label namelabel;
	
	public void displayname(String username) {
		namelabel.setText("Hello " + username); 
	}
}
