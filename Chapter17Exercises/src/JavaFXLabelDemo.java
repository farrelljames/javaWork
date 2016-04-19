import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class JavaFXLabelDemo extends Application {
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        
        myStage.setTitle("Use a JavaFX label.");
        
        FlowPane rootNode = new FlowPane();
        
        Scene myScene = new Scene(rootNode, 300, 200);
        
        myStage.setScene(myScene);
        
        Label myLabel = new Label("JavaFX is a powerful GUI");
        
        rootNode.getChildren().add(myLabel);
        
        myStage.show();
    }
}
