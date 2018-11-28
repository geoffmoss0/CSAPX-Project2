package place.client.gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import place.PlaceBoard;

import java.util.Observable;
import java.util.Observer;

public class PlaceGUI extends Application implements Observer {

    private PlaceBoard board;

    @Override
    public void init() {
        //TODO connect to server

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane border = new BorderPane();
        GridPane grid = new GridPane();
        Scene scene = new Scene(border);
        primaryStage.show();
    }

    @Override
    public void update(Observable o, Object arg) {
        assert arg == this.board : "Update called by something that isn't the model";

        this.refresh();
    }

    public void refresh() {
        //TODO
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java PlaceGUI host port username");
            System.exit(-1);
        } else {
            Application.launch(args);
        }
    }
}
