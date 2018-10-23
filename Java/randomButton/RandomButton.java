package randomButton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RandomButton extends Application {
	List<String> answers = Arrays.asList("Kino","Konzert","Essen gehen");
	
	public void start(Stage primaryStage) {
		VBox root = new VBox(); 
		root.getChildren().add(createButton());
			
		Scene scene = new Scene(root, 500, 500); 
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Hello World"); 
		primaryStage.show();
	}	
	
	Pane createButton() {
		final Button btn = new Button();
		btn.setText("Was machen wir heute Abend?");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7, 7, 7, 7));
		pane.getChildren().add(btn);
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					btn.setText(giveNewAnswer());
				}
			});
		return pane;
	}
	
	public String giveNewAnswer() {
		Random randomInt= new Random();
		return answers.get(randomInt.nextInt(answers.size()));
		
	}
	
	public static void main(String[] args) {
			launch(args);
		}
}