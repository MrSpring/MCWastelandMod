package dk.mrspring.wasteland.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dk.mrspring.wasteland.ModHelper;
import dk.mrspring.wasteland.tileentity.TileEntityTV;

public class BlockTV extends BlockContainer
{
	public BlockTV(Material mat, String name)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModHelper.ModInfo.modid + ":" + name);
		this.setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 0.5625F, 0.875F);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack)
	{
		super.onBlockPlacedBy(world, x, y, z, entity, itemStack);
		
		int direction = ModHelper.getRotationAsDirection(entity.rotationYaw);
		
		world.setBlockMetadataWithNotify(x, y, z, direction, 2);
	}
	
	/*@Override
	public boolean onBlockActivated(World world, int xCoord, int yCoord, int zCoord, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		int meta = world.getBlockMetadata(xCoord, yCoord, zCoord);
		if(meta == 3)
			world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 2);
		else
			world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, meta + 1, 2);
		return true;
	}*/
	
	@Override
	public int damageDropped(int metadata)
	{
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderType()
	{
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TileEntityTV();
	}
}
