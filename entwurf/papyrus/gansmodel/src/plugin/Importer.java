package plugin;

import graphmodel.AbstractGraphModelBuilder;
import java.io.FileInputStream;

public interface Importer {

	/**
	 * 
	 * @return 
	 */
	public String getSupportedFileEndings();

	/**
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * 
	 * @param builder 
	 * @param filestream 
	 */
	public void importGraph(AbstractGraphModelBuilder builder, FileInputStream filestream); 

}
