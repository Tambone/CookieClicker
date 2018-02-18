package net.Display;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import net.Game.CookieClicker;
import net.Periodic.Calculate;
import net.Periodic.Update;

import java.io.File;

public class Start extends Application{
    double prefHeight = 1000;
    double prefWidth = 1000;
    public static BorderPane mainWindow;
    public static ImageView cookie;
    public static Label count;
    public static Update update;
    public static Calculate calculate;
    public static Button cursorBut;
    public static Button grandmaBut;
    public static HBox cursor;
    public static HBox grandma;
    public static Label cursorAmt;
    public static Text cursorCost;
    public static Text grandmaCost;
    public static Label grandmaAmt;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = mainWindow();
        cookie = largeCookie();
        count = cookieLabel();
        update = new Update();
        calculate = new Calculate();
        cursorBut = cursorButton();
        grandmaBut = grandmaButton();
        cursorAmt = cursorLabel();
        grandmaAmt = grandmaLabel();
        cursorCost = cursorText();
        grandmaCost = grandmaText();
        cursor = new HBox();
        grandma = new HBox();
        VBox store = new VBox();


        Group root = new Group();

        cursor.getChildren().addAll(cursorAmt, cursorCost, cursorBut);
        grandma.getChildren().addAll(grandmaAmt, grandmaCost, grandmaBut);

        store.getChildren().addAll(cursor, grandma);
        root.getChildren().add(mainWindow);
        mainWindow.setCenter(cookie);
        mainWindow.setTop(count);
        mainWindow.setLeft(store);

        Scene scene1 = new Scene(root, 600, 500);
        primaryStage.setTitle("Cookie Clicker");
        primaryStage.setScene(scene1);


        primaryStage.show();
    }
    private BorderPane mainWindow(){
        double prefWidth = this.prefWidth;
        double prefHeight = this.prefHeight;
        BorderPane mainWindow = new BorderPane();
        mainWindow.setMinSize(300, 300);
        mainWindow.setPrefSize(prefWidth, prefHeight);

        return mainWindow;
    }

    private ImageView largeCookie(){
        Image cookieIMG = new Image(new File("img/PerfectCookie.png").toURI().toString());
        ImageView cookie = new ImageView(cookieIMG);
        cookie.setFitHeight(300);
        cookie.setFitWidth(300);
        cookie.setX(100);
        cookie.setY(100);


        cookie.setPreserveRatio(true);
        cookie.setOnMouseClicked(e -> {
            CookieClicker.setCookies(CookieClicker.getCookies() + 1);
        });

        return cookie;
    }

    private Label cookieLabel(){
        String cCount = "Cookies: 0";
        Label count = new Label(cCount);

        return count;
    }

    private Button cursorButton(){
        Button cursor = new Button("Cursor");
        cursor.setOnMouseClicked( e ->{
            CookieClicker.cursor.buy(1);
        });
        return cursor;
    }

    private Button grandmaButton(){
        Button grandma = new Button("Grandma");
        grandma.setOnMouseClicked(e ->{
            CookieClicker.grandma.buy(1);
        });
        return grandma;
    }

    private Label cursorLabel() {
        Label cursor = new Label("Cursor");
        return cursor;
    }

    private Label grandmaLabel() {
        Label grandma = new Label("Grandma");
        return grandma;
    }

    private Text cursorText() {
        Text cursor = new Text(Integer.toString(CookieClicker.cursor.getCost()) + " cookies");
        return cursor;
    }
    private Text grandmaText(){
        Text grandma = new Text(Integer.toString(CookieClicker.grandma.getCost()) + " cookies");
        return grandma;
    }
}
