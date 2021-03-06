package de.hehosworld;

import java.util.List;

public class Main {
    private static Settings settings;

    public static void main(String[] args) {
        settings = new Settings();
        settings.addParameter("one", new StringParameter("one", "yeah"));
        settings.addParameter("two", new EnumerationParameter("two", Enumeration.ONE));
        settings.addParameter("three", new IntegerParameter("three", 3));
        settings.addParameter("four", new IntegerParameter("four", 4));

        Parameter a = settings.get("three");
        Parameter b = settings.get("four");
        Parameter c = settings.get("one");

        try {
            System.out.println(a.compareTo(b));
        } catch (ClassCastException e) {
            System.out.println("nono");
        }

        try {
            System.out.println(b.compareTo(c));
        } catch (ClassCastException e) {
            System.out.println("nono");
        }
    }
}
