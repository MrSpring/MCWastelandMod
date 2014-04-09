package dk.mrspring.wasteland.world;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dk.mrspring.wasteland.WastelandBiomes;
import dk.mrspring.wasteland.client.GuiCreateWastelandWorld;
import dk.mrspring.wasteland.world.gen.WastelandGeneratorInfo;

public class WorldTypeWasteland extends WorldType
{
	public static WastelandGeneratorInfo genInfo = new WastelandGeneratorInfo();
	
	public WorldTypeWasteland(String name)
	{
		super(name);
	}
	
	public WorldChunkManager getChunkManager(World world)
		{ return new WorldChunkManagerHell(WastelandBiomes.apocalypse, 0.05F); }
	
	@Override
	public IChunkProvider getChunkGenerator(World world, String generatorOptions)
		{ return new ChunkProviderWasteland(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled()); }
	
	@Override
	public boolean isCustomizable()
	{
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void onCustomizeButton(Minecraft instance, GuiCreateWorld guiCreateWorld)
	{
		instance.displayGuiScreen(new GuiCreateWastelandWorld(guiCreateWorld, guiCreateWorld.field_146334_a, genInfo));
	}
}
