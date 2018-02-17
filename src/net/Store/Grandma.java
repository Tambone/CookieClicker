package net.Store;

public class Grandma extends DefaultItem {

    @Override
    public void setCPM() {
        CPM = 1/20;
    }

    @Override
    public void setUpgradeModifier() {
        upgradeModifier = 1.0;
    }
}
