package dk.mrspring.wasteland.world.biome;

import dk.mrspring.wasteland.WastelandBlocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBurntForest extends BiomeGenWastelandBase
{
	public BiomeGenBurntForest(int id, String name, BiomeGenBase.Height height)
	{
		super(id, name, height);
	}
	
	@Override
	public void loadBiome()
	{
		super.loadBiome();
		
		this.topBlock = WastelandBlocks.burntGrass;
	}
}
