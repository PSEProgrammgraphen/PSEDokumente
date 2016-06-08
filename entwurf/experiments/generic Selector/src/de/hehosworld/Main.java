package de.hehosworld;

public class Main {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph("torsten", 3);
        DirectedGraphLayouter layouter = new DirectedGraphLayouter();
        SubgraphSelector subgraphSelector = new SubgraphSelector();

        layouter.doLayout(subgraphSelector.getSubgraph(graph));
    }
}
