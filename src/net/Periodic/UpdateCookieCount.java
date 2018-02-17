package net.Periodic;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.concurrent.ScheduledService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import net.Display.Start;
import net.Game.BigCookie;

public class UpdateCookieCount {
    Timeline cookieCount = new Timeline(new KeyFrame(Duration.millis(1), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Start.count.setText(Integer.toString((int)BigCookie.getCookies()) + " cookies");
        }
    }));
    public UpdateCookieCount(){
        cookieCount.setCycleCount(Timeline.INDEFINITE);
        cookieCount.play();
    }

}
