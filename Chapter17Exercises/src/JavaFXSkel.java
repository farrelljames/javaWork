import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
    
    public static void main(String args[]) {
        System.out.println("Launching Javafx application.");
        launch(args);
    }
    
    public void init() {
        System.out.println("Inside the init() method");
    }
    
    public void start(Stage myStage) {
        System.out.println("Inside the start() the method");
        
        myStage.setTitle("JavaFX Skeleton");
        
        FlowPane rootNode = new FlowPane();
        
        Scene myScene = new Scene(rootNode, 300, 200);
        
        myStage.setScene(myScene);
        
        myStage.show();
    }
    
    public void stop() {
        System.out.println("Inside the stop() method.");
    }
    
}
