package dk.mrspring.wasteland.ruin;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;

public class RuinConfig
{
	public static String[] ruinedCiv1Loot;
	public static String[] barnHouseLoot;
	public static int lightpostsRarity;
	public static int randomFireRarity;
	public static int ruinedCiv1Rarity;
	public static int ruinedCiv2Rarity;
	public static int randomRubbleRarity;
	public static int survivorTentRarity;
	public static int barnHouseRarity;
	public static int treeHouseRarity;
	public static int ruinedRarity;
	
	public static void load(Configuration config)
	{
		config.load();
			ruinedCiv1Loot = config.get("Items", "Ruined Civ 1 chest items", new String[] { String.valueOf(Item.getIdFromItem(Items.mushroom_stew)), String.valueOf(Item.getIdFromItem(Items.stick)), String.valueOf(Item.getIdFromItem(Items.bread)), String.valueOf(Item.getIdFromItem(Items.wheat)), String.valueOf(Item.getIdFromItem(Items.gunpowder)), String.valueOf(Item.getIdFromItem(Items.string)), String.valueOf(Item.getIdFromItem(Items.water_bucket)), String.valueOf(Block.getIdFromBlock(Blocks.planks)), String.valueOf(Item.getIdFromItem(Items.redstone)), String.valueOf(Item.getIdFromItem(Items.record_blocks)), String.valueOf(Item.getIdFromItem(Items.record_strad)), String.valueOf(Item.getIdFromItem(Items.dye)) }).getStringList();
			barnHouseLoot = config.get("Items", "Barn House chest items", new String[] { String.valueOf(Item.getIdFromItem(Items.wheat)), String.valueOf(Item.getIdFromItem(Items.apple)), String.valueOf(Item.getIdFromItem(Items.bread)), String.valueOf(Item.getIdFromItem(Items.water_bucket)), String.valueOf(Block.getIdFromBlock(Blocks.hay_block)), String.valueOf(Item.getIdFromItem(Items.wheat_seeds)) }).getStringList();
			lightpostsRarity = config.get("Rarity", "Lightposts Rarity", 10).getInt(10);
			randomFireRarity = config.get("Rarity", "Random Fire Rarity", 6).getInt(6);
			ruinedCiv1Rarity = config.get("Rarity", "Ruined Civ 1 Rarity", 4).getInt(4);
			ruinedCiv2Rarity = config.get("Rarity", "Ruined Civ 2 Rarity", 3).getInt(3);
			randomRubbleRarity = config.get("Rarity", "Random Rubble Rarity", 16).getInt(16);
			survivorTentRarity = config.get("Rarity", "Survivor Tent Rarity", 64).getInt(64);
			barnHouseRarity = config.get("Rarity", "Barn House Rarity", 5).getInt(5);
			treeHouseRarity = config.get("Rarity", "Tree House Rarity", 64).getInt(64);
			ruinedRarity = config.get("Rarity", "Ruined Ruin Rarity", 3).getInt(3);
		config.save();
	}
	
	public static ItemStack[] getLoot(String[] itemsAsStrings)
	{
		ItemStack[] items = new ItemStack[itemsAsStrings.length];
		
		for(int i = 0; i < items.length; i++)
		{
			items[i] = new ItemStack(Item.getItemById(Integer.parseInt(itemsAsStrings[i])));
		}
		
		return items;
	}
}
