package plugin;

import java.io.FileOutputStream;

import graphmodel.SerializedGraph;

/**
 * The importer interface is used to import a graph from a file into the intern representation.
 * The main task is to parse a FileInputStream  into the Interface of an {@link AbstractGraphModelBuilder}.
 * The {@link AbstractGraphModelBuilder} will then build the representation. 
 *
 */
public interface Exporter {

	/**
	 * Get all filetypes which this importer can parse
	 * 
	 * @return 
	 */
	public String getSupportedFileEndings();

	/**
	 * Get the name of this importer
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * This method writes an {@link SerializedGraph} into an FileOutputStream.
	 * 
	 * @param graph
	 * @param filestream 
	 */
	public void exportGraph(SerializedGraph graph, FileOutputStream filestream); 

}
