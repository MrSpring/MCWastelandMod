package dk.mrspring.wasteland.block;

import dk.mrspring.wasteland.ModInfo;
import dk.mrspring.wasteland.tileentity.TileEntityTV;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTV extends BlockContainer
{
	protected IIcon[] facingNorth = new IIcon[6];
	
	public BlockTV(Material mat, String name)
	{
		super(mat);
		
		this.setBlockName(name);
		this.setBlockTextureName(ModInfo.modid + ":" + name);
		this.setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 0.5625F, 0.75F);
	}
	
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
