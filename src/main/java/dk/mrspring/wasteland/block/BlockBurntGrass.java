package dk.mrspring.wasteland.block;

import dk.mrspring.wasteland.ModHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockBurntGrass extends BlockWLM
{
	protected IIcon top;
	protected IIcon sides;
	
	public BlockBurntGrass(String name)
	{
		super(Material.ground, name);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		super.registerBlockIcons(register);
		
		top = register.registerIcon(this.getTextureName() + "_top");
		sides = register.registerIcon(this.getTextureName() + "_side");
	}
	
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (side == ModHelper.BlockSides.TOP)
			return top;
		else if (side == ModHelper.BlockSides.BOTTOM)
			return blockIcon;
		else
			return sides;
	}
}
