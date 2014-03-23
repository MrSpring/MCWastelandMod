package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import cpw.mods.fml.common.registry.GameRegistry;

public class WastelandBlocks
{
	public static final Block tv = GameRegistry.findBlock(ModHelper.ModInfo.modid, BlockInfo.tvName);
	public static final Block driedSand = GameRegistry.findBlock(ModHelper.ModInfo.modid, BlockInfo.driedSandName);
	public static final Block burntLog = GameRegistry.findBlock(ModHelper.ModInfo.modid, BlockInfo.burntLogName);
	public static final Block burntGrass = GameRegistry.findBlock(ModHelper.ModInfo.modid, BlockInfo.burntGrassName);
}
