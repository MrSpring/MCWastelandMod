package dk.mrspring.wasteland.ruin;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class RuinRandomFire extends Ruin implements IWorldGenerator
{

	public RuinRandomFire(String par1Name)
	{
		super(par1Name);
	}
	
	protected boolean generate(World world, Random random, int xCoord, int yCoord, int zCoord)
	{
		if(world.getBlock(xCoord, yCoord, zCoord) == Blocks.dirt)
		{
			world.setBlock(xCoord, yCoord, zCoord, Blocks.netherrack);
			world.setBlock(xCoord, yCoord + 1, zCoord, Blocks.fire);
			
			return true;
		}
		else return false;
	}
}
