package dk.mrspring.wasteland.model;

import org.lwjgl.opengl.GL11;

import dk.mrspring.wasteland.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ModelTVRenderer extends TileEntitySpecialRenderer
{
	private final ModelTV model;
	
	public ModelTVRenderer()
	{
		this.model = new ModelTV();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale)
	{
		GL11.glPushMatrix();
			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
			ResourceLocation textures = new ResourceLocation(ModInfo.modid + ":textures/models/TV.png");
			Minecraft.getMinecraft().renderEngine.bindTexture(textures);
			
			GL11.glPushMatrix();
				GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
				
				int metadata = 0;
				
				metadata = var1.getWorldObj().getBlockMetadata(var1.xCoord, var1.yCoord, var1.zCoord);
				
				GL11.glRotatef((metadata * 90F), 0, 1.0F, 0);
				
				this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
