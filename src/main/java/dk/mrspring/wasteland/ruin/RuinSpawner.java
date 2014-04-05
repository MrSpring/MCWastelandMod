package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;
import dk.mrspring.wasteland.ModHelper;

public class RuinSpawner extends Ruin implements IWorldGenerator
{
	private RuinGenHelper genHelper = new RuinGenHelper();
	
	public RuinSpawner(String name)
	{
		super(name);
	}
	
	protected boolean generate(World world, Random random, int xCoord, int yCoord, int zCoord)
	{
		/*	  	  A X+
		 *		  |
		 *  Z- <-- --> Z+
		 *	  	  |
		 *	  	  V X-
		 */
		
		if(world.getHeightValue(xCoord + 4, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord - 1) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord + 0) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord + 1) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord + 2) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord + 3) == yCoord &&
		   world.getHeightValue(xCoord + 4, zCoord + 4) == yCoord &&
		   
		   world.getHeightValue(xCoord + 3, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord + 3, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord + 2, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord + 2, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord + 1, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord + 1, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord + 0, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord + 0, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord - 1, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord - 1, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord - 2, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord - 2, zCoord + 5) == yCoord &&
		  
		   world.getHeightValue(xCoord - 3, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord - 3, zCoord + 5) == yCoord &&
		   
		   world.getHeightValue(xCoord - 4, zCoord - 2) == yCoord &&
		   world.getHeightValue(xCoord - 4, zCoord + 5) == yCoord)
		{
			System.out.println("Generating Succesfully at: " + ModHelper.getCoordAsString(xCoord, yCoord, zCoord));
			
			genHelper.setWorld(world);
			
			// Layer 2 Generation
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 4, Blocks.chest);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.air);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.planks);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.air);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.planks);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.air);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.air);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 2, Blocks.stone_stairs);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.air);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.air);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.planks);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.planks);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.air);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.planks);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 3, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.netherrack);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.planks);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 1, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.cobblestone);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 2, Blocks.planks);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.planks);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.cobblestone);
			
			// Layer 3 Generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 5, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.cobblestone);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.cobblestone);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			return true;
		}
		
		return false;
	}
}