package dk.mrspring.wasteland;

import net.minecraft.util.MathHelper;

public class ModInfo
{
	public static final String modid = "WLM";
	public static final String name = "The Wasteland Mod";
	public static final String version = "DEV 1.1.0";
	public static final boolean isDev = version.contains("DEV");
	
	public static final int SOUTH = 0;
	public static final int WEST = 1;
	public static final int NORTH = 2;
	public static final int EAST = 3;
	
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
	
	public static int getRotationAsDirection(int yaw)
	{
		return MathHelper.floor_double((double)(yaw * 4.0F / 360.0F) + 0.5D) & 3;
	}
}