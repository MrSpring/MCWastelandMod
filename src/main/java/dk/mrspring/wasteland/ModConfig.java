package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class ModConfig
{
	public static int wastelandBiomeID;
	public static int driedOceanID;
	public static int burntForestID;
	public static int wastelandTreeSpawnRate;
	
	public static void load(Configuration config)
	{
		config.load();
			wastelandBiomeID = config.get("IDs", "Wasteland Biome ID", 43).getInt(43);
			driedOceanID = config.get("IDs", "Dried Ocean Biome ID", 44).getInt(43);
			burntForestID = config.get("IDs", "Burnt Forest Biome ID", 45).getInt(44);
			wastelandTreeSpawnRate = config.get("Worldgen", "How common the Wasteland trees are. Higher values: more trees", 8).getInt(8);
		config.save();
	}
}
