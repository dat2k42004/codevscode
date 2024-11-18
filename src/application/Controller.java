package application;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.transform.Rotate;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.util.Duration;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;

public class Controller implements Initializable {
	
	
	@FXML 
	private Pane pane;
	@FXML
	private Label label;
	@FXML
	Button play, reset, pause, previous, next;
	@FXML
	ComboBox<String> speed;
	@FXML
	Slider volume;
	@FXML
	ProgressBar progress;
	
	File directory;
	File[] files;
	ArrayList<File> songs;
	int songnumber = 0;
	int[] speeds = {25, 50, 75, 100, 125, 150, 175, 200};
	Timer timer;
	TimerTask task;
	boolean running;
	
	
	Media media;
	MediaPlayer mediaplayer;
 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		songs = new ArrayList<File>();
		directory = new File("music");
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				songs.add(file);
				System.out.println(file);
			}
		}
		media = new Media(songs.get(songnumber).toURI().toString());
		mediaplayer = new MediaPlayer(media);
		label.setText(songs.get(songnumber).getName());
		playpage();
		
		for (int i = 0; i < speeds.length; ++ i) {
			speed.getItems().add(Integer.toString(speeds[i]) + "%");
		}
		
		volume.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				mediaplayer.setVolume(volume.getValue() * 0.01);
			}
			
		});
		progress.setStyle("-fx-accent:  #00FF00;");
	}
	
	
	
	public void playpage() {
		begintimer();
		changespeed(null);
		mediaplayer.setVolume(volume.getValue() * 0.01);
		mediaplayer.play();
	}
	public void pausepage() {
		canceltimer();
		mediaplayer.pause();
	}
	public void resetpage() {
		progress.setProgress(0);
		mediaplayer.seek(Duration.seconds(0));
	}
	public void previouspage() {
		if (songnumber > 0) {
			songnumber --;
		}
		else {
			songnumber = songs.size() - 1;
		}
		
		if (running) {
			canceltimer();
		}
		mediaplayer.stop();
		media = new Media(songs.get(songnumber).toURI().toString());
		mediaplayer = new MediaPlayer(media);
		label.setText(songs.get(songnumber).getName());
		playpage();
	}
	public void nextpage() {
		if (songnumber < songs.size() - 1) {
			songnumber ++;
		}
		else {
			songnumber = 0;
		}
		
		if (running) {
			canceltimer();
		}
		mediaplayer.stop();
		media = new Media(songs.get(songnumber).toURI().toString());
		mediaplayer = new MediaPlayer(media);
		label.setText(songs.get(songnumber).getName());
		playpage();
	}
	public void changespeed(ActionEvent e) {
		if (speed.getValue() == null) {
			mediaplayer.setRate(1);
		}
		else {
			mediaplayer.setRate(Integer.parseInt(speed.getValue().substring(0, speed.getValue().length() - 1)) * 0.01);
		}
	}
	
	public void begintimer() {
		timer = new Timer();
		task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				running = true;
				double current = mediaplayer.getCurrentTime().toSeconds();
				double end = media.getDuration().toSeconds();
				System.out.println(current / end);
				progress.setProgress(current / end);
				
				if (current / end == 1) {
					canceltimer();
				}
			}
			
		};
		
		timer.scheduleAtFixedRate(task, 0, 1000);
	}
	public void canceltimer() {
		running = false;
		timer.cancel();
	}
	
