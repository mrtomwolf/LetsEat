package com.tomasforsman.letseat.init;

import org.lwjgl.Sys;

import com.tomasforsman.letseat.world.biomes.BiomeCopper;
import com.tomasforsman.letseat.world.biomes.BiomeLibrary;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
	public static final Biome COPPER = new BiomeCopper();
	public static final Biome LIBRARY_DIMENSION = new BiomeLibrary();
	
	public static void registerBiomes()
	{
		initBiome(COPPER, "Copper", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
		initBiome(LIBRARY_DIMENSION, "Library", BiomeType.WARM, Type.SPOOKY, Type.DENSE, Type.DRY);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}
}
