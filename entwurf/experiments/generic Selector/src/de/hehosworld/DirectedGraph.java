package de.hehosworld;

import java.util.Random;

/**
 * Created by Sven on 08.06.2016.
 */
public class DirectedGraph extends Graph {
    public int number;

    public DirectedGraph(String name) {
        super(name);
        this.number = new Random().nextInt();
    }

    public DirectedGraph(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
