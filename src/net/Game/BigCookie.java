package net.Game;

public class BigCookie {
    private static String playerID;
    public static double cookies;

    public static String getPlayerID() {
        return playerID;
    }

    public static void setPlayerID(String playerID) {
        BigCookie.playerID = playerID;
    }

    public static double getCookies() {
        return cookies;
    }

    public static void setCookies(double cookies) {
        BigCookie.cookies = cookies;
    }
}
