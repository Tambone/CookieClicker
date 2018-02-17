package net.Store;


public class Cursor extends DefaultItem {

    @Override
    public void setCPM() {
        CPM = 1/60;
    }

    @Override
    public void setUpgradeModifier() {
        upgradeModifier = 1.0;
    }
}
