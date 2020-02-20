import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.collections.*;
public class Construction extends Application
{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage s)
	{
		GridPane gp=new GridPane();
		Scene se=new Scene(gp,500,500);
		s.setScene(se);
		s.setTitle("House Construction Cost");
		Label l1=new Label("1200INR if we use standard materials");
		Label l2=new Label("1500INR if we use above standard materials:");
		Label l3=new Label("1800INR if customers needs high standard material");
		Label l4=new Label("2500INR if customer needs high standard material and fully automated home");
		Label l5=new Label("Select Material Type:");
		Label l6=new Label("Enter Total area:");
		Label l7=new Label("Total amount for house construction is");
		TextField t1=new TextField();
		TextField t2=new TextField();
		ObservableList<String> select=FXCollections.observableArrayList("Use standard materials","Use above standard materials","High standard material","High standard material and fully automated home");
		ComboBox<String> cb=new ComboBox<String>(select);
		cb.setEditable(false);
		gp.setHgap(20);
		gp.setVgap(20);
		gp.add(l1,0,0);
		gp.add(l2,0,1);
		gp.add(l3,0,2);
		gp.add(l4,0,3);
		gp.add(l5,0,5);
		gp.add(cb,1,5);
		gp.add(l6,0,4);
		gp.add(t1,1,4);
		gp.add(l7,0,6);
		gp.add(t2,1,6);
		cb.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				try{
				int rate;
				float area,amount;
				String s2=t1.getText();
				if(s2==null)
				{
					throw new Exception();
				}
				else{
				String s1=cb.getValue();
				if(s1=="Use standard materials")
					rate=1200;
				else if(s1=="Use above standard materials")
					rate=1500;
				else if(s1=="High standard material")
					rate=1800;
				else
					rate=2500;
				area=Float.parseFloat(s2);
				amount=area*rate;
				t2.setText(""+amount);
				}
				}
				catch(Exception e)
				{
					t1.setText("Please enter Value");
				}
			}
		});
		s.show();
	}
}