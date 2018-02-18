package net.Store;

public class Grandma extends Item {
    public Grandma(){
        init();
    }

    @Override
    public void setCPM() {
        CPM = 5;
    }

    @Override
    public void setUpgradeModifier() {
        upgradeModifier = 1.0;
    }

    @Override
    public void setCost() {
        cost = (int)(Math.pow(Math.E, 0.05 *amt) +  amt + 19);
    }
}
