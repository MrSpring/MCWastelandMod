package dk.mrspring.wasteland.block;

import cpw.mods.fml.common.registry.GameRegistry;
import dk.mrspring.wasteland.GameRegisterer;
import dk.mrspring.wasteland.ModInfo;
import dk.mrspring.wasteland.Wasteland;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWLM extends Block
{
	public BlockWLM(Material mat, String name)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModInfo.modid + ":" + name);
	}
	
	public BlockWLM(Material mat, String name, String textureName)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModInfo.modid + ":" + textureName);
	}
	
	public static void load()
	{
		GameRegisterer.registerBlock(new BlockTV(Material.circuits, "tv").setCreativeTab(Wasteland.tabWastelandBlocks));
	}
}
