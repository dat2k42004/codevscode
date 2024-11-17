package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
//import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class stage extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		Scene scene = new Scene(root, Color.WHITE);
		
		Image img = new Image("telegram.png");
		stg.getIcons().add(img);
		stg.setTitle("This is title of this stage!");
		
		stg.setWidth(400);
		stg.setHeight(400);
		stg.setResizable(false);
		stg.setX(50);
		stg.setY(50);
//		stg.setFullScreen(true);
//		stg.setFullScreenExitHint("If you close, you are a dog!");
//		stg.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
		Label lb = new Label();
		lb.setText("hello");
		root.getChildren().add(lb);
		stg.setScene(scene);
		stg.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
