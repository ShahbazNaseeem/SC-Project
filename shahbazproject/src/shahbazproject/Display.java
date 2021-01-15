package shahbazproject;




import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Display {

	
	Stage stage=new Stage();
	Scene scene;
	
	static String flightname, name,phone,cnic,From,to,timings="",date,type;
	static String local,bussiness,economy,price;
	public Display(){
		stage.setTitle("Pakistan Airline Ticket");
		stage.setWidth(550);
		stage.setHeight(550);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	private void addComponents() {
		// TODO Auto-generated method stub
		Text user = new Text("Airline Ticket Reservation");
		Text txtflight = new Text("flightnam: ");
		Text flightname = new Text(Display.flightname);
		Text txtprice = new Text("Price : ");
		Label price= new Label(Display.price);
		Text name = new Text("Name: ");
		Text tname = new Text(Display.name); 
		Text phone = new Text("Phone: ");
		Text tpass = new Text(Display.phone);
		Text cnic =  new Text("CNIC: ");
		Text tcnic = new Text(Display.cnic);
		Text D = new Text("Date: ");
		Text tdate = new Text(Display.date);
		//Text bclass = new Text();
		//Text local = new Text();
		Text txttype = new Text(Display.type);
		Text from =new Text(Display.From);
		Text to=new Text("to");
		Text txtto=new Text(Display.to);
		Text timings = new Text("Timings: ");
		Text ttime = new Text(Display.timings);
	
		
		Button add = new Button("ADD");
		
		Font f;
		f= Font.font("Calibri",FontWeight.BOLD, 16);
		GridPane gd = new GridPane();
		gd.add(user,0,1);
		user.setFont(Font.font("Arial", 20));
		GridPane.setMargin(user,new Insets(0,0,0,150));
		
		gd.add(name,0,2);
		name.setFont(f);
		gd.add(tname,0,2);
		tname.setFont(f);
		GridPane.setMargin(tname,new Insets(0,0,0,50));
		
		gd.add(phone,0,3);
		phone.setFont(f);
		gd.add(tpass,0,3);
		tpass.setFont(f);
		GridPane.setMargin(tpass,new Insets(0,0,0,50));
		
		gd.add(D,0,4);
		D.setFont(f);
		gd.add(tdate,0,4);
		tdate.setFont(f);
		GridPane.setMargin(tdate,new Insets(0,0,0,50));
		
		gd.add(cnic,0,5);
		cnic.setFont(f);
		gd.add(tcnic,0,5);
		tcnic.setFont(f);
		GridPane.setMargin(tcnic,new Insets(0,0,0,50));
		
		
		gd.add(txttype,0,6);
		txttype.setFont(f);
		/*gd.add(teducation,0,8);
		teducation.setFont(f);
		GridPane.setMargin(teducation ,new Insets(0,0,0,70));*/
		
		gd.add(from,0,7);
		from.setFont(f);
		gd.add(to,0,7);
		to.setFont(f);
		GridPane.setMargin(to ,new Insets(0,0,0,50));
		gd.add(txtto,0,7);
		txtto.setFont(f);
		GridPane.setMargin(txtto ,new Insets(0,0,0,90));
		
		
		
		
		gd.add(timings,0,8);
		timings.setFont(f);
		gd.add(ttime,0,8);
		ttime.setFont(f);
		GridPane.setMargin(ttime ,new Insets(0,0,0,50));
		
		gd.add(txtflight, 0, 9);
		txtflight.setFont(f);
	    flightname.setFont(f);
		gd.add(flightname, 0, 9);
		GridPane.setMargin(flightname ,new Insets(0,0,0,80));
		
		gd.add(txtprice, 0, 10);
		gd.add(price, 0, 10);
		GridPane.setMargin(price ,new Insets(0,0,0,80));
		
		gd.add(add,0,11);
		GridPane.setMargin(add,new Insets(30,0,0,0));
		
		gd.setHgap(10);
		gd.setVgap(10);
		
		 Image image = new Image("file:/C:\\Users\\sss\\eclipse-workspace\\shahbazproject\\images\\img.jpg");    
		    //Setting the image view 
		    ImageView imageView = new ImageView(image); 
		    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
		    gd.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
		    
		
		scene = new Scene(gd);
		
		add.setOnAction(x->{
			
			stage.hide();
			new Main();
		});
		
		
	}
	public static void checkRoute(int i) {
		
		
		if(i==1)
		{
			Alert msg = new Alert(AlertType.WARNING);
			msg.setHeaderText("Wrong Destination");
			msg.setContentText("Please select correct Destination");
			msg.show();
		}
		else
		{
			Alert msg =new Alert(AlertType.INFORMATION);
			msg.setHeaderText(null);
			msg.setContentText("Your Ticket Is Cofirm");
			msg.show();
		}
	}
}

