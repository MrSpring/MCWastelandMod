package dk.mrspring.wasteland.world.biome;

import dk.mrspring.wasteland.GameRegisterer;
import dk.mrspring.wasteland.ModConfig;
import dk.mrspring.wasteland.Wasteland;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenWastelandBase extends BiomeGenBase
{
	public static final BiomeGenBase.Height height_Wasteland = new BiomeGenBase.Height(0.1F, 0.05F);
	public static final BiomeGenBase.Height height_DriedOcean = new BiomeGenBase.Height(0.1F, 0.05F);
	
	private static int lastID = 0;
	public static BiomeGenBase[] wastelandBiomes = new BiomeGenBase[16];
	
	public BiomeGenWastelandBase(int par1ID, String par2Name, BiomeGenBase.Height biomeHeight)
	{
		super(par1ID);
		
		this.biomeName = par2Name;
		this.spawnableCreatureList.clear();
		this.setHeight(biomeHeight);
		
		wastelandBiomes[lastID] = this;
		lastID++;
		
		this.theBiomeDecorator = new BiomeDecoratorWasteland();
		
		this.loadBiome();
	}
	
	public static void load()
	{
		GameRegisterer.registerBiome(new BiomeGenApocalypse(ModConfig.apocalypseBiomeID, "Wasteland", height_Wasteland), BiomeDictionary.Type.WASTELAND);
	}
	
	public BiomeGenWastelandBase setTopBlock(Block block)
	{
		this.topBlock = block;
		return this;
	}
	
	public BiomeGenWastelandBase setFillerBlock(Block block)
	{
		this.fillerBlock = block;
		return this;
	}
	
	public void loadBiome()
	{
		this.theBiomeDecorator.deadBushPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = -999;
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.grassPerChunk = -999;
		this.theBiomeDecorator.treesPerChunk = -999;
		
		this.setTopBlock(Blocks.dirt);
		this.setFillerBlock(Blocks.stone);
	}
}
