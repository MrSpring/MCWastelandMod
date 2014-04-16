package dk.mrspring.wasteland.ruin;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import cpw.mods.fml.common.IWorldGenerator;

public class RuinTreeHouse extends Ruin implements IWorldGenerator
{
	private RuinGenHelper genHelper = new RuinGenHelper();
	
	public RuinTreeHouse(String par1Name)
	{
		super(par1Name);
	}
	
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		this.genHelper.setWorld(world);
		
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
			genHelper.setBlock(xCoord - 1, var1, zCoord - 1, Blocks.planks);
			
			// Layer 2 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			if(!world.getBlock(xCoord, yCoord, zCoord - 1).getMaterial().isSolid())
				genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.ladder, 2);
			
			// Layer 3 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			// Layer 4 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			
			// Leyer 5 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.log);
			genHelper.setBlock(xCoord, yCoord, zCoord - 1, Blocks.ladder, 2);
			
			// Layer 6 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.log);
			genHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.log);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.ladder, 2);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.planks);
			genHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.planks);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.planks);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.planks);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.log);
			
			// Layer 7 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			genHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.log);
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.chest);
			
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(xCoord - 1, yCoord, zCoord + 1);
			ItemStack item = getLootItem(random, this.getLoot());
			if (item != null)
				chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), item);
			
			genHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.log);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.log);
			genHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, Blocks.log);
			
			// Layer 8 generation
			
			yCoord++;
			
			genHelper.setBlock(xCoord, yCoord, zCoord, Blocks.log);
			genHelper.setBlock(xCoord, yCoord, zCoord + 1, Blocks.log, 8);
			
			return true;
		}
		return false;
	}
	
	private ItemStack getLootItem(Random rand, ItemStack[] itemStacks)
	{
		int i = rand.nextInt(itemStacks.length);
		
		ItemStack item = new ItemStack(itemStacks[i].getItem(), 1);
		
		if (item.getItem() == Items.apple) return new ItemStack(item.getItem(), rand.nextInt(3) + 3);
		else if(item.getItem() == Items.stone_axe) return new ItemStack(item.getItem(), 1, item.getMaxDamage() - rand.nextInt(item.getMaxDamage() / 2));
		else if(item.getItem() == Item.getItemFromBlock(Blocks.log)) return new ItemStack(Item.getItemFromBlock(Blocks.log), rand.nextInt(4) + 2);
		else if(item.getItem() == Items.milk_bucket) return new ItemStack(item.getItem(), 1);
		else return item;
	}
}
