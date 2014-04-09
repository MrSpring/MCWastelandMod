package dk.mrspring.wasteland.world.biome;

public class BiomeGenApocalypse extends BiomeGenWastelandBase
{
	public BiomeGenApocalypse(int par1ID, String par2Name, Height par3BiomeHeight)
	{
		super(par1ID, par2Name, par3BiomeHeight);
		
		this.theBiomeDecorator = new BiomeDecoratorWasteland();
	}
}
