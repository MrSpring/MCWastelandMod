package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;

public class RuinRuined extends Ruin implements IWorldGenerator
{
	public RuinRuined(String par1Name)
	{
		super(par1Name);
	}
	
	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		Material material1 = world.getBlock(x + 0, y, z + 0).getMaterial();
		
		Material material2  = world.getBlock(x + 2, y, z - 4).getMaterial();
		Material material3  = world.getBlock(x + 1, y, z - 4).getMaterial();
		Material material4  = world.getBlock(x + 0, y, z - 4).getMaterial();
		Material material5  = world.getBlock(x - 1, y, z - 4).getMaterial();
		Material material6  = world.getBlock(x - 2, y, z - 4).getMaterial();
		Material material7  = world.getBlock(x - 3, y, z - 4).getMaterial();
		
		Material material8  = world.getBlock(x + 4, y, z - 2).getMaterial();
		Material material9  = world.getBlock(x + 4, y, z - 1).getMaterial();
		Material material10 = world.getBlock(x + 4, y, z + 0).getMaterial();
		Material material11 = world.getBlock(x + 4, y, z + 1).getMaterial();
		Material material12 = world.getBlock(x + 4, y, z + 2).getMaterial();
		Material material13 = world.getBlock(x + 4, y, z + 3).getMaterial();
		
		Material material14 = world.getBlock(x + 2, y, z + 5).getMaterial();
		Material material15 = world.getBlock(x + 1, y, z + 5).getMaterial();
		Material material16 = world.getBlock(x + 0, y, z + 5).getMaterial();
		Material material17 = world.getBlock(x - 1, y, z + 5).getMaterial();
		Material material18 = world.getBlock(x - 2, y, z + 5).getMaterial();
		Material material19 = world.getBlock(x - 3, y, z + 5).getMaterial();
		
		Material material20 = world.getBlock(x - 5, y, z - 2).getMaterial();
		Material material21 = world.getBlock(x - 5, y, z - 1).getMaterial();
		Material material22 = world.getBlock(x - 5, y, z + 0).getMaterial();
		Material material23 = world.getBlock(x - 5, y, z + 1).getMaterial();
		Material material24 = world.getBlock(x - 5, y, z + 2).getMaterial();
		Material material25 = world.getBlock(x - 5, y, z + 3).getMaterial();
		
		/*	  	  A X+
		 *		  |
		 *  Z- <-- --> Z+
		 *	  	  |
		 *	  	  V X-
		 */
		
		if(material1.isSolid()/*material1.isSolid() && material2.isSolid() && material3.isSolid() && material4.isSolid() && material5.isSolid() && material6.isSolid() && material7.isSolid() && material8.isSolid() && material9.isSolid() && material10.isSolid() && material11.isSolid() && material12.isSolid() && material13.isSolid() && material14.isSolid() && material15.isSolid() && material16.isSolid() && material17.isSolid() && material18.isSolid() && material19.isSolid() && material20.isSolid() && material21.isSolid() && material22.isSolid() && material23.isSolid() && material24.isSolid() && material25.isSolid() && world.getHeightValue(x + 4, z) == y && world.getHeightValue(x, z + 5) == y && world.getHeightValue(x - 5, z) == y && world.getHeightValue(x, z - 4) == y*/)
		{
			int xCoord = x;
			int yCoord = y + 10;
			int zCoord = z;
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 1 generation
			
			world.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 4, yCoord, zCoord + 6, 2, 2);
			
			world.setBlock(xCoord + 3, yCoord, xCoord - 3, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, xCoord - 2, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, xCoord - 1, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 3, yCoord, zCoord + 0, 2, 2);
			world.setBlock(xCoord + 3, yCoord, xCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, xCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, xCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 3, yCoord, zCoord + 4, 2, 2);
			
