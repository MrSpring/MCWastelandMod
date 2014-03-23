package dk.mrspring.wasteland.world;

import dk.mrspring.wasteland.ModHelper;
import dk.mrspring.wasteland.Wasteland;
import dk.mrspring.wasteland.WastelandBiomes;
import dk.mrspring.wasteland.world.biome.BiomeGenWastelandBase;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldTypeWasteland extends WorldType
{
	public WorldTypeWasteland(String name)
		{ super(name); }
	
	public WorldChunkManager getChunkManager(World world)
		{ return new WorldChunkManagerHell(WastelandBiomes.apocalypse, 0.5F); }
	
	@Override
	public IChunkProvider getChunkGenerator(World world, String generatorOptions)
		{ return new ChunkProviderWasteland(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled()); }
	
	@Override
	public boolean showWorldInfoNotice()
		{ return ModHelper.ModInfo.isDev; }
}
