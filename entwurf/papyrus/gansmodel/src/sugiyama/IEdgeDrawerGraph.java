package sugiyama;

import java.util.List;
import java.util.Set;

import graphmodel.LayeredGraph;
import sugiyama.SugiyamaGraph.SugiyamaEdge;
import sugiyama.SugiyamaGraph.SugiyamaVertex;

public interface IEdgeDrawerGraph  extends LayeredGraph<SugiyamaVertex, SugiyamaEdge> {
	
	/**
	 * Reverses the direction of an directed edge and returns it.
	 * 
	 * @param edge the edge to return its direction
	 */
	public void reverseEdge(SugiyamaEdge edge);
	
	/**
	 * Deletes the supplement edges, which have been created when an edge was reversed.
	 * Adds all reversed edges back to the set of edges and returns them.
	 * 
	 * @return the set of edges, which have been restored.
	 */
	public Set<SugiyamaEdge> restoreAllEdges();
	
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
	
	/**
	 * Returns the set of all with {@code reverseEdge(E edge)} reversed edges.
	 * 
	 * @return the set of all reversed edges.
	 */
	public Set<SugiyamaEdge> getReversedEdges();
	
	/**
	 * This class is a standard immutable 2D Vector with integer values as it's components.
	 */
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
