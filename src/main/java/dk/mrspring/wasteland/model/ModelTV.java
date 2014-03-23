// Date: 19-03-2014 13:53:54
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package dk.mrspring.wasteland.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelTV extends ModelBase
{
	ModelRenderer base;
	ModelRenderer back;
	ModelRenderer power;
	ModelRenderer powerPlug;
	ModelRenderer avPlug;
	ModelRenderer volume;
	ModelRenderer channel;
	
	public ModelTV()
	{
		textureWidth = 64;
		textureHeight = 32;
		
		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 10, 8, 6);
		base.setRotationPoint(-5F, 16F, -5F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		back = new ModelRenderer(this, 12, 14);
		back.addBox(0F, 0F, 0F, 8, 5, 2);
		back.setRotationPoint(-4F, 17F, 1F);
		back.setTextureSize(64, 32);
		back.mirror = true;
		setRotation(back, 0F, 0F, 0F);
		power = new ModelRenderer(this, 0, 16);
		power.addBox(0F, 0F, 0F, 2, 2, 1);
		power.setRotationPoint(2F, 21F, -6F);
		power.setTextureSize(64, 32);
		power.mirror = true;
		setRotation(power, 0F, 0F, 0F);
		powerPlug = new ModelRenderer(this, 26, 2);
		powerPlug.addBox(0F, 0F, 0F, 1, 1, 1);
		powerPlug.setRotationPoint(-3.5F, 22.5F, 1F);
		powerPlug.setTextureSize(64, 32);
		powerPlug.mirror = true;
		setRotation(powerPlug, 0F, 0F, 0F);
		avPlug = new ModelRenderer(this, 26, 0);
		avPlug.addBox(0F, 0F, 0F, 1, 1, 1);
		avPlug.setRotationPoint(-1.5F, 22.5F, 1F);
		avPlug.setTextureSize(64, 32);
		avPlug.mirror = true;
		setRotation(avPlug, 0F, 0F, 0F);
		volume = new ModelRenderer(this, 0, 14);
		volume.addBox(0F, 0F, 0F, 1, 1, 1);
		volume.setRotationPoint(-2F, 22F, -6F);
		volume.setTextureSize(64, 32);
		volume.mirror = true;
		setRotation(volume, 0F, 0F, 0F);
		channel = new ModelRenderer(this, 4, 14);
		channel.addBox(0F, 0F, 0F, 1, 1, 1);
		channel.setRotationPoint(-4F, 22F, -6F);
		channel.setTextureSize(64, 32);
		channel.mirror = true;
		setRotation(channel, 0F, 0F, 0F);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
		back.render(f5);
		power.render(f5);
		powerPlug.render(f5);
		avPlug.render(f5);
		volume.render(f5);
		channel.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}
