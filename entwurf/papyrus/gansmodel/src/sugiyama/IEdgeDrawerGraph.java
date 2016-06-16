package sugiyama;

import java.util.List;
import java.util.Set;

import graphmodel.DirectedEdge;
import graphmodel.DirectedGraph;
import graphmodel.Vertex;
import sugiyama.SugiyamaGraph.SugiyamaEdge;

public interface IEdgeDrawerGraph  extends SugiyamaStepGraph {
	
	/**
	 * Reverses the direction of an directed edge and returns it.
	 * 
	 * @param edge the edge to return its direction
	 */
	public void reverseEdge(SugiyamaEdge edge);
	
	/**
	 * Reverses all previously reversed edges
	 * @return the set of edges, which have been reversed.
	 */
	public Set<SugiyamaEdge> reverseAllEdges();
	
	/**
	 * Adds a new edge corner to the specified edge.
	 * The index specifies the position between other edge corners.
	 * Every edge corner is connected with the corners with index +/- 1 of it's index. 
	 * Counting starts at 0 at the endpoint at the source vertex of the edge.
	 * End- and startpoint are also counted as corners
	 * 
	 * @param edge  the edge to add a new corner
	 * @param x 	the x coordinate of the corner
	 * @param y 	the y coordinate of the corner
	 * @param index the index on the edge of the corner
	 */
	public void addEdgeCorner(SugiyamaEdge edge, int x, int y, int index);
	
	/**
	 * Removes the corner on the specified edge at the index
	 * @param edge  the edge to remove the corner
	 * @param index the index of the corner to remove
	 */
	public void removeEdgeCorner(SugiyamaEdge edge, int index);
	
	/**
	 * Returns a list of points, which describe the coordinates of the edges
	 * @param edge the edge
	 * @return	   the list of points of the corners on the edge
	 */
	public List<Point> getEdgeCorners(SugiyamaEdge edge);
	
	public class Point 
	{
		public final int x;
		public final int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
