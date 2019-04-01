import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setTitle("Moose Prints");
            primaryStage.setScene(new Scene(root, 1200, 800));


            //  TODO: ADD WINDOWS ICON
        // TODO: FIX LOGO
        // TODO: PHONE NUMBER FORMAT

            primaryStage.show();
        }


    }