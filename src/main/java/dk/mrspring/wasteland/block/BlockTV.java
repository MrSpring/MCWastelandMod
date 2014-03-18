package dk.mrspring.wasteland.block;

import dk.mrspring.wasteland.ModInfo;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockTV extends BlockWLM
{
	protected IIcon[] facingNorth = new IIcon[6];
	
	public BlockTV(Material mat, String name)
	{
		super(mat, name);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister par1)
	{
		facingNorth[0] = par1.registerIcon(this.getTextureName());
		facingNorth[1] = par1.registerIcon(this.getTextureName() + "_top");
		facingNorth[2] = par1.registerIcon(this.getTextureName() + "_front_off");
		facingNorth[3] = par1.registerIcon(this.getTextureName() + "_back");
		facingNorth[4] = par1.registerIcon(this.getTextureName() + "_side");
		facingNorth[5] = par1.registerIcon(this.getTextureName() + "_side");
	}
	
	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return facingNorth[par1];
	}
}