			world.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, xCoord - 3, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 2, yCoord, zCoord - 2, 2, 2);
			world.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.dirt);
			world.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 2, yCoord, zCoord + 7, 2, 2);
			
			world.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord - 2, 2, 2);
			world.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord - 1, 2, 2);
			world.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord + 0, 2, 2);
			world.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.dirt);
			world.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.dirt);
			
			world.setBlock(, p_147449_2_, p_147449_3_, p_147449_4_)
			world.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 0, yCoord, zCoord + 2, 2, 2);
			world.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 0, yCoord, zCoord + 2, 2, 2);
			
			world.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 1, yCoord, zCoord - 1, 2, 2);
			world.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 1, yCoord, zCoord + 1, 2, 2);
			world.setBlock(xCoord - 1, yCoord, zCoord + 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 1, yCoord, zCoord + 4, 2, 2);
			
			world.setBlock(xCoord - 2, yCoord, zCoord - 7, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 2, yCoord, zCoord - 7, 2, 2);
			world.setBlock(xCoord - 2, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 2, yCoord, zCoord + 3, 2, 2);
			world.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 2, yCoord, zCoord + 0, 2, 2);
			world.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 2, yCoord, zCoord + 2, 2, 2);
			world.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.netherrack);
			
			world.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord - 1, 2, 2);
			world.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord + 0, 2, 2);
			world.setBlock(xCoord - 3, yCoord, zCoord + 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord + 2, 2, 2);
			world.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord + 3, 2, 2);
			
			world.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 4, yCoord, zCoord + 0, 2, 2);
			
			world.setBlock(xCoord - 5, yCoord, zCoord - 6, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 5, yCoord, zCoord - 6, 2, 2);
			world.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick); //
			world.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick); //
			world.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 5, yCoord, zCoord + 2, 2, 2);
			
			world.setBlock(xCoord - 6, yCoord, zCoord - 6, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 6, yCoord, zCoord - 6, 2, 2);
			
			world.setBlock(xCoord - 7, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 7, yCoord, zCoord - 4, 2, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 2 generation
			
			yCoord++;
			
			world.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 7, yCoord, xCoord + 4, 2, 2);
			
			world.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 5, yCoord, zCoord + 5, 2, 2);
			world.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 5, yCoord, zCoord + 7, 2, 2);
			
			world.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick); //
			world.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick); //
			world.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 4, yCoord, zCoord - 1, 2, 2);
			world.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick); //
			world.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick); //
			world.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 4, yCoord, zCoord + 3, 2, 2);
			
			world.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick); //
			world.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 3, yCoord, zCoord - 2, 2, 2);
			
			world.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick); //
			world.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 2, yCoord, zCoord - 3, 2, 2);
			world.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.stone_stairs);
			world.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 2, yCoord, zCoord + 1, 2, 2);
			world.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 2, yCoord, zCoord + 5, 2, 2);
			
			world.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick); //
			world.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord + 3, 2, 2);
			world.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord + 1, yCoord, zCoord + 5, 2, 2);
			
			world.setBlock(xCoord + 0, yCoord, zCoord - 6, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord - 6, 2, 2);
			world.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.cobblestone);
			world.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			world.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
			
			world.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 1, yCoord, zCoord - 4, 2, 2);
			world.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.cobblestone);
			world.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.cobblestone);
			world.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 1, yCoord, zCoord + 5, 2, 2);
			
			world.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 2, yCoord, zCoord - 4, 2, 2);
			world.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.fire);
			world.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
			
			world.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.stone_stairs);
			world.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord + 4, 2, 2);
			world.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 3, yCoord, zCoord + 5, 2, 2);
			
			world.setBlock(xCoord - 4, yCoord, zCoord - 4, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 4, yCoord, zCoord - 4, 2, 2);
			world.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick); //
			world.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 4, yCoord, zCoord - 2, 2, 2);
			world.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 4, yCoord, zCoord + 3, 2, 2);
			world.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick); //
			
			world.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick); //
			world.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick);
			world.setBlockMetadataWithNotify(xCoord - 5, yCoord, zCoord + 3, 2, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 3 generation
			
			yCoord++;
			
			world.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			
		}
		
		return false;
	}
}
