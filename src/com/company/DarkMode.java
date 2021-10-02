package com.company;

public class DarkMode extends Addons {
    Browser browser;

    public DarkMode(Browser browser) {
        this.browser = browser;
    }

    public String getDescription() {
        return browser.getDescription() + " + DarkMode";
    }

    public double size() {
        return 4.8 + browser.size();
    }
}
