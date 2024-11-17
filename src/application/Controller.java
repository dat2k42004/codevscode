package application;

import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;

public class Controller implements Initializable {
	
	
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void moveup() {
		System.out.println("MOVE UP");
	}
	public void movedown() {
		System.out.println("MOVE DOWN");
	}
	public void moveleft() {
		System.out.println("MOVE LEFT");
	}
	public void moveright() {
		System.out.println("MOVE RIGHT");
	}
}
