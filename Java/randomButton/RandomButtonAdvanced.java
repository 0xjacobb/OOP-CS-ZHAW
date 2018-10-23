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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RandomButtonAdvanced extends Application {
	List<String> answers = Arrays.asList();
	
	public void start(Stage primaryStage) {
				
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setHgap(10);
		grid.setVgap(10);
		
		Label nameLabel = new Label("Tat:");
		TextField nameField = new TextField();
		nameField.setPromptText("Trage deine Tat ein");
		GridPane.setConstraints(nameLabel, 0 , 0);
		GridPane.setConstraints(nameField, 1 , 0);
		
		Button saveButton = new Button("Save");
		GridPane.setConstraints(saveButton, 3 , 0);
		
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				addNewAnswer(nameField.getText().toString());
			}
		});
					
		Button showTextButton = new Button("Klick mich");
		GridPane.setConstraints(showTextButton, 1 , 1);
		
		showTextButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				showTextButton.setText(giveNewAnswer());
			}
		});
		
		grid.getChildren().addAll(nameLabel, nameField, saveButton, showTextButton);
	
		Scene scene = new Scene(grid, 500, 500); 
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Random Button Advanced"); 
		primaryStage.show();
	}	
	
		public String giveNewAnswer() {
			Random randomInt= new Random();
			if (answers.isEmpty()) {
				return "Leere Liste";
			}
			
			else {
				return answers.get(randomInt.nextInt(answers.size()));
			}
		}
	
		public void addNewAnswer(String input) {
			if (input.isEmpty() == true || answers.contains(input)) {}
			
			else {
				System.out.println(input);
				answers.add("Sali");
			}
		}
	
	public static void main(String[] args) {
			launch(args);
		}
}