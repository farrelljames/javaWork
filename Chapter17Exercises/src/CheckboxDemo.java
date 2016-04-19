import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckboxDemo extends Application {
    
    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;
        
    Label response;
    Label selected;
        
    String computers;
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        
        myStage.setTitle("Demonstrate Check Boxes");
        
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 230, 200);
        
        myStage.setScene(myScene);
        
        Label heading = new Label("What computer do you own?");
        
        response = new Label("");
        selected = new Label("");
        
        cbSmartphone = new CheckBox("SmartPhone");
        cbTablet = new CheckBox("Table");
        cbNotebook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");
        
        cbSmartphone.setAllowIndeterminate(true);
        
        cbSmartphone.setOnAction((ae) -> {
            if(cbSmartphone.isIndeterminate())
                response.setText("Smartphone state is indeterminate");
            else if(cbSmartphone.isSelected())
                response.setText("Smartphone was just selected");
            else
                response.setText("Smartphone was just cleared");
            
            showAll();
        });
        
            cbTablet.setOnAction((ae) -> {
            if(cbTablet.isSelected())
                response.setText("Tablet was just selected");
            else
                response.setText("Tablet was just cleared");
            
            showAll();
        });
        
        cbNotebook.setOnAction((ae) -> {
            if(cbNotebook.isSelected())
                response.setText("Notebook was just selected");
            else
                response.setText("Notebook was just cleared");
            
            showAll();
        });
        
        cbDesktop.setOnAction((ae) -> {
            if(cbDesktop.isSelected())
                response.setText("Desktop was just selected");
            else
                response.setText("Desktop was just cleared");
            
            showAll();
        });
        
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, cbNotebook, cbDesktop, response, selected);
        
        myStage.show();
    }
    
    public void showAll() {
        computers = "";
        
        if(cbSmartphone.isSelected()) computers = "Smartphone ";
        if(cbTablet.isSelected()) computers += "Tablet ";
        if(cbNotebook.isSelected()) computers += "Notebook ";
        if(cbDesktop.isSelected()) computers += "Desktop ";
        
        selected.setText("Computers selected: " + computers);
    }
    
}
