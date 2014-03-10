package dk.mrspring.wasteland.ruin;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class RuinGenHelper
{
	public static void setCube(int baseX, int baseY, int baseZ, int lengthX, int lengthY, int lengthZ, World world, Block block)
	{
		for(int y = 0; y < lengthY; y++)
		{
			for(int z = 0; z < lengthX; z++)
			{
				for(int x = 0; x < lengthZ; x++)
				{
					world.setBlock(x + baseX, y + baseY, z + baseZ, block);
				}
			}
		}
	}
}
