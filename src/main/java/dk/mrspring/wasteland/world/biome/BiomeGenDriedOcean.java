package dk.mrspring.wasteland.world.biome;

import dk.mrspring.wasteland.WastelandBlocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDriedOcean extends BiomeGenWastelandBase
{
	public BiomeGenDriedOcean(int id, String name, BiomeGenBase.Height height)
	{
		super(id, name, height);
	}
	
	@Override
	public void loadBiome()
	{
		super.loadBiome();
		this.topBlock = WastelandBlocks.driedSand;
		
		this.theBiomeDecorator.treesPerChunk = -999;
	}
}
