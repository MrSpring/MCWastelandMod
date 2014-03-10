package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;
import dk.mrspring.wasteland.ModInfo;

public class RuinTreeHouse extends Ruin implements IWorldGenerator
{
	public RuinTreeHouse(String par1Name)
	{
		super(par1Name);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		Material material = world.getBlock(x, y, z).getMaterial();
		
		if(material.isSolid() && world.getBlock(x, y, z) != Blocks.netherrack && world.getBlock(x, y, z) != Blocks.fire)
		{
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			int xCoord = x;
			int yCoord = world.getHeightValue(x, z) - 1;
			int zCoord = z;
			
			// Layer 1 generation
			
			int var1 = world.getHeightValue(xCoord - 1, zCoord - 1);
			world.setBlock(xCoord - 1, var1, zCoord - 1, Blocks.planks);
			
			// Layer 2 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			if(!world.getBlock(xCoord, yCoord, zCoord - 1).getMaterial().isSolid())
			{
				world.setBlock(xCoord, yCoord, zCoord - 1, Blocks.ladder);
				world.setBlockMetadataWithNotify(xCoord + 0, yCoord, zCoord - 1, 2, 2);
			}
			
			// Layer 3 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			// Layer 4 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			// Leyer 5 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			world.setBlock(xCoord - 1, yCoord, zCoord, Blocks.log);
			world.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.log);
			world.setBlock(xCoord, yCoord, zCoord - 1, Blocks.ladder);
			world.setBlockMetadataWithNotify(xCoord + 0, yCoord, zCoord - 1, 2, 2);
			
			// Layer 6 generation
			
			yCoord++;
			
			world.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.log);
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.ladder);
			world.setBlockMetadataWithNotify(xCoord + 0, yCoord, zCoord - 1, 2, 2);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.planks);
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
			world.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.log);
			world.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.planks);
			world.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.planks);
			world.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.planks);
			world.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.log);
			
			// Layer 7 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			world.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.log);
			world.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.chest);
			world.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.log);
			world.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.log);
			world.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.log);
			
			// Layer 8 generation
			
			yCoord++;
			
			world.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			world.setBlock(xCoord, yCoord, zCoord + 1, Blocks.log);
			world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord + 1, 8, 2);
			
			return true;
		}
		return false;
	}
}
