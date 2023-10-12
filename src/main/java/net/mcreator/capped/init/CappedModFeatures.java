
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.capped.world.features.ColaCrateCacheNikoFeature;
import net.mcreator.capped.world.features.ColaCrateCacheFeature;
import net.mcreator.capped.CappedMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class CappedModFeatures {
	public static void load() {
		register("cola_crate_cache_niko", new ColaCrateCacheNikoFeature(), ColaCrateCacheNikoFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("cola_crate_cache", new ColaCrateCacheFeature(), ColaCrateCacheFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(CappedMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CappedMod.MODID, registryName)));
	}
}
