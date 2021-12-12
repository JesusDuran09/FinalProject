import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button1;
	Button button2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Word Occurences");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button1);
		
		button1 = new Button();
		button1.setText("Check Word Occurence");
		
		button2 = new Button();
		button2.setText("Help");
		
		Scene scene = new Scene(layout, 300, 250 );
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

}
