package shahbazproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

	Stage stage;
	Scene scene;
	@Override
	public void start(Stage s) throws Exception {
		// TODO Auto-generated method stub
		stage = s;
		stage.setTitle("Airline Ticket Reservation Managemnet System");
		stage.setHeight(500);
		stage.setWidth(750);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
private void addComponents() {
		// TODO Auto-generated method stub
	Font f;
	f= Font.font("Calibri",FontWeight.BOLD, 14);

	Button btn1=new Button("PIA");
	Button btn2=new Button("EMIRATES");
	Button btn3=new Button("Fly Dubai");
	Button btn4=new Button("Qatar Airways");
	Button btn5=new Button("Login");
    btn1.setPrefSize(150, 50);
	btn2.setPrefSize(150, 50);
	btn3.setPrefSize(150, 50);
	btn4.setPrefSize(150, 50);
	btn5.setPrefSize(150, 50);
	btn1.setFont(f);
	btn2.setFont(f);
	btn3.setFont(f);
	btn4.setFont(f);
	btn5.setFont(f);
	btn1.setStyle("-fx-background-color:  #75BDD8; -fx-textfill: white;");
	btn2.setStyle("-fx-background-color: #75BDD8; -fx-textfill: white;");
	btn3.setStyle("-fx-background-color:  #75BDD8; -fx-textfill: white;");
	btn4.setStyle("-fx-background-color:  #75BDD8; -fx-textfill: white;");
	btn5.setStyle("-fx-background-color:  #75BDD8; -fx-textfill: white;");
	
    GridPane g=new GridPane();
    g.setAlignment(Pos.BASELINE_CENTER);
	Text t=new Text("Airline Ticket Reservation \n \t\t System \n Select In Which flight you \n \t Want To Go");
	t.setStyle("-fx-font: normal bold 36px 'serif' ");
	
	
	HBox hb=new HBox();
	//hb.setStyle("-fx-background-color: MAROON;");
	hb.setPadding(new Insets(150,120,0,20));
    hb.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
	hb.setSpacing(10);
	
	
    BorderPane bd=new BorderPane();
   // bd.setStyle("-fx-background-color: MAROON;");
   
    bd.setTop(t);
    bd.setAlignment(t,Pos.CENTER);
    bd.setCenter(hb);
   // bd.setStyle("-fx-background-image: url('pic_1528453509.jpg'); "
    //		+ "-fx-background-position: center center; "
    	//	+ "-fx-background-repeat: stretch;");
    //Setting image
    Image image = new Image("file:/C:\\Users\\sss\\eclipse-workspace\\shahbazproject\\images\\mainmage.jpeg");    
    //Setting the image view 
    ImageView imageView = new ImageView(image); 
    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
    bd.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
    
   
	scene=new Scene(bd);
	//scene.getStylesheets().add("Mystyle.css");
	

	btn1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Display.flightname = "PIA";
			Display.economy = "15000";
			Display.local = "7000";
			Display.bussiness = "50000";
			new airlineticket();
		}
		
		
		
		
		
	});
	btn2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Display.flightname = "Emirates";
			Display.economy = "18000";
			Display.local = "9000";
			Display.bussiness = "45000";
			new Emirates();
		}
		
		
		
		
		
	});
	btn3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Display.flightname = "Fly Dubai";
			Display.economy = "25000";
			Display.local = "10000";
			Display.bussiness = "55000";
			new flydubai();
		}
		
		
		
		
		
	});
	btn4.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Display.flightname = "Qatar Airways";
			Display.economy = "22000";
			Display.local = "1600";
			Display.bussiness = "40000";
			new Qatar();
		}
		
		
		
		
		
	});
	btn5.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			
			new login();
		}
		
		
		
		
		
	});
	
	

	}






public static void main(String[] args) {
	// TODO Auto-generated method stub
launch(args);
}


}

