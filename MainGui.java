/**
 * Created by michael on 2/28/2016.
 */
import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
public class MainGui extends Application{
    private VBox scoreBoard;
    private GridPane scoreDisplay;
    private BorderPane window;
    private GridPane raceTrack;
    private HBox centerPanel;
    private TextArea ticker;
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("The Amazing Race");
        createRaceTrack();
        createTicker();
        BorderPane root = new BorderPane();
        root.setTop(createCenterPanel());
        root.setBottom(ticker);

        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();

    }

    public void createRaceTrack()
    {
        raceTrack = new GridPane();
        raceTrack.setStyle("-fx-border-color: black;");
        for(int i = 0; i < 150; i++)
        {
            for(int j = 0; j < 35; j++)
            {
                Label p = new Label();
                p.setText(" ");
                raceTrack.add(p, i, j);
            }
        }
    }

    public HBox createCenterPanel()
    {
        centerPanel = new HBox();
        centerPanel.getChildren().addAll(raceTrack, createScoreBoard());
        return centerPanel;

    }

    public VBox createScoreBoard()
    {
        scoreBoard = new VBox();
        scoreDisplay = new GridPane();
        //scoreDisplay.setPrefWidth(100);

        Label results = new Label();
        results.setText("Results");
        scoreBoard.getChildren().addAll(results, scoreDisplay);
        for(int i =1; i < 5; i++)
        {
            Label l = new Label();
            l.setMinWidth(60);
            l.setText(i + ": ");
            scoreDisplay.add(l, 0, i);
        }

        return scoreBoard;
    }

    public void createTicker()
    {
         ticker = new TextArea();
        ticker.setEditable(false);
        ticker.setMinSize(50, 50);
        ticker.setText("update ticker when a player reaches a stop");
        ///return ticker;
    }

    public static void main(String[] args)
    {
       /// Application.launch(MainGui.class, args);
        launch(args);
        //gui.start()
    }
}
