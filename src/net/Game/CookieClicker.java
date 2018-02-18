package net.Game;

import net.Periodic.Calculate;
import net.Store.Cursor;
import net.Store.Grandma;
import net.Store.Item;

public class CookieClicker {
    private static String playerID;
    public static double cookies;
    public static Cursor cursor = new Cursor();
    public static Grandma grandma = new Grandma();


    public static String getPlayerID() {
        return playerID;
    }

    public static void setPlayerID(String playerID) {
        CookieClicker.playerID = playerID;
    }

    public static double getCookies() {
        return cookies;
    }

    public static void setCookies(double cookies) {
        CookieClicker.cookies = cookies;
    }
}
