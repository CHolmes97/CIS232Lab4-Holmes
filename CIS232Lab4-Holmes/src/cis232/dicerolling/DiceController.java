package cis232.dicerolling;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class DiceController {

    @FXML
    private RadioButton six;

    @FXML
    private RadioButton eight;

    @FXML
    private RadioButton twelve;

    @FXML
    private RadioButton twenty;
    
    @FXML
    private ToggleGroup sides;
    
    @FXML
    private TextField numberOfDice;

    @FXML
    private Label result;

    @FXML
    void rollListener(ActionEvent event) 
    {
    	Random random = new Random();
    	
    	String results = "";
    	if (six.isSelected())
    	{
    		if (Integer.parseInt(numberOfDice.getText()) <= 10 && Integer.parseInt(numberOfDice.getText()) >= 1)
    		{
    			for (int i = 0; i < Integer.parseInt(numberOfDice.getText()); i++)
        		{
        			int roll = random.nextInt(6) + 1;
        			
        			results += roll + "  ";
        		}
    		}
    		
    		else
    		{
    			results = "Invalid";
    		}
    	}
    	
    	if (eight.isSelected())
    	{
    		if (Integer.parseInt(numberOfDice.getText()) <= 10 && Integer.parseInt(numberOfDice.getText()) >= 1)
    		{
    			for (int i = 0; i < Integer.parseInt(numberOfDice.getText()); i++)
        		{
        			int roll = random.nextInt(8) + 1;
        			
        			results += roll + "  ";
        		}
    		}
    		
    		else
    		{
    			results = "Invalid";
    		}
    	}
    	
    	if (twelve.isSelected())
    	{
    		if (Integer.parseInt(numberOfDice.getText()) <= 10 && Integer.parseInt(numberOfDice.getText()) >= 1)
    		{
    			for (int i = 0; i < Integer.parseInt(numberOfDice.getText()); i++)
        		{
        			int roll = random.nextInt(12) + 1;
        			
        			results += roll + "  ";
        		}
    		}
    		
    		else
    		{
    			results = "Invalid";
    		}
    	}
    	
    	if (twenty.isSelected())
    	{
    		if (Integer.parseInt(numberOfDice.getText()) <= 10 && Integer.parseInt(numberOfDice.getText()) >= 1)
    		{
    			for (int i = 0; i < Integer.parseInt(numberOfDice.getText()); i++)
        		{
        			int roll = random.nextInt(20) + 1;
        			
        			results += roll + "  ";
        		}
    		}
    		
    		else
    		{
    			results = "Invalid";
    		}
    	}
    	
    	result.setText(results);
    }

}
