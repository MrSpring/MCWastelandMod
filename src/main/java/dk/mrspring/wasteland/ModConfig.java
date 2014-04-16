package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class ModConfig
{
	public static int apocalypseBiomeID;
	public static int wastelandTreeSpawnRate;
	public static int randomFirePerChunk;
	public static boolean useIconsOnCustomize;
	
	public static void load(Configuration config)
	{
		config.load();
			apocalypseBiomeID = config.get("IDs", "Wasteland Biome ID", 43).getInt(43);
			wastelandTreeSpawnRate = config.get("Worldgen", "The percentage chance a big tree has to spawn in a chunk", 1).getInt(1);
			randomFirePerChunk = config.get("Worldgen", "Random Fire per Chunk", 1).getInt(1);
			useIconsOnCustomize = config.get("ClientSide", "Show icons on the customization of Wasteland WorldType (Edit the items after enabling for a difference)", false).getBoolean(false);
		config.save();
	}
}
