package dk.mrspring.wasteland.world;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiome;
import net.minecraft.world.gen.layer.IntCache;
import dk.mrspring.wasteland.WastelandBiomes;
import dk.mrspring.wasteland.world.biome.BiomeGenWastelandBase;

public class GenLayerBiomeWasteland extends GenLayerBiome
{
	public static List<BiomeGenWastelandBase> biomes = new ArrayList<BiomeGenWastelandBase>();
	
	public GenLayerBiomeWasteland(long seed, GenLayer parent, WorldType worldType)
	{
		super(seed, parent, worldType);
	}
	
	@Override
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int[] aint = this.parent.getInts(par1, par2, par3, par4);
		int[] aint1 = IntCache.getIntCache(par3 * par4);
		
		for (int i1 = 0; i1 < par4; ++i1)
		{
			for (int j1 = 0; j1 < par3; ++j1)
			{
				this.initChunkSeed((long)(j1 + par1), (long)(i1 + par2));
				int biomeID = aint[j1 + i1 * par3];
				int l1 = (biomeID & 3840) >> 8;
				biomeID &= -3841;
				
				if (biomeID == 0)
					aint1[j1 + i1 * par3] = WastelandBiomes.driedOcean.biomeID;
				else if(biomeID == 1)
					aint1[j1 + i1 * par3] = WastelandBiomes.apocalypse.biomeID;
				else if(biomeID == 2)
					aint1[j1 + i1 * par3] = WastelandBiomes.burntForest.biomeID;
				else if(biomeID == 3)
					aint1[j1 + i1 * par3] = BiomeGenBase.desert.biomeID;
				else if(biomeID == 4)
					aint1[j1 + i1 * par3] = BiomeGenBase.birchForest.biomeID;
				/*if (isOceanBiome(biomeID))
				{
					aint1[j1 + i1 * par3] = biomeID;
				}
				else if (biomeID == BiomeGenBase.mushroomIsland.biomeID && BOPConfigurationBiomeGen.mushroomIslandGen)
				{
					aint1[j1 + i1 * par3] = biomeID;
				}
				else if (biomeID == 1)
				{
					if (l1 > 0)
					{
						if (this.nextInt(3) == 0 && BOPConfigurationBiomeGen.mesaPlateauGen)
						{
							aint1[j1 + i1 * par3] = BiomeGenBase.mesaPlateau.biomeID;
						}
						else if (BOPConfigurationBiomeGen.mesaPlateauFGen)
						{
							aint1[j1 + i1 * par3] = BiomeGenBase.mesaPlateau_F.biomeID;
						}
					}
					else
					{
						aint1[j1 + i1 * par3] = getRandomBiome(desertBiomes).biome.biomeID;
					}
				}
				else if (biomeID == 2)
				{
					if (l1 > 0 && BOPConfigurationBiomeGen.jungleGen)
					{
						aint1[j1 + i1 * par3] = BiomeGenBase.jungle.biomeID;
					}
					else
					{
						aint1[j1 + i1 * par3] = getRandomBiome(warmBiomes).biome.biomeID;
					}
				}
				else if (biomeID == 3)
				{
					if (l1 > 0 && BOPConfigurationBiomeGen.megaTaigaGen)
					{
						aint1[j1 + i1 * par3] = BiomeGenBase.megaTaiga.biomeID;
					}
					else
					{
						aint1[j1 + i1 * par3] = getRandomBiome(coldBiomes).biome.biomeID;
					}
				}
				else if (biomeID == 4)
				{
					aint1[j1 + i1 * par3] = getRandomBiome(icyBiomes).biome.biomeID;
				}
				else if (BOPConfigurationBiomeGen.mushroomIslandGen)
				{
					aint1[j1 + i1 * par3] = BiomeGenBase.mushroomIsland.biomeID;
				}*/
			}
		}
		
		return aint1;
	}
}
