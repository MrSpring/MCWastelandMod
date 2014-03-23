package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.registry.GameRegistry;

public class GameRegisterer
{
	public static void registerBlock(Block block)
	{
		registerBlock(block, block.getUnlocalizedName().replace("tile.", ""));
	}
	
	public static void registerBlock(Block block, String name)
	{
		GameRegistry.registerBlock(block, name);
	}
	
	
	
	public static void registerItem(Item item)
	{
		registerItem(item, item.getUnlocalizedName().replace("item.", ""));
	}
	
	public static void registerItem(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
	}
	
	
	
	public static void registerBiome(BiomeGenBase biome, Type... types)
	{
		BiomeDictionary.registerBiomeType(biome, types);
	}
}
