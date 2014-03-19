package dk.mrspring.wasteland;

import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ClientRegistry;
import dk.mrspring.wasteland.model.ModelTVRenderer;
import dk.mrspring.wasteland.tileentity.TileEntityTV;

public class ClientProxy extends CommonProxy
{
	@Override
	public void load()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTV.class, new ModelTVRenderer());
	}
}
