package com.company;

public class Main {

    public static void main(String[] args) {
        Browser safari = new Safari();
        System.out.println(safari.getDescription() + " " + safari.size() + "MB");
        safari = new AdGuard(safari);
        safari = new EvernoteWebClipper(safari);
        safari = new DarkMode(safari);
        System.out.println(safari.getDescription() + " " + safari.size() + "MB ");

        Browser chrome = new Chrome();
        chrome = new DarkMode(chrome);
        chrome = new Grammarly(chrome);
        chrome = new EvernoteWebClipper(chrome);
        System.out.println(chrome.getDescription() + " " + chrome.size() + "MB");
    }
}
