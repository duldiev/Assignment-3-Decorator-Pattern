package com.company;

public class EvernoteWebClipper extends Addons {
    Browser browser;

    public EvernoteWebClipper(Browser browser) {
        this.browser = browser;
    }

    public String getDescription() {
        return browser.getDescription() + " + Evernote Web Clipper";
    }

    public double size() {
        return 11.1 + browser.size();
    }
}
