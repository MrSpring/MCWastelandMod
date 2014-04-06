package dk.mrspring.wasteland.world.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRandomFire extends WorldGenerator
{
	public WorldGenRandomFire()
	{
		super(true);
	}
	
	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		if(world.getBlock(x, y, z) == Blocks.dirt)
		{
			world.setBlock(x, y, z, Blocks.netherrack);
			world.setBlock(x, y + 1, z, Blocks.fire);
			
			return true;
		}
		
		else return false;
	}
}