//	@FXML
//	private TextField textfield;
//	@FXML
//	private WebView webview;
//	
//	private WebEngine engine;
//	private WebHistory history;
//	private String homepage;
//	double zoom = 1.0;
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		engine = webview.getEngine();
//		homepage = "www.google.com";
//		textfield.setText(homepage);
//		loadpage();
//	}
//	
//	public void loadpage() {
////		engine.load("http://ww.google.com");
//		engine.load("http://" + textfield.getText());
//	}
//	
//	public void refreshpage() {
//		engine.reload();
//	}
//	
//	public void zoomin() {
//		zoom += 0.25;
//		webview.setZoom(zoom);
//	}
//	public void zoomout() {
//		zoom -= 0.25;
//		webview.setZoom(zoom);
//	}
//	
//	public void displayhistory() {
//		history = engine.getHistory();
//		ObservableList<WebHistory.Entry> entries = history.getEntries();
//		for (WebHistory.Entry entry : entries) {
////			System.out.println(entry);
//			System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
//		}
//	}
//	
//	public void back() {
//		history = engine.getHistory();
//		ObservableList<WebHistory.Entry> entries = history.getEntries();
//		history.go(-1);
//		textfield.setText(entries.get(history.getCurrentIndex()).getUrl());
//	}
//	
//	public void forward() {
//		history = engine.getHistory();
//		ObservableList<WebHistory.Entry> entries = history.getEntries();
//		history.go(1);
//		textfield.setText(entries.get(history.getCurrentIndex()).getUrl());
//	}
//	
//	public void executejs() {
//		engine.executeScript("window.location = \"https://www.youtube.com\";");
//	}
	
//	@FXML
//	private MediaView mediaview;
//	@FXML
//	private Button playmedia, pausemedia, resetmedia;
//	
//	private File file;
//	private Media media;
//	private MediaPlayer mediaplayer;
//
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		file = new File("video.mp4");
//		media = new Media(file.toURI().toString());
//		mediaplayer = new MediaPlayer(media);
//		mediaview.setMediaPlayer(mediaplayer);
//	}
//	public void play() {
//		mediaplayer.play();
//	}
//	public void pause() {
//		mediaplayer.pause();
//	}
//	public void reset() {
//		if(mediaplayer.getStatus() != MediaPlayer.Status.READY) {
//			mediaplayer.seek(Duration.seconds(0.0));
//		}
//	}
	
	
//	@FXML
//	private Circle mycircle;
//	private double x, y;
//	
//	
//	@FXML
//	private Button logout_button;
//	@FXML
//	private AnchorPane scenePane;
//	Stage stage;
//	
//	
//	public void up(ActionEvent e) {
////		System.out.println("up");
//		mycircle.setCenterY(y -= 10);
//	}
//	public void down(ActionEvent e) {
////		System.out.println("down");
//		mycircle.setCenterY(y += 10);
//	}
//	public void right(ActionEvent e) {
////		System.out.println("right");
//		mycircle.setCenterX(x += 10);
//	}
//	public void left(ActionEvent e) {
////		System.out.println("left");
//		mycircle.setCenterX(x -= 10);
//	}
//	
//	
//	
//	public void logout (ActionEvent e) {
//		
//		Alert alert = new Alert(AlertType.CONFIRMATION);
//		alert.setTitle("Logout!");
//		alert.setHeaderText("You're about to logout!");
//		alert.setContentText("Do you want to save before exit?");
//		
//		if (alert.showAndWait().get() == ButtonType.OK) {
//			stage = (Stage) scenePane.getScene().getWindow();
//			System.out.println("Logout successfully!");
//			stage.close();
//		} 
//	}
	
	
	// image view is a node used for painting images loaded with images
	// image == photograph
	// image view = picture frame
	 
//	@FXML
//	ImageView myimageview;
//	Button mybutton;
//	
//	Image img = new Image(getClass().getResourceAsStream("image2.jpg"));
//	
//	public void displayImage() {
////		myimageview = new ImageView();
//		myimageview.setImage(img);
//	}
	
//	
//	@FXML
//	private Label mylabel;
//	@FXML
//	private Button mybutton;
//	@FXML
//	private TextField mytextfield;
//	Stage stg;
//	int age;
//	public void submit(ActionEvent e) {
//		try {
//			age = Integer.parseInt(mytextfield.getText());
//			if (age >= 18) {
//				mylabel.setText("You are now sign up!");
//				System.out.println("submit successfully!");
//				System.exit(0);
//			}
//			else {
//				mylabel.setText("You must be 18+");
//			}
//		}
//		catch (NumberFormatException ex) {
//			mytextfield.setText("");
//			mylabel.setText("Please enter only number!");
//		}
//		catch (Exception ex) {
//			System.out.println(ex);
//		}
	
	
//		
	
	
	
