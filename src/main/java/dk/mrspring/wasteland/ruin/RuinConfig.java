package dk.mrspring.wasteland.ruin;

import cpw.mods.fml.common.registry.GameRegistry;
import dk.mrspring.wasteland.world.gen.WastelandGeneratorInfo;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;

public class RuinConfig
{
	public static String[] ruinedCiv1LootRaw;
	public static String[] barnHouseLootRaw;
	public static int lightpostsRarity;
	public static int randomFireRarity;
	public static int ruinedCiv1Rarity;
	public static int ruinedCiv2Rarity;
	public static int randomRubbleRarity;
	public static int survivorTentRarity;
	public static int barnHouseRarity;
	public static int treeHouseRarity;
	public static int ruinedRarity;
	public static int spawnerRarity;
	
	public static void load(Configuration config)
	{
		config.load();
			ruinedCiv1LootRaw = config.get("Items", "Ruined Civ 1 chest items", new String[] { "minecraft:mushroom_stew", "minecraft:stick", "minecraft:bread", "minecraft:wheat", "minecraft:gunpowder", "minecraft:string", "minecraft:water_bucket", "minecraft:planks", "minecraft:redstone", "minecraft:record_blocks", "minecraft:record_strad", "minecraft:dye" }).getStringList(); 
			//{ String.valueOf(Item.getIdFromItem(Items.mushroom_stew)), String.valueOf(Item.getIdFromItem(Items.stick)), String.valueOf(Item.getIdFromItem(Items.bread)), String.valueOf(Item.getIdFromItem(Items.wheat)), String.valueOf(Item.getIdFromItem(Items.gunpowder)), String.valueOf(Item.getIdFromItem(Items.string)), String.valueOf(Item.getIdFromItem(Items.water_bucket)), String.valueOf(Block.getIdFromBlock(Blocks.planks)), String.valueOf(Item.getIdFromItem(Items.redstone)), String.valueOf(Item.getIdFromItem(Items.record_blocks)), String.valueOf(Item.getIdFromItem(Items.record_strad)), String.valueOf(Item.getIdFromItem(Items.dye)) }).getStringList();
			barnHouseLootRaw = config.get("Items", "Barn House chest items", new String[] { "minecraft:wheat", "minecraft:apple", "minecraft:bread", "minecraft:water_bucket", "minecraft:hay_block", "minecraft:wheat_seeds" }).getStringList();
			//{ String.valueOf(Item.getIdFromItem(Items.wheat)), String.valueOf(Item.getIdFromItem(Items.apple)), String.valueOf(Item.getIdFromItem(Items.bread)), String.valueOf(Item.getIdFromItem(Items.water_bucket)), String.valueOf(Block.getIdFromBlock(Blocks.hay_block)), String.valueOf(Item.getIdFromItem(Items.wheat_seeds)) }).getStringList();
			lightpostsRarity = config.get("Rarity", "Lightposts Rarity", 10).getInt(10);
			ruinedCiv1Rarity = config.get("Rarity", "Ruined Civ 1 Rarity", 4).getInt(4);
			ruinedCiv2Rarity = config.get("Rarity", "Ruined Civ 2 Rarity", 3).getInt(3);
			survivorTentRarity = config.get("Rarity", "Survivor Tent Rarity", 64).getInt(64);
			barnHouseRarity = config.get("Rarity", "Barn House Rarity", 5).getInt(5);
			treeHouseRarity = config.get("Rarity", "Tree House Rarity", 64).getInt(64);
			ruinedRarity = config.get("Rarity", "Ruined Ruin Rarity", 3).getInt(3);
			spawnerRarity = config.get("Rarity", "Spawner Rarity", 1).getInt(1);
		config.save();
	}
	
	public static ItemStack[] getLoot(String[] rawStringArray)
	{
		ItemStack[] items = new ItemStack[rawStringArray.length];
		for(int i = 0; i < rawStringArray.length; i++)
		{
			//String modid = rawStringArray[i].split(":")[1], name = rawStringArray[i].split(":")[2];
			String modidAndName[] = rawStringArray[i].split(":");
			String modid = modidAndName[0], name = modidAndName[1];
			
			items[i] = GameRegistry.findItemStack(modid, name, 1);
		}
		
		return items;
		
		/*ItemStack[] items = new ItemStack[rawStringArray.length];
		
		for(int i = 0; i < items.length; i++)
		{
			items[i] = new ItemStack(Item.getItemById(Integer.parseInt(rawStringArray[i])));
		}
		
		return items;*/
	}
}
