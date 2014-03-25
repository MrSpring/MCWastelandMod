package dk.mrspring.wasteland.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import dk.mrspring.wasteland.ModHelper;

public class BlockBurntLog extends BlockWLM
{
	protected IIcon top;
	
	public BlockBurntLog(String name)
	{
		super(Material.wood, name);
		
		this.setBlockBounds(3 * ModHelper.pixel, 0F, 3 * ModHelper.pixel, 1 - (3 * ModHelper.pixel), 1F, 1 - (3 * ModHelper.pixel));
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		super.registerBlockIcons(register);
		top = register.registerIcon(this.getTextureName() + "_top");
	}
	
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (side == ModHelper.BlockSides.TOP || side == ModHelper.BlockSides.BOTTOM)
			return top;
		else return super.getIcon(side, metadata);
	}
}
