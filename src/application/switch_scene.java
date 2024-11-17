package application;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.fxml.*;
public class switch_scene extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
			Scene scene = new Scene(root);
			
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
