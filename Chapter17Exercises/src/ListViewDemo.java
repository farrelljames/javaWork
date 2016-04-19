import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    
    Label response;
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        
        myStage.setTitle("ListView Demo");
        
        FlowPane rootNode = new FlowPane(10,10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 200, 120);
        
        myStage.setScene(myScene);
        
        response = new Label("Select Computer Type");
        
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("Smartphone", "Tablet",
                                                   "Notebook", "Desktop");
        
        ListView<String> lvComputers = new ListView<String>(computerTypes);
        
        lvComputers.setPrefSize(100, 70);
        
        lvComputers.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();
        
        
        
        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
                ObservableList<String> selectedItems = lvComputers.getSelectionModel().getSelectedItems();
                String result = "";
                
                for(String computer: selectedItems) {
                    result += " " + computer;
                }
                
                response.setText("Computer selected is " + result);
            }
        });
        
        rootNode.getChildren().addAll(lvComputers, response);
        
        myStage.show();
    }
}
