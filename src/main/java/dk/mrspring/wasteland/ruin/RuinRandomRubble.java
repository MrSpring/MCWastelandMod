package dk.mrspring.wasteland.ruin;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class RuinRandomRubble extends Ruin implements IWorldGenerator
{
	public RuinRandomRubble(String par1Name)
	{
		super(par1Name);
	}

	public boolean generate(World world, Random random, int i, int j, int k)
	{	
		byte byte0 = 3;
		int l = random.nextInt(2) + 2;
		int i1 = random.nextInt(2) + 2;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		byte byte1 = 75;
		Material material = world.getBlock(i, j + 1, k).getMaterial();
		Material material1 = world.getBlock(i, j, k).getMaterial();
		Material material2 = world.getBlock(i + 1, j, k).getMaterial();
		Material material3 = world.getBlock(i - 1, j, k).getMaterial();
		Material material4 = world.getBlock(i, j, k + 1).getMaterial();
		Material material5 = world.getBlock(i, j, k - 1).getMaterial();
		if ((world.getBlock(i, j - 1, k) == Blocks.dirt) && (!material.isSolid()) && (!material1.isSolid()) && (!material4.isSolid()) && (!material2.isSolid()) && (!material3.isSolid()) && (!material5.isSolid()) && (world.getBlock(i, j, k) == Blocks.air) && (world.getBlock(i, j + 1, k) == Blocks.air))
		{
			for (int j1 = 0; j1 < byte1; j1++)
			{
				int k1 = i + random.nextInt(8);
				int l1 = j - 1 + random.nextInt(4);
				int i2 = k + random.nextInt(8);
				Material material6 = world.getBlock(k1, l1 - 1, i2).getMaterial();
				if ((world.getBlock(k1, l1, i2) == Blocks.air) && (material6.isSolid()))
				{
					Block j2 = Blocks.cobblestone;
					int k2 = random.nextInt(3);
					if (k2 == 0)
						j2 = Blocks.cobblestone;
					else if (k2 == 1)
						j2 = Blocks.mossy_cobblestone;
					else if (k2 == 2)
						j2 = Blocks.planks;
					
					world.setBlock(k1, l1, i2, j2);
				}
			}
			return true;
		}
		return false;
	}
}
