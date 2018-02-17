package net.Display;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.Game.BigCookie;
import net.Periodic.UpdateCookieCount;

import java.io.File;
import java.io.FileInputStream;

public class Start extends Application{
    double prefHeight = 1000;
    double prefWidth = 1000;
    static BorderPane mainWindow;
    static ImageView cookie;
    public static Label count;
    static UpdateCookieCount updateCookieCount;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = mainWindow();
        cookie = largeCookie();
        count = cookieLabel();
        updateCookieCount = new UpdateCookieCount();


        Group root = new Group();

        root.getChildren().add(mainWindow);
        mainWindow.setCenter(cookie);
        mainWindow.setTop(count);

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
            BigCookie.setCookies(BigCookie.getCookies() + 1);
        });

        return cookie;
    }

    private Label cookieLabel(){
        String cCount = "Cookies: 0";
        Label count = new Label(cCount);

        return count;
    }

}
