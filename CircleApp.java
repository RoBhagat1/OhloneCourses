/*******************************************************************************************
 * Name: Rohan Bhagat
 * Course: CS125-0X 
 * Lab #: Lab Four
 * Submission Date: 10:00 pm, Wed (7/22) 
 * Brief Description: The app class to give the input, check if correct input, make the buttons 
 * and the other javafx
 *********************************************************************************************/
import javax.swing.JOptionPane;//import statments for javafx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class CircleApp extends Application {//create main class
	// Fields
	private TextField radiusTextField;//text field for radius
	private Label resultLabel;//label for radius

	public static void main(String[] args) {//main class
		launch(args);// Launch the application.
	}

	@Override//override method
	public void start(Stage primaryStage) {//start function
		Label promptLabel = new Label("Enter a radius:");//ask for radius
		radiusTextField = new TextField();//make a new text field
		
		Button submitButton = new Button("Submit");//submit button
		submitButton.setOnAction(new SubmitButtonHandler());//call to button handler
		
		Button clearButton = new Button("Clear");//clear button
		clearButton.setOnAction(new ClearButtonHandler());//call to clear button handler
		
		Button exitButton = new Button("Exit");//exit button
		exitButton.setOnAction(new ExitButtonHandler());//call to exit button
		
		resultLabel = new Label();//make label for result
		HBox hbox = new HBox(20, promptLabel, radiusTextField, submitButton,clearButton,exitButton);//display buttons
		hbox.setAlignment(Pos.CENTER);//position at center
		hbox.setPadding(new Insets(10));//add padding
		
		VBox vbox = new VBox(10, hbox, resultLabel);//make a vertical box
		vbox.setAlignment(Pos.CENTER);//position at center
		vbox.setPadding(new Insets(10));//add padding
		
		Scene scene = new Scene(vbox);//make a scene
		primaryStage.setScene(scene);//set the stage
		primaryStage.setTitle("Area Finder");//write the title
		primaryStage.show();//show the stage

	}

	class SubmitButtonHandler implements EventHandler<ActionEvent> {//handler for submit button
		public void handle(ActionEvent event) {//handle statement
			try {//exception handling 
				double radius = Double.parseDouble(radiusTextField.getText());//get radius
				if (radius < 0) {//if is negative
					throw new NegativeDoubleException();//throw exception
				}
				double area = Math.PI * radius * radius;//get area
				resultLabel.setText(String.format("Area is %.2f ", area));//round area and print
			} catch (NumberFormatException exception) {// if exception string, catch
				JOptionPane.showMessageDialog(null, "Invalid Entry, enter a positive real number for length", "ERROR",
						JOptionPane.ERROR_MESSAGE);//display error message if string
			} catch (NegativeDoubleException exception) {//if exception catch if negative
				JOptionPane.showMessageDialog(null, exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);// returns
																												// error
																												// message
			}
		}
	}

	class ClearButtonHandler implements EventHandler<ActionEvent> {//handler for clear button
		public void handle(ActionEvent event) {//handle statement
			radiusTextField.clear();//clear 
		}
	}

	class ExitButtonHandler implements EventHandler<ActionEvent> {//handler for exit
		public void handle(ActionEvent event) {//class for handling 	
			System.exit(0);//exit system
		}
	}
}
