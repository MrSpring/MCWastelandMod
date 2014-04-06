package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class ModConfig
{
	public static int apocalypseBiomeID;
	public static int driedOceanID;
	public static int burntForestID;
	public static int wastelandTreesPreChunk;
	public static int wastelandTreeHeight;
	public static int randomFirePerChunk;
	
	public static void load(Configuration config)
	{
		config.load();
			apocalypseBiomeID = config.get("IDs", "Wasteland Biome ID", 43).getInt(43);
			wastelandTreesPreChunk = config.get("Worldgen", "How many time trees will try and generate per chunk", 8).getInt(8);
			wastelandTreeHeight = config.get("Worldgen", "The height of the small wasteland trees", 5).getInt(5);
			randomFirePerChunk = config.get("Worldgen", "Random Fire per Chunk", 1).getInt(1);
		config.save();
	}
}
