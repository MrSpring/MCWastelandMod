package dk.mrspring.wasteland;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dk.mrspring.wasteland.model.ModelTVRenderer;
import dk.mrspring.wasteland.tileentity.TileEntityTV;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@Override
	public void load()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTV.class, new ModelTVRenderer());
	}
}
