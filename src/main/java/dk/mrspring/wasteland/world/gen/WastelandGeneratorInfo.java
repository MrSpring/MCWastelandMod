package dk.mrspring.wasteland.world.gen;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import dk.mrspring.wasteland.ruin.Ruin;

public class WastelandGeneratorInfo
{
	private static int ruins;
	private static String info;
	private static String[] rarities;
	public static boolean hasMadeStrings;
	
	public static void createDefault()
	{
		StringBuilder builder = new StringBuilder();
		
		for(ruins = 0; ruins < Ruin.ruins.length && Ruin.ruins[ruins] != null; ruins++)
		{
			builder.append(Ruin.ruins[ruins].getRarity());
			if(Ruin.ruins[ruins + 1] != null)
				builder.append(",");
		}
		
		info = builder.toString();
		rarities = info.split(",");
		hasMadeStrings = true;
	}
	
	public void setComplete(String str)
	{
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		this.ruins = str.split(",").length;
		
		for(int i = 0; i < Ruin.ruins.length && Ruin.ruins[i] != null; i++)
		{
			if(i > ruins)
			{
				ruins = i;
				builder.append(",");
				builder.append(Ruin.ruins[i].getRarity());
			}
		}
		
		info = builder.toString();
		rarities = info.split(",");
		hasMadeStrings = true;
	}
	
	public String[] getRarities()
	{
		if(!hasMadeStrings)
			createDefault();
		return rarities;
	}
	
	public static int getRarity(int id)
	{
		if(!hasMadeStrings)
			createDefault();
		return Integer.parseInt(rarities[id]);
	}
	
	public void setRarity(int id, int rarity)
	{
		if(!hasMadeStrings)
			createDefault();
		
		if(rarity > -1)
			if (!(id > rarities.length))
				this.rarities[id] = String.valueOf(rarity);
			else ;
		else ;
	}
	
	public String getFinal()
	{
		if(!hasMadeStrings)
			createDefault();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < Ruin.ruins.length && Ruin.ruins[i] != null; i++)
		{
			builder.append(getRarities()[i]);
			if(Ruin.ruins[i + 1] != null)
				builder.append(",");
		}
		
		return builder.toString();
	}
	
	public static int getRarityFromStringAndID(String string, int id)
	{
		if(!hasMadeStrings)
			createDefault();
		return Integer.parseInt(string.split(",")[id]);
	}
}