//	}
//	@FXML
//	private CheckBox mycheckbox;
//	@FXML
//	private Label mylabel;
//	@FXML
//	private ImageView myimage;
//	
//	Image img1 = new Image(getClass().getResourceAsStream("light-bulb_off.png"));
//	Image img2 = new Image(getClass().getResourceAsStream("light-bulb_on.png"));
//	
//	public void change(ActionEvent e) {
//		if (mycheckbox.isSelected()) {
//			mylabel.setText("ON");
//			myimage.setImage(img2);
//		}
//		else {
//			mylabel.setText("OFF");
//			myimage.setImage(img1);
//		}
//	}
	
	
//	@FXML 
//	private RadioButton chose1, chose2, chose3;
//	@FXML
//	private Label label;
//	
//	public void chose(ActionEvent e) {
//		if (chose1.isSelected()) {
//			label.setText(chose1.getText());
//		}
//		else if (chose2.isSelected()) {
//			label.setText(chose2.getText());
//		}
//		else if (chose3.isSelected()) {
//			label.setText(chose3.getText());
//		}
//	}
	
//	@FXML 
//	private DatePicker datepicker;
//	@FXML
//	private Label label;
//	
//	public void pick(ActionEvent e) {
//		 LocalDate mydate = datepicker.getValue();
//		 String formatdate = mydate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
//		 label.setText(formatdate);
//	}
	
