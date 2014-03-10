package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class ModConfig
{
	public static int wastelandBiomeID;
	public static int wastelandTreeSpawnRate;
	
	public static void load(Configuration config)
	{
		config.load();
			wastelandBiomeID = config.get("IDs", "Wasteland Biome ID", 43).getInt(43);
			wastelandTreeSpawnRate = config.get("Worldgen", "How common the Wasteland trees are. Higher values: more trees", 8).getInt(8);
		config.save();
	}
}
