package dk.mrspring.wasteland.item;

import dk.mrspring.wasteland.GameRegisterer;
import dk.mrspring.wasteland.ModHelper;
import dk.mrspring.wasteland.Wasteland;
import net.minecraft.item.Item;

public class ItemWLM extends Item
{
	protected ItemWLM(String name)
	{
		this(name, name);
	}
	
	protected ItemWLM(String name, String tName)
	{
		super();
		
		this.setTextureName(ModHelper.ModInfo.modid + ":" + tName);
		this.setUnlocalizedName(name);
	}
	
	public static void load()
	{
		GameRegisterer.registerItem(new ItemBag("bag").setCreativeTab(Wasteland.tabWastelandItems));
	}
}
