package dk.mrspring.wasteland.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import dk.mrspring.wasteland.BlockInfo;
import dk.mrspring.wasteland.GameRegisterer;
import dk.mrspring.wasteland.ModHelper;
import dk.mrspring.wasteland.Wasteland;

public class BlockWLM extends Block
{
	public BlockWLM(Material mat, String name)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModHelper.ModInfo.modid + ":" + name);
	}
	
	public BlockWLM(Material mat, String name, String textureName)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModHelper.ModInfo.modid + ":" + textureName);
	}
	
	public static void load()
	{
		GameRegisterer.registerBlock(new BlockTV(Material.circuits, BlockInfo.tvName).setCreativeTab(Wasteland.tabWastelandBlocks));
		GameRegisterer.registerBlock(new BlockWLM(Material.ground, BlockInfo.driedSandName).setCreativeTab(Wasteland.tabWastelandBlocks));
		GameRegisterer.registerBlock(new BlockBurntLog(BlockInfo.burntLogName).setCreativeTab(Wasteland.tabWastelandBlocks));
	}
}
