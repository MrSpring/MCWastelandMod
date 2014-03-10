package dk.mrspring.wasteland.world.biome;

import dk.mrspring.wasteland.world.gen.WorldGenWastelandBigTree;
import dk.mrspring.wasteland.world.gen.WorldGenWastelandSmallTree;

public class BiomeGenApocalypse extends BiomeGenWastelandBase
{
	public BiomeGenApocalypse(int par1ID, String par2Name, Height par3BiomeHeight)
	{
		super(par1ID, par2Name, par3BiomeHeight);
	}
	
	@Override
	public void loadBiome()
	{
		super.loadBiome();
		this.theBiomeDecorator.treesPerChunk = 2;
		this.worldGeneratorTrees = new WorldGenWastelandSmallTree(true);
		this.worldGeneratorBigTree = new WorldGenWastelandBigTree(true);
	}
}
