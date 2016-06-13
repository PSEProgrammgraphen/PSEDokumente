package plugin;

import graphmodel.AbstractGraphModelBuilder;
import java.io.FileInputStream;

/**
 * The importer interface is used to import a graph from a file into the intern representation.
 * The main task is to parse a FileInputStream  into the Interface of an {@link AbstractGraphModelBuilder}.
 * The {@link AbstractGraphModelBuilder} will then build the representation. 
 *
 */
public interface Importer {

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
	 * This method parses an FileInputStream into an {@link AbstractGraphModelBuilder}.
	 * 
	 * @param builder 
	 * @param filestream 
	 */
	public void importGraph(AbstractGraphModelBuilder builder, FileInputStream filestream); 

}
