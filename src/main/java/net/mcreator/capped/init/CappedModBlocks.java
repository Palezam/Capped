
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.capped.block.NikoWithSunBlock;
import net.mcreator.capped.block.CrateBlock;
import net.mcreator.capped.CappedMod;

public class CappedModBlocks {
	public static Block CRATE;
	public static Block NIKO_WITH_SUN;

	public static void load() {
		CRATE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CappedMod.MODID, "crate"), new CrateBlock());
		NIKO_WITH_SUN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CappedMod.MODID, "niko_with_sun"), new NikoWithSunBlock());
	}

	public static void clientLoad() {
		CrateBlock.clientInit();
		NikoWithSunBlock.clientInit();
	}
}
