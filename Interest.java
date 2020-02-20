import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
public class Interest extends Application
{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage s)
	{
		Label l1=new Label("Enter Amount:");
		Label l2=new Label("Enter Intrest Rate:");
		Label l3=new Label("Enter Time Duration:");
		Label l4=new Label("No: of times compunded in a year:");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		TextField t5=new TextField();
		TextField t6=new TextField();
		Button b1=new Button("Calculate Simple Intrest");
		Button b2=new Button("Calculate Compound Intrest");
		GridPane gp=new GridPane();
		gp.setHgap(20);
		gp.setVgap(20);
		gp.add(l1,0,0);
		gp.add(t1,1,0);
		gp.add(l2,0,1);
		gp.add(t2,1,1);
		gp.add(l3,0,2);
		gp.add(t3,1,2);
		gp.add(l4,0,3);
		gp.add(t4,1,3);
		gp.add(b1,0,4);
		gp.add(t5,1,4);
		gp.add(b2,0,5);
		gp.add(t6,1,5);
		b1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				float amount=Float.parseFloat(s1);
				float rate=Float.parseFloat(s2);
				float duration=Float.parseFloat(s3);
				float sinterest = (amount * rate * duration) / 100;
				t5.setText(""+sinterest);
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				float amount=Float.parseFloat(s1);
				float rate=Float.parseFloat(s2);
				float duration=Float.parseFloat(s3);
				float n=Float.parseFloat(s4);
				double total = amount* Math.pow(1 + (rate / n), n * duration);
				double cinterest = total - amount;
				t6.setText(""+cinterest);
			}
		});
	    Scene se=new Scene(gp,500,500);
	    s.setScene(se);
		s.setTitle("Simple & Compund intrest");
	    s.show();
	}
}
