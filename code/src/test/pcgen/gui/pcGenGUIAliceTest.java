package pcgen.gui;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests a Modern Fast Hero 3/Infiltrator 3.
 * See the PCG file for details
 */
@SuppressWarnings("nls")
public class pcGenGUIAliceTest extends pcGenGUITestCase
{

	/**
	 * 
	 */
	public pcGenGUIAliceTest()
	{
		// Empty Constructor
	}

	/**
	 * standard JUnit style constructor
	 * 
	 * @param name
	 */
	public pcGenGUIAliceTest(String name)
	{
		super(name);
	}

	/**
	 * @return A <tt>TestSuite</tt>
	 */
	public static Test suite()
	{
		return new TestSuite(pcGenGUIAliceTest.class);
	}

	/**
	 * Loads and outputs the character.
	 * 
	 * @throws Exception If an error occurs.
	 */
	public void testCode() throws Exception
	{
		runTest("Alice", "35e");
	}
}
