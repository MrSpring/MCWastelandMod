package dk.mrspring.wasteland.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import dk.mrspring.wasteland.Wasteland;

public class WorldGenWastelandSmallTree extends WorldGenTrees
{
	public WorldGenWastelandSmallTree(boolean par1)
	{
		super(par1);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		return false;
	}
}
