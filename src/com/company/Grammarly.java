package com.company;

public class Grammarly extends Addons {
    Browser browser;

    public Grammarly(Browser browser) {
        this.browser = browser;
    }

    public String getDescription() {
        return browser.getDescription() + " + Grammarly";
    }

    public double size() {
        return 52.4 + browser.size();
    }
}
