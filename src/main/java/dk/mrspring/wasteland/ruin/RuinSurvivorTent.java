package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;

public class RuinSurvivorTent extends Ruin implements IWorldGenerator
{
	private RuinGenHelper genHelper = new RuinGenHelper();
	
	public RuinSurvivorTent(String par1Name)
	{
		super(par1Name);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		Material material = world.getBlock(x, y, z).getMaterial();
		Material material1 = world.getBlock(x, y + 1, z).getMaterial();
		Material material2 = world.getBlock(x + 1, y + 1, z).getMaterial();
		Material material3 = world.getBlock(x - 1, y + 1, z).getMaterial();
		Material material4 = world.getBlock(x, y + 1, z + 1).getMaterial();
		Material material5 = world.getBlock(x, y + 1, z - 1).getMaterial();
		if ((material.isSolid()) && (!material1.isSolid()) && (!material4.isSolid()) && (!material2.isSolid()) && (!material3.isSolid()) && (!material5.isSolid()))
		{
			int xCoord = x;
			int yCoord = y;
			int zCoord = z;
			
			// Layer 1 generation
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.chest);
			// TODO: Chest Loot for: Tent
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.dirt);
			
			genHelper.setBlock(xCoord, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.planks);
			genHelper.setBlock(xCoord, yCoord, zCoord + 0, Blocks.planks);
			genHelper.setBlock(xCoord, yCoord - 1, zCoord + 0, Blocks.tnt);
			genHelper.setBlock(xCoord, yCoord, zCoord + 1, Blocks.planks);
			genHelper.setBlock(xCoord, yCoord, zCoord + 2, Blocks.dirt);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.dirt);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.dirt);
			
			// Layer 2 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.wool);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.wool);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.wool);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.wool);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.wool);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.wool);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord + 0, Blocks.wooden_pressure_plate);
			genHelper.setBlock(xCoord, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.wool);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.wool);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.wool);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.wool);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.wool);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.wool);
			
			// Layer 3 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.wool);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.wool);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.wool);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.wool);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.wool);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.wool);
			
			genHelper.setBlock(xCoord, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.wool);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.wool);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.wool);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.wool);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.wool);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.wool);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.air);
			
			// Layer 4 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.air);
			
			genHelper.setBlock(xCoord, yCoord, zCoord - 3, Blocks.wool);
			genHelper.setBlock(xCoord, yCoord, zCoord - 2, Blocks.wool);
			genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.wool);
			genHelper.setBlock(xCoord, yCoord, zCoord + 0, Blocks.wool);
			genHelper.setBlock(xCoord, yCoord, zCoord + 1, Blocks.wool);
			genHelper.setBlock(xCoord, yCoord, zCoord + 2, Blocks.wool);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.air);
			
			return true;
		}
		return false;
	}
}
