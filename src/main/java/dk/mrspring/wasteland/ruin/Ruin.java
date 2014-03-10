package dk.mrspring.wasteland.ruin;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import dk.mrspring.wasteland.WastelandBiomes;
import dk.mrspring.wasteland.world.biome.BiomeGenWastelandBase;
import net.minecraft.world.biome.BiomeGenBase;

public class Ruin
{
	protected String name;
	protected int id;
	protected int rarity = 1;
	protected int weight = 10;
	protected ItemStack[] loot;
	protected BiomeGenBase[] allowedBiomes;
	
	private int lastID = 0;
	
	public static Ruin[] ruins = new Ruin[32];
	
	public static Ruin lightposts;
	public static Ruin randomFire;
	public static Ruin ruinedCiv1;
	public static Ruin ruinedCiv2;
	public static Ruin randomRubble;
	public static Ruin survivorTent;
	public static Ruin barnHouse;
	public static Ruin treeHouse;
	public static Ruin ruined;
	
	public static void load()
	{
		lightposts = new RuinLightposts("lightposts").setRarity(RuinConfig.lightpostsRarity);
		randomFire = new RuinRandomFire("random_fire").setRarity(RuinConfig.randomFireRarity);
		ruinedCiv1 = new RuinRuinedCiv1("ruined_civ_1").setRarity(RuinConfig.ruinedCiv1Rarity).setLoot(RuinConfig.getLoot(RuinConfig.ruinedCiv1Loot));
		ruinedCiv2 = new RuinRuinedCiv2("ruined_civ_2").setRarity(RuinConfig.ruinedCiv2Rarity);
		randomRubble = new RuinRandomRubble("random_rubble").setRarity(RuinConfig.randomRubbleRarity);
		survivorTent = new RuinSurvivorTent("tent").setRarity(RuinConfig.survivorTentRarity);
		barnHouse = new RuinBarnHouse("barn_house").setRarity(RuinConfig.barnHouseRarity).setLoot(RuinConfig.getLoot(RuinConfig.barnHouseLoot));
		treeHouse = new RuinTreeHouse("tree_house").setRarity(RuinConfig.treeHouseRarity);
		ruined = new RuinRuined("ruined").setRarity(RuinConfig.ruinedRarity);
	}
	
	public Ruin(String par1Name)
	{
		this.name = par1Name;
		
		this.id = lastID;
		this.ruins[id] = this;
		lastID++;
		
		GameRegistry.registerWorldGenerator(this.toIWorldGenerator(), this.weight);
	}
	
	public Ruin setRarity(int par1Rarity)
	{
		this.rarity = par1Rarity;
		return this;
	}
	
	public int getRarity()
	{
		return this.rarity;
	}
	
	public Ruin setWeight(int par1Weight)
	{
		this.weight = par1Weight;
		return this;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public IWorldGenerator toIWorldGenerator()
	{
		IWorldGenerator generator = (IWorldGenerator) this;
		
		return generator;
	}
	
	protected boolean generate(World world, Random random, int x, int y, int z)
	{
		return false;
	}
	
	public Ruin setLoot(ItemStack[] items)
	{
		this.loot = items;
		return this;
	}
	
	public ItemStack[] getLoot()
	{
		return loot;
	}
	
	// IWorldGenerator functions:
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	protected void generateNether(World world, Random random, int i, int j) { }
	
	protected void generateSurface(World world, Random random, int i, int j)
	{
		int xCoord = i + random.nextInt(16);
		int yCoord = world.getHeightValue(i, j);
		int zCoord = j + random.nextInt(16);
		
		if(random.nextInt(this.getRarity()) == 0 && world.getBiomeGenForCoords(xCoord, zCoord) == WastelandBiomes.apocalypse)
			this.generate(world, random, xCoord, yCoord, zCoord);
	}
	
	protected void generateEnd(World world, Random random, int i, int j) { }
}
