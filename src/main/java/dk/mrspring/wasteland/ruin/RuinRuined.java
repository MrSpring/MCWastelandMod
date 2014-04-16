package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;
import dk.mrspring.wasteland.ModHelper;

public class RuinRuined extends Ruin implements IWorldGenerator
{
	private RuinGenHelper genHelper = new RuinGenHelper();
	
	public RuinRuined(String par1Name)
	{
		super(par1Name);
	}
	
	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		this.genHelper.setWorld(world);
		
		Material material1 = world.getBlock(x + 0, y, z + 0).getMaterial();
		
		Material material2  = world.getBlock(x + 2, y, z - 2).getMaterial();
		Material material3  = world.getBlock(x + 1, y, z - 2).getMaterial();
		Material material4  = world.getBlock(x + 0, y, z - 2).getMaterial();
		Material material5  = world.getBlock(x - 1, y, z - 2).getMaterial();
		Material material6  = world.getBlock(x - 2, y, z - 2).getMaterial();
		
		Material material7  = world.getBlock(x + 2, y, z - 2).getMaterial();
		Material material8  = world.getBlock(x + 2, y, z - 1).getMaterial();
		Material material9  = world.getBlock(x + 2, y, z + 0).getMaterial();
		Material material10 = world.getBlock(x + 2, y, z + 1).getMaterial();
		Material material11 = world.getBlock(x + 2, y, z + 2).getMaterial();
		
		Material material12 = world.getBlock(x + 2, y, z + 2).getMaterial();
		Material material13 = world.getBlock(x + 1, y, z + 2).getMaterial();
		Material material14 = world.getBlock(x + 0, y, z + 2).getMaterial();
		Material material15 = world.getBlock(x - 1, y, z + 2).getMaterial();
		Material material16 = world.getBlock(x - 2, y, z + 2).getMaterial();
		
		Material material17 = world.getBlock(x - 2, y, z - 2).getMaterial();
		Material material18 = world.getBlock(x - 2, y, z - 1).getMaterial();
		Material material19 = world.getBlock(x - 2, y, z + 0).getMaterial();
		Material material20 = world.getBlock(x - 2, y, z + 1).getMaterial();
		Material material21 = world.getBlock(x - 2, y, z + 2).getMaterial();
		
		/*	  	  A X+
		 *		  |
		 *  Z- <-- --> Z+
		 *	  	  |
		 *	  	  V X-
		 */
		
		if(material1.isSolid() && material2.isSolid() && material3.isSolid() && material4.isSolid() && material5.isSolid() && material6.isSolid() && material7.isSolid() && material7.isSolid() && material9.isSolid() && material10.isSolid() && material11.isSolid() && material12.isSolid() && material13.isSolid() && material14.isSolid() && material15.isSolid() && material16.isSolid() && material17.isSolid() && material18.isSolid() && material19.isSolid() && material20.isSolid() && material21.isSolid())
		{
			int xCoord = x;
			int yCoord = y;
			int zCoord = z;
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 1 generation
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.dirt);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.dirt);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.dirt);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 7, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.netherrack);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.dirt);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 4, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.dirt);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 6, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.dirt);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.dirt);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.dirt);
			
			genHelper.setBlock(xCoord - 6, yCoord, zCoord - 6, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 7, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 2 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.stone_stairs);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 6, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.cobblestone);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.fire);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.stone_stairs);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 3 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.cobblestone);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 4 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.cobblestone);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.stone_stairs);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 5 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.cobblestone);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 6 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, xCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.cobblestone);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.log);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.log);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.log);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 7 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
			
			
			genHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, xCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 8 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 3, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 9 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.chest);
			
			TileEntityChest chestEntity = (TileEntityChest) world.getTileEntity(xCoord - 4, yCoord, zCoord - 2);
			ItemStack item = pickChestLootItem(rand, this.getLoot());
			if (item != null)
				chestEntity.setInventorySlotContents(rand.nextInt(chestEntity.getSizeInventory()), item);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.stonebrick);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 10 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 11 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
			
			/*	  	  A X+
			 *		  |
			 *  Z- <-- --> Z+
			 *	  	  |
			 *	  	  V X-
			 */
			
			// Layer 12 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
			
			genHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
			
			return true;
		}
		
		return false;
	}
	
	private ItemStack pickChestLootItem(Random random, ItemStack[] itemStacks)
	{
		int i = random.nextInt(itemStacks.length);
		
		ItemStack itemStack = new ItemStack(itemStacks[i].getItem(), 1);
		
		if(itemStack.getItem() == Items.water_bucket) return new ItemStack(itemStack.getItem(), 1);
		else if(itemStack.getItem() == Items.diamond) return new ItemStack(itemStack.getItem(), random.nextInt(2) + 1);
		else if(itemStack.getItem() == Items.gold_ingot) return new ItemStack(itemStack.getItem(), random.nextInt(3) + 1);
		else if(itemStack.getItem() == Items.iron_ingot) return new ItemStack(itemStack.getItem(), random.nextInt(4) + 1);
		else if(itemStack.getItem() == Items.coal) return new ItemStack(itemStack.getItem(), random.nextInt(5) + 1);
		else if(itemStack.getItem() == Items.bread) return new ItemStack(itemStack.getItem(), random.nextInt(2) + 2);
		else if(itemStack.getItem() == Items.redstone) return new ItemStack(itemStack.getItem(), random.nextInt(4) + 3);
		else if(itemStack.getItem() == Items.iron_helmet) return new ItemStack(itemStack.getItem(), 1);
		else if(itemStack.getItem() == Items.record_wait) return new ItemStack(itemStack.getItem(), 1);
		else return new ItemStack(itemStack.getItem(), 1);
	}
}