//	@FXML
//	private Label label;
//	@FXML
//	private ChoiceBox<String> choicebox;
//	
//	private String[] food = {"pizza", "cake", "breath", "chicken", "hotdog"};
//
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		choicebox.getItems().addAll(food);
//		choicebox.setOnAction(this :: getfood); 
//	}
//	public void getfood(ActionEvent e) {
//		label.setText("You choice " + choicebox.getValue());
//	}
	
	
//	@FXML
//	private Label label;
//	@FXML
//	private Slider slider;
//	
//	int temperater;
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		slider.valueProperty().addListener(new ChangeListener<Number>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
//				// TODO Auto-generated method stub
//				temperater = (int) slider.getValue();
//				label.setText(Integer.toString(temperater) + "ºC");
//			}
//			
//			
//		});
//	}
	
//	@FXML
//	private Label label;
//	@FXML
//	private Button button;
//	@FXML
//	private ProgressBar progressbar;
//	
//	BigDecimal progress = new BigDecimal(String.format("%.1f", 0.0));
//	
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		progressbar.setStyle("-fx-accent: blue;");
//	}
//	
//	public void increaseprogressbar(ActionEvent e) {
//		if (progress.doubleValue() < 1.0) {
//			progress = new BigDecimal(String.format("%.1f", progress.doubleValue() + 0.1));
//			progressbar.setProgress(progress.doubleValue());
//			label.setText(Integer.toString((int) Math.round(progress.doubleValue() * 100)) + "%");
//		}
//		else {
//			label.setText("hightest");
//		}
//	}
//	
//	public void decreaseprogressbar(ActionEvent e) {
//		if (progress.doubleValue() > 0.0) {
//			progress = new BigDecimal(String.format("%.1f", progress.doubleValue() - 0.1));
//			progressbar.setProgress(progress.doubleValue());
//			label.setText(Integer.toString((int) Math.round(progress.doubleValue() * 100)) + "%");
//		}
//		else {
//			label.setText("Lowest!");
//		}
//	}
//	@FXML
//	private Spinner<Integer> spinner;
//	@FXML
//	private Label label;
//	int currentvalue;
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		SpinnerValueFactory<Integer> value = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
//		value.setValue(1);
//		spinner.setValueFactory(value);
//		currentvalue = value.getValue();
//		label.setText(Integer.toString(currentvalue));
//		spinner.valueProperty().addListener(new ChangeListener<Integer>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
//				// TODO Auto-generated method stub
//				currentvalue = value.getValue();
//				label.setText(Integer.toString(currentvalue));
//			}
//		});
//	}
	
//	@FXML
//	private Label label;
//	@FXML
//	private ListView<String> listview;
//	
//	String[] food = {"pizza", "chicken", "hotdog", "cake"};
//	String res;
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		listview.getItems().addAll(food);
//		
//		listview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//
//			@Override
//			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
//				// TODO Auto-generated method stub
//				res = listview.getSelectionModel().getSelectedItem();
//				label.setText("You chose " + res);
//			}
//			
//		});
//	}
//	
	
//	@FXML
//	private TreeView<String> treeview;
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		TreeItem<String> rootitem = new TreeItem<>("Files", new ImageView(new Image("folder.png")));
//		TreeItem<String> branch1 = new TreeItem<>("Pictures");
//		TreeItem<String> branch2 = new TreeItem<>("Videos");
//		TreeItem<String> branch3 = new TreeItem<>("Music");
//		
//		TreeItem<String> leaf1 = new TreeItem<>("Picture1");
//		TreeItem<String> leaf2 = new TreeItem<>("Picture2");
//		TreeItem<String> leaf3 = new TreeItem<>("Video1");
//		TreeItem<String> leaf4 = new TreeItem<>("Video2");
//		TreeItem<String> leaf5 = new TreeItem<>("Music1");
//		branch1.getChildren().addAll(leaf1, leaf2);
//		branch2.getChildren().addAll(leaf3, leaf4);
//		branch3.getChildren().addAll(leaf5);
//		rootitem.getChildren().addAll(branch1, branch2, branch3);
////		treeview.setShowRoot(false);
//  		treeview.setRoot(rootitem);
//	}
//	
//	public void selectitem() {
//		TreeItem<String> item = (TreeItem<String>) treeview.getSelectionModel().getSelectedItem();
//		if (item != null) {
//			System.out.println(item.getValue());
//		}
//	}
	
	
//	public void newMethod() {
//		System.out.println("hello");
//	}
//	@FXML
//	private ImageView myimage;
//	
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		// TODO Auto-generated method stub
//		
//		//translate
//		TranslateTransition translate = new TranslateTransition();
//		translate.setNode(myimage);
//		translate.setDuration(Duration.millis(1000));
//		translate.setCycleCount(TranslateTransition.INDEFINITE);
//		translate.setByX(400);
////		translate.setByY(250);
//		translate.setAutoReverse(true);
//		translate.play();
//		
//		//rotate
//		RotateTransition rotate = new RotateTransition();
//		rotate.setNode(myimage);
//		rotate.setDuration(Duration.millis(1000));
//		rotate.setCycleCount(RotateTransition.INDEFINITE);
//		rotate.setInterpolator(Interpolator.LINEAR);
//		rotate.setByAngle(360);
//		rotate.setAxis(Rotate.Z_AXIS);
//		rotate.play();
//		
//		 // fade
//		  FadeTransition fade = new FadeTransition();
//		  fade.setNode(myimage);
//		  fade.setDuration(Duration.millis(1000));
//		  fade.setCycleCount(TranslateTransition.INDEFINITE);
//		  fade.setInterpolator(Interpolator.LINEAR);
//		  fade.setFromValue(0);
//		  fade.setToValue(1);
//		  fade.play();
//		  
//		  
//		  // scale
//		  ScaleTransition scale = new ScaleTransition();
//		  scale.setNode(myimage);
//		  scale.setDuration(Duration.millis(1000));
//		  scale.setCycleCount(TranslateTransition.INDEFINITE);
//		  scale.setInterpolator(Interpolator.LINEAR);
//		  scale.setByX(2.0);
//		  scale.setByY(2.0);
//		  scale.setAutoReverse(true);
//		  scale.play();
	
		
//		}
	
//	public void moveup() {
//		System.out.println("MOVE UP");
//	}
//	public void movedown() {
//		System.out.println("MOVE DOWN");
//	}
//	public void moveleft() {
//		System.out.println("MOVE LEFT");
//	}
//	public void moveright() {
//		System.out.println("MOVE RIGHT");
//	}
}

