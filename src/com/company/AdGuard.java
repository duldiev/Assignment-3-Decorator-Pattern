package com.company;

public class AdGuard extends Addons {
    Browser browser;

    public AdGuard(Browser browser) {
        this.browser = browser;
    }

    public String getDescription() {
        return browser.getDescription() + " + AdGuard";
    }

    public double size() {
        return 5.20 + browser.size();
    }
}
