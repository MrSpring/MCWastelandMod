package dk.mrspring.wasteland;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dk.mrspring.wasteland.block.BlockWLM;
import dk.mrspring.wasteland.item.ItemWLM;
import dk.mrspring.wasteland.ruin.Ruin;
import dk.mrspring.wasteland.ruin.RuinConfig;
import dk.mrspring.wasteland.tileentity.TileEntityTV;
import dk.mrspring.wasteland.world.WorldTypeWasteland;
import dk.mrspring.wasteland.world.biome.BiomeGenWastelandBase;
import dk.mrspring.wasteland.world.gen.WorldGenWastelandBigTree;

@Mod(modid=ModHelper.ModInfo.modid, name=ModHelper.ModInfo.name, version=ModHelper.ModInfo.version, useMetadata = true)
public class Wasteland
{
	public static final WorldType wastelandWorldType = new WorldTypeWasteland("wasteland");
	public static final WorldGenWastelandBigTree wastelandTree = new WorldGenWastelandBigTree(true);
	
	@Instance(value = ModHelper.ModInfo.modid)
	public static Wasteland instance;
	
	@SidedProxy(clientSide = "dk.mrspring.wasteland.ClientProxy", serverSide = "dk.mrspring.wasteland.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabWastelandBlocks = new CreativeTabs("tabWastelandBlocks")
	{
		@SideOnly(Side.CLIENT)
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.dirt);
		}
	};
	
	public static CreativeTabs tabWastelandItems = new CreativeTabs("tabWastelandItems")
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.wheat;
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
		ItemWLM.load();
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
