package dk.mrspring.wasteland.world.gen;

import java.util.Random;

import dk.mrspring.wasteland.ModConfig;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class WorldGenWastelandSmallTree extends WorldGenTrees
{
	public WorldGenWastelandSmallTree(boolean par1)
	{
		super(par1);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		Material material1 = world.getBlock(x + 1, y + 1, z + 0).getMaterial();
		Material material2 = world.getBlock(x + 0, y + 1, z + 0).getMaterial();
		Material material3 = world.getBlock(x - 1, y + 1, z + 0).getMaterial();
		Material material4 = world.getBlock(x + 0, y + 1, z + 1).getMaterial();
		Material material5 = world.getBlock(x + 0, y + 1, z - 1).getMaterial();
		
		int r = random.nextInt(100);
		
		if(world.getBlock(x, y, z) == Blocks.dirt && !material1.isSolid() && !material2.isSolid() && !material3.isSolid() && !material4.isSolid() && !material5.isSolid() && !(r >= ModConfig.wastelandTreesPreChunk))
		{
			y++;
			
			for(int i = 0; i < ModConfig.wastelandTreeHeight; i++)
				{ world.setBlock(x, y + i, z, Blocks.log); }
			
			return true;
		}
		
		return false;
	}
}
