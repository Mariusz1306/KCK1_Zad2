package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPaneLeft = new GridPane();
        gridPaneLeft.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        gridPaneLeft.setPadding(new Insets(5));
        gridPaneLeft.setVgap(10);

        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        ColumnConstraints column3 = new ColumnConstraints();
        gridPaneLeft.getColumnConstraints().addAll(column1, column2, column3);

        Label labelLeft = new Label("Panel plików");
        gridPaneLeft.add(labelLeft, 0, 0);
        Label labelUpper = new Label("Źródło");
        gridPaneLeft.add(labelUpper, 0, 1);
        Label labelLower = new Label("Wynik");
        gridPaneLeft.add(labelLower, 0, 2);

        TextField text1 = new TextField();
        text1.setMaxWidth(150);
        gridPaneLeft.add(text1, 1, 1);
        TextField text2 = new TextField();
        text2.setMaxWidth(150);
        gridPaneLeft.add(text2, 1, 2);

        Button btn5 = new Button();
        btn5.setText("Przeglądaj...");
        gridPaneLeft.add(btn5, 2, 1);

        Button btn6 = new Button();
        btn6.setText("Przeglądaj...");
        gridPaneLeft.add(btn6, 2, 2);

        GridPane gridpaneRight = new GridPane();
        gridpaneRight.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        gridpaneRight.setPadding(new Insets(5));

        Label labelRight = new Label("Opcje uruchamienia");
        gridpaneRight.add(labelRight, 0, 0);

        Button btn1 = new Button();
        btn1.setText("Uruchom przetwarza...");
        btn1.setDisable(true);
        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpaneRight.setVgrow(btn1, Priority.ALWAYS);
        gridpaneRight.add(btn1, 0, 1);

        Button btn2 = new Button();
        btn2.setText("Pomoc");
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpaneRight.setVgrow(btn2, Priority.ALWAYS);
        gridpaneRight.add(btn2, 0, 2);

        Button btn3 = new Button();
        btn3.setText("O programie");
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpaneRight.setVgrow(btn3, Priority.ALWAYS);
        gridpaneRight.add(btn3, 0, 3);

        Button btn4 = new Button();
        btn4.setText("Zapisz i zakończ");
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpaneRight.setVgrow(btn4, Priority.ALWAYS);
        gridpaneRight.add(btn4, 0, 4);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(gridPaneLeft);
        borderPane.setRight(gridpaneRight);
        borderPane.setPadding(new Insets(5));
        borderPane.setMaxHeight(Double.MAX_VALUE);

        Scene scene = new Scene(borderPane, 485, 175);

        primaryStage.setTitle("Narzędzie przetwarzania plików");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
