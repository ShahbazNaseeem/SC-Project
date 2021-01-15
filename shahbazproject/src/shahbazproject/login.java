package shahbazproject;



import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login {
	Stage stage;
	Scene scene;
	TextField txtcnic=new TextField();
    int i=0;
 login(){
	  stage= new Stage();
		stage.setTitle("Airline Ticket Reservation System");
		stage.setHeight(500);
		stage.setWidth(700);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	private void addComponents() {
		// TODO Auto-generated method stub
		Text text = new Text("Airline Ticket Reservation System");
		text.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,FontPosture.REGULAR,18));
		text.setX(150);
		text.setY(100);
		
		Font f;
		f= Font.font("Calibri",FontWeight.BOLD, 14);
		Text t=new Text("Airline Ticket Reservation \n \t System");
		t.setStyle("-fx-font: normal bold 36px 'serif' ");
	
	
		Label name=new Label("UserName");
		name.setStyle("-fx-font: normal bold 20px 'serif' ");
		TextField txtname=new TextField();
		Label pass=new Label("Password.");
		pass.setStyle("-fx-font: normal bold 20px 'serif' ");
		TextField txtpass=new TextField();
		Button btn5=new Button("Login");
	    btn5.setPrefSize(200, 40);
	    btn5.setFont(f);
		btn5.setStyle("-fx-background-color:  #75BDD8; -fx-textfill: white;");
		 GridPane grid=new GridPane(); 
			grid.setAlignment(Pos.BASELINE_CENTER);
			
			grid.setVgap(5);
			grid.setHgap(0);
			
			grid.add(t,0,0);
			
			grid.add(name, 0, 1);
			grid.add(txtname, 1,1);
		
			grid.add(pass, 0, 4);
			grid.add(txtpass, 1, 4);
			grid.add(btn5,0, 6);
			
			
			 Image image = new Image("file:/C:\\Users\\sss\\eclipse-workspace\\shahbazproject\\images\\login.jpg");    
			    //Setting the image view 
			    ImageView imageView = new ImageView(image); 
			    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
			    grid.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
			    
			
			
			
			
			scene=new Scene(grid);
			

			
			
			
	}
	


			
}
