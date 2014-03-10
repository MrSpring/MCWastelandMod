package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;
import dk.mrspring.wasteland.ModInfo;

public class RuinBarnHouse extends Ruin implements IWorldGenerator
{
	public RuinBarnHouse(String name)
	{
		super(name);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		/*	  	  A X+
		 *		  |
		 *  Z- <-- --> Z+
		 *	  	  |
		 *	  	  V X-
		 */
		
		int xCoord = x;
		int yCoord = y;
		int zCoord = z;
		
		Material material1 = world.getBlock(xCoord, yCoord, zCoord).getMaterial();
		
		int[] basePos = new int[] { x, y, z };
		
		if(material1.isSolid() && world.getHeightValue(xCoord + 1, zCoord + 1) == yCoord && world.getHeightValue(xCoord, zCoord + 1) == yCoord && world.getHeightValue(xCoord - 1, zCoord + 1) == yCoord && world.getHeightValue(xCoord - 1, zCoord) == yCoord && world.getHeightValue(xCoord - 1, zCoord - 1) == yCoord && world.getHeightValue(xCoord, zCoord - 1) == yCoord && world.getHeightValue(xCoord + 1, zCoord - 1) == yCoord)	// Upper Left Corner
		{
			System.out.println("Successfully generated Barn at: " + ModInfo.getCoordAsString(xCoord, zCoord) + ".");
			
			xCoord -= 6;
			zCoord -= 4;
			
			RuinGenHelper.setCube(xCoord, yCoord + 1, zCoord - 1, 11, 9, 14, world, Blocks.air);
			
			// Layer 1 Generation
			
			yCoord--;
			
			for(int i = 0; i < 9; i++)
				{ world.setBlock(xCoord, yCoord, zCoord + i, Blocks.cobblestone); }
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.cobblestone);
			world.setBlock(xCoord + 3, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 4, Blocks.planks);
			world.setBlock(xCoord + 4, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 5, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 5, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 5, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 5, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 5, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 6, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 6, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 6, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 6, yCoord, zCoord + 4, Blocks.cobblestone);
			world.setBlock(xCoord + 6, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 6, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 6, yCoord, zCoord + 7, Blocks.planks);
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 7, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 7, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 7, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 7, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 7, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 7, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 8, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 2, Blocks.planks);
			world.setBlock(xCoord + 8, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 9, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 9, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 9, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 9, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 9, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 9, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord + 9, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord + 9, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +10, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord +10, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord +10, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord +10, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord +10, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord +10, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord +10, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord +10, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord +10, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +11, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord +11, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 4, Blocks.cobblestone);
			world.setBlock(xCoord +11, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 6, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 7, Blocks.dirt);
			world.setBlock(xCoord +11, yCoord, zCoord + 8, Blocks.cobblestone);
			
			for(int i = 0; i < 9; i++)
				{ world.setBlock(xCoord + 12, yCoord, zCoord, Blocks.cobblestone); }
			
			// Layer 2 Generation
			
			yCoord++;
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.fence);
			world.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.fence);
			world.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.fence);
			world.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 4, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 4, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.fence);
			world.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.air);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.fence);
			world.setBlock(xCoord + 5, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 0, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord + 6, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 0, Blocks.fence);
			world.setBlock(xCoord + 7, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 7, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 0, Blocks.air);
			world.setBlock(xCoord + 8, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord + 8, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 8, yCoord, zCoord + 3, Blocks.fence);
			world.setBlock(xCoord + 8, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord + 8, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord + 8, yCoord, zCoord + 6, Blocks.fence);
			world.setBlock(xCoord + 8, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 9, yCoord, zCoord + 0, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 9, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 4, Blocks.planks);
			world.setBlock(xCoord + 9, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +10, yCoord, zCoord + 0, Blocks.fence);
			world.setBlock(xCoord +10, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 3, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 6, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord +10, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +11, yCoord, zCoord + 0, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 1, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 2, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord +11, yCoord, zCoord + 4, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 5, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord +11, yCoord, zCoord + 7, Blocks.air);
			world.setBlock(xCoord +11, yCoord, zCoord + 8, Blocks.air);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 8, Blocks.log);
			
			// Layer 3 Generation
			
			yCoord++;
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 3, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 8, Blocks.log);
			
			// Layer 4 Generation
			
			yCoord++;
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 3, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 7, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 8, Blocks.log);
			
			 // Layer 5 Generation
			
			yCoord++;
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.oak_stairs);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord + 0, 5, 2);
			world.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.planks);
			world.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.planks);
			world.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.planks);
			world.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.planks);
			world.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.planks);
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.planks);
			world.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.planks);
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.oak_stairs);
			world.setBlockMetadataWithNotify(xCoord + 3, yCoord, zCoord + 0, 4, 2);
			world.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.planks);
			world.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.planks);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.oak_stairs);
			world.setBlockMetadataWithNotify(xCoord + 5, yCoord, zCoord + 0, 5, 2);
			world.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
			
			world.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +10, yCoord, zCoord + 5, Blocks.planks);

			world.setBlock(xCoord +11, yCoord, zCoord + 5, Blocks.planks);
			world.setBlock(xCoord +11, yCoord, zCoord + 6, Blocks.planks);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 7, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 8, Blocks.log);
			
			// Layer 6 Generation
			
			yCoord++;
			
			world.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.cobblestone);
			
			world.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.chest);
			
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(xCoord + 1, yCoord, zCoord + 7);
			ItemStack loot = getChestLoot(random, this.getLoot());
			if(loot != null)
				chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), loot);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 1, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 2, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 3, yCoord, zCoord - 1, Blocks.cobblestone);
			world.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 3, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 5, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 6, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 7, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 8, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.log);
			world.setBlock(xCoord + 9, yCoord, zCoord + 9, Blocks.cobblestone);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 4, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.log);
			world.setBlock(xCoord +12, yCoord, zCoord + 7, Blocks.log);
			
			// Layer 7 Generation
			
			yCoord++;
			
			world.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.cobblestone);
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.cobblestone);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			world.setBlock(xCoord +12, yCoord, zCoord + 6, Blocks.cobblestone);
			
			// Layer 8 Generation
			
			yCoord++;
			
			world.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.cobblestone);
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
			
			world.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.cobblestone);
			
			world.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.cobblestone);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.cobblestone);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			
			// Layer 9 Generation
			
			yCoord++;
			
			world.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.cobblestone);
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
			
			world.setBlock(xCoord +12, yCoord, zCoord + 5, Blocks.cobblestone);
			
			return true;
		}
		return false;
	}
	
	private ItemStack getChestLoot(Random rand, ItemStack[] items)
	{
		int i = rand.nextInt(items.length);
		ItemStack item = new ItemStack(items[i].getItem(), 1);
		
		if(item.getItem() == Items.wheat) return new ItemStack(item.getItem(), rand.nextInt(8) + 4);
		else if(item.getItem() == Items.apple) return new ItemStack(item.getItem(), rand.nextInt(2) + 1);
		else if(item.getItem() == Items.bread) return new ItemStack(item.getItem(), rand.nextInt(2) + 2);
		else return new ItemStack(item.getItem(), 1);
	}
}
