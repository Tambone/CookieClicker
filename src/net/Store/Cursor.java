package net.Store;


public class Cursor extends Item {
    public Cursor(){
        init();
    }

    @Override
    public void setCPM() {
        CPM = 1;
    }

    @Override
    public void setUpgradeModifier() {
        upgradeModifier = 1.0;
    }

    @Override
    public void setCost() {
        cost = (int)(Math.pow(Math.E, 0.05 * amt) + amt);
    }

}
