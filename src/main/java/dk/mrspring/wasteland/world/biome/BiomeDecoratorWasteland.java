package dk.mrspring.wasteland.world.biome;

import java.util.Random;

import dk.mrspring.wasteland.ModConfig;
import dk.mrspring.wasteland.world.gen.WorldGenRandomFire;
import dk.mrspring.wasteland.world.gen.WorldGenRandomRubble;
import dk.mrspring.wasteland.world.gen.WorldGenWastelandBigTree;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.*;

public class BiomeDecoratorWasteland extends BiomeDecorator
{
	public int firePerChunk;
	public int rubblePerChunk;
	public int deadTreePerChunk;
	public WorldGenerator randomFireGen;
	public WorldGenerator randomRubbleGen;
	public WorldGenerator deadTreeGen;
	
	public BiomeDecoratorWasteland()
	{
		super();
		
		this.randomFireGen = new WorldGenRandomFire();
		this.randomRubbleGen = new WorldGenRandomRubble();
		this.deadTreeGen = new WorldGenWastelandBigTree(true);
		
		this.firePerChunk = 5;
		this.rubblePerChunk = 1;
		this.deadTreePerChunk = ModConfig.wastelandTreesPreChunk;
		
		this.flowersPerChunk = -999;
		this.grassPerChunk = -999;
		this.deadBushPerChunk = 5;
		this.generateLakes = false;
		this.treesPerChunk = -999;
	}
	
	@Override
	public void decorateChunk(World world, Random rand, BiomeGenBase biome, int chunkX, int chunkZ)
	{
		if (this.currentWorld != null)
			throw new RuntimeException("Already decorating!!");
		else
		{
			this.currentWorld = world;
			this.randomGenerator = rand;
			
			this.chunk_X = chunkX;
			this.chunk_Z = chunkZ;
			
			this.genDecorations(biome);
			
			this.currentWorld = null;
			this.randomGenerator = null;
		}
	}
	
	@Override
	protected void genDecorations(BiomeGenBase biome)
	{
		super.genDecorations(biome);
		
		int x, y, z;
		
		boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CUSTOM);
		for(int i = 0; doGen && i < firePerChunk; i++)
		{
			x = chunk_X + randomGenerator.nextInt(16) + 8;
			z = chunk_Z + randomGenerator.nextInt(16) + 8;
			this.randomFireGen.generate(this.currentWorld, this.randomGenerator, x, this.currentWorld.getHeightValue(x, z), z);
		}
		
		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CUSTOM);
		for(int i = 0; doGen && i < rubblePerChunk; i++)
		{
			x = chunk_X + randomGenerator.nextInt(16) + 8;
			z = chunk_Z + randomGenerator.nextInt(16) + 8;
			this.randomRubbleGen.generate(this.currentWorld, this.randomGenerator, x, this.currentWorld.getHeightValue(x, z), z);
		}
		
		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CUSTOM);
		for(int i = 0; doGen && i < deadTreePerChunk; i++)
		{
			if (randomGenerator.nextInt(4) == 1)
			{
				x = chunk_X + randomGenerator.nextInt(16) + 8;
				z = chunk_Z + randomGenerator.nextInt(16) + 8;
				this.deadTreeGen.generate(currentWorld, randomGenerator, x, this.currentWorld.getHeightValue(x, z), z);
			}
		}
	}
}
