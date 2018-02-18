package net.Store;

import net.Game.CookieClicker;

public abstract class Item {
    int amt;
    int cost;
    double CPM;
    double upgradeModifier;

    public void buy(int queue){
        if(CookieClicker.getCookies() >= (cost * queue)){
            amt += queue;
            CookieClicker.setCookies(CookieClicker.getCookies() - (cost * queue));
        }


    }
    public void sell(int queue){
        amt-= queue;
        CookieClicker.setCookies(CookieClicker.getCookies() + (cost * queue));
    }
    public double passCPS(){
        return (amt * CPM * upgradeModifier) / 60;
    }
    public void init(){
        setCPM();
        setUpgradeModifier();
        setCost();
    }
    public abstract void setCPM();
    public abstract void setUpgradeModifier();
    public abstract void setCost();

    public int getAmt(){
        return amt;
    }
    public int getCost(){
        return cost;
    }
}
