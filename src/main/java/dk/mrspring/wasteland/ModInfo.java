package dk.mrspring.wasteland;

public class ModInfo
{
	public static final String modid = "WLM";
	public static final String name = "The Wasteland Mod";
	public static final String version = "DEV 1.1.0";
	public static final boolean isDev = version.contains("DEV");
	
	/**
	 * Returns a string formatted: "X, Y, Z"
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static String getCoordAsString(int x, int y, int z)
	{
		return String.valueOf(x + ", " + y + ", " + z);
	}
	
	/**
	 * Returns a string formatted: "X, Z"
	 * 
	 * @param x
	 * @param z
	 * @return
	 */
	public static String getCoordAsString(int x, int z)
	{
		return String.valueOf(x + ", " + z);
	}
}