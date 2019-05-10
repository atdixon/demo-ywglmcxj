package atdixon.demo;

import atdixon.core.demo.Messages;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public final class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setScene(
            new Scene(new Label(Messages.get()), 800, 300));
        stage.show();
    }

}
