package dk.mrspring.wasteland;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class WastelandBlocks
{
	public static final Block testBlock = GameRegistry.findBlock(ModInfo.modid, "test_block");
	public static final Block toaster = GameRegistry.findBlock(ModInfo.modid, "toaster");
}
