package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class scene extends Application {

	@Override
	public void start(Stage primarystage) throws Exception {
		// TODO Auto-generated method stub
		
		Group group = new Group();
		Scene scene = new Scene(group, 400, 400, Color.GREY);
		Stage stage = new Stage();
		
		
		Text text = new Text(); 
		text.setText("this is my stage!");
		text.setFont(Font.font("time new roman", 20));
		text.setFill(Color.GREEN);
		text.setX(50);
		text.setY(50);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(70);
		line.setEndX(300);
		line.setEndY(70);
		line.setStrokeWidth(2);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(45); // xoay goc bao nhieu do
		
		
		Rectangle rt = new Rectangle();
		rt.setX(50);
		rt.setY(100);
		rt.setWidth(100);
		rt.setHeight(100);
		rt.setFill(Color.BLUE);
		rt.setStrokeWidth(5);
		rt.setStroke(Color.BLACK);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
		triangle.setFill(Color.YELLOW);
		
		Circle circle = new Circle();
		circle.setCenterX(300);
		circle.setCenterY(300);
		circle.setRadius(50);
		circle.setFill(Color.ORANGE);
		
		Image img = new Image("happy.png");
		ImageView imgw = new ImageView(img);
		imgw.setX(50);
		imgw.setY(300);
		
		
		
		group.getChildren().add(text);
		group.getChildren().add(line);
		group.getChildren().add(rt);
		group.getChildren().add(triangle);
		group.getChildren().add(circle);
		group.getChildren().add(imgw);
		
		Image icon = new Image("telegram.png");
		stage.getIcons().add(icon);
		stage.setTitle("This is my Scene!"); 
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
