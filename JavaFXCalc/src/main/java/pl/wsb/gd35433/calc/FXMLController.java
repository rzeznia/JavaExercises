package pl.wsb.gd35433.calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label helper;
    @FXML
    public TextField lcd;
    @FXML
    public Integer L1; public Integer L2; public Boolean LCounter = false; 
    String lcdstring = ""; public Boolean Operated = false; public Boolean Calculated = false;
    String operation;
    @FXML
    private void digit(ActionEvent e)
    {
        if(Calculated != true)
        {
            lcdstring = lcdstring + ((Button)e.getSource()).getText();
            helper.setText("Ready");
            System.out.println(((Button)e.getSource()).getText());
            lcd.setText(lcdstring); 
            if(LCounter == false)
                L1 = Integer.valueOf(lcdstring);
            else
            {
                L2 = Integer.valueOf(lcdstring);  
            } 
        }else
            helper.setText("Use Clear button for new calc or select operation");      
    }
    @FXML
    private void eql(ActionEvent e)
    {
        if(Operated == true)
        {
            if(L2 != null)
            {
                switch(operation)
                {
                    case "+": L1 = L1 + L2;
                        break;
                    case "-": L1 = L1 - L2;
                        break;
                    case "*": L1 = L1 * L2;
                        break;
                    case "/": 
                        if(L2 == 0)
                            lcd.setText("Cannot be divided by 0");
                        else
                            L1 = L1 / L2;
                        break;    
                }
                if(!"Cannot be divided by 0".equals(lcd.getText()))
                    lcd.setText(L1.toString());  
                Calculated = true;
                helper.setText("Use Clear button for new calc or select operation");
            }else
                helper.setText("Enter second number for calculation");
        }
        else
            helper.setText("Enter first number and chosoe operation ");            
    }
    @FXML
    private void opr(ActionEvent e)
    {        
            if(L1 != null)
            {
                Operated = true;
                lcdstring = "";
                lcd.setText(((Button)e.getSource()).getText());
                LCounter = true;
                operation = ((Button)e.getSource()).getText();
                System.out.println(operation);
                Calculated = false;
            }
            else
                helper.setText("Enter first number for calculation");               
    }
    @FXML
    private void clr(ActionEvent e){
        L1 = null; L2 = null; LCounter = false; lcdstring = ""; Operated = false; 
        operation = null; Calculated = false;
        lcd.setText(lcdstring);
        helper.setText("Ready");
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
