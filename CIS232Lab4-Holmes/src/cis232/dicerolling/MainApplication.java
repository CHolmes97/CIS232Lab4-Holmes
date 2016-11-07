package cis232.dicerolling;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("dicerollgui.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Set & show the stage
		stage.setScene(scene);
		stage.setTitle("Dice Roller");
		stage.show();
	}
}
