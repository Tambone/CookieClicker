package net.Periodic;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.util.Duration;
import net.Game.CookieClicker;

public class Calculate {
    ScheduledService<Double> calculateCookies = new ScheduledService<Double>() {
        @Override
        protected Task<Double> createTask() {
            return new Task<Double>() {
                @Override
                protected Double call() throws Exception {
                    CookieClicker.setCookies(CookieClicker.getCookies() + (CookieClicker.cursor.passCPS() / 10) + (CookieClicker.grandma.passCPS() / 10));
                    return CookieClicker.getCookies() + (CookieClicker.cursor.passCPS() / 10) + (CookieClicker.grandma.passCPS()/ 10);
                }
            };
        }
    };
    public Calculate(){
        calculateCookies.setPeriod(Duration.millis(100));
        calculateCookies.start();
    }
}
