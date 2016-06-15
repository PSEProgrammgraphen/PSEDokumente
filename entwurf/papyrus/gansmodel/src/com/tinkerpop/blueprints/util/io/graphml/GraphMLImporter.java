package com.tinkerpop.blueprints.util.io.graphml;

import graphmodel.IGraphModelBuilder;
import java.io.InputStream;

/**
 * 
 * GraphMLReader writes the data from a GraphML stream to a graph.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @author Alex Averbuch (alex.averbuch@gmail.com)
 * @author Joshua Shinavier (http://fortytwo.net)
 
 * @author
 */
public class GraphMLImporter {

	/**
	 * 
	 * Input the GraphML stream data into the graph.
	 * More control over how data is streamed is provided by this method.
	 *
	 * @param inputGraph         the graph to populate with the GraphML data
	 * @param graphMLInputStream an InputStream of GraphML data
	 * @param bufferSize         the amount of elements to hold in memory before committing a transactions (only valid for TransactionalGraphs)
	 * @param vertexIdKey        if the id of a vertex is a &lt;data/&gt; property, fetch it from the data property.
	 * @param edgeIdKey          if the id of an edge is a &lt;data/&gt; property, fetch it from the data property.
	 * @param edgeLabelKey       if the label of an edge is a &lt;data/&gt; property, fetch it from the data property.
	 * @throws IOException thrown when the GraphML data is not correctly formatted
	 
	 * @param builder 
	 * @param graphMLInputStream 
	 */
	public static void inputGraph(IGraphModelBuilder builder, InputStream graphMLInputStream) { 
		// TODO Auto-generated method
	 } 

}
