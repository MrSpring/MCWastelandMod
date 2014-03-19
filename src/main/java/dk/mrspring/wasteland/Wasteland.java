package dk.mrspring.wasteland;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dk.mrspring.wasteland.block.BlockWLM;
import dk.mrspring.wasteland.ruin.Ruin;
import dk.mrspring.wasteland.ruin.RuinConfig;
import dk.mrspring.wasteland.tileentity.TileEntityTV;
import dk.mrspring.wasteland.world.WorldTypeWasteland;
import dk.mrspring.wasteland.world.biome.BiomeGenApocalypse;
import dk.mrspring.wasteland.world.biome.BiomeGenWastelandBase;
import dk.mrspring.wasteland.world.gen.WorldGenWastelandBigTree;

@Mod(modid=ModInfo.modid, name=ModInfo.name, version=ModInfo.version, useMetadata = true)
public class Wasteland
{
	public static final WorldType wastelandWorldType = new WorldTypeWasteland("wasteland");
	public static final WorldGenWastelandBigTree wastelandTree = new WorldGenWastelandBigTree(true);
	
	@Instance(value = ModInfo.modid)
	public static Wasteland instance;
	
	@SidedProxy(clientSide = "dk.mrspring.wasteland.ClientProxy", serverSide = "dk.mrspring.wasteland.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabWastelandBlocks = new CreativeTabs("tabWastelandBlocks")
	{
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.dirt);
		}
	};
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(new File("config/Wasteland.cfg"));
		Configuration ruinConfig = new Configuration(new File("config/WastelandRuins.cfg"));
		
		GameRegistry.registerTileEntity(TileEntityTV.class, "tileEntityTV");
		
		ModConfig.load(config);
		RuinConfig.load(ruinConfig);
		
		BlockWLM.load();
		BiomeGenWastelandBase.load();
		Ruin.load();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.load();
		
		for(int currentRuinID = 0; currentRuinID < Ruin.ruins.length && Ruin.ruins[currentRuinID] != null; currentRuinID++)
			{ GameRegistry.registerWorldGenerator((IWorldGenerator) Ruin.ruins[currentRuinID], Ruin.ruins[currentRuinID].getWeight()); }
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
