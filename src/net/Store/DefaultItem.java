package net.Store;

public abstract class DefaultItem {
    static int amt;
    double CPM;
    static double upgradeModifier;

    public static void buy(int queue){
        amt += queue;
    }
    public static void sell(int queue){
        amt-= queue;
    }
    public double passCPM(){
        return amt * CPM * upgradeModifier;
    }
    public abstract void setCPM();
    public abstract void setUpgradeModifier();

}
