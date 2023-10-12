/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.capped.item.VoidColaItem;
import net.mcreator.capped.item.VoidColaBottlecapItem;
import net.mcreator.capped.item.TrappedBottleItem;
import net.mcreator.capped.item.NitroColaItem;
import net.mcreator.capped.item.NitroCapItem;
import net.mcreator.capped.item.NikoItem;
import net.mcreator.capped.item.EnderPureeItem;
import net.mcreator.capped.item.ColaItem;
import net.mcreator.capped.item.CatItem;
import net.mcreator.capped.item.CapItem;
import net.mcreator.capped.item.AllayInABottleItem;
import net.mcreator.capped.CappedMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CappedModItems {
	public static Item COLA;
	public static Item CAP;
	public static Item NITRO_CAP;
	public static Item NITRO_COLA;
	public static Item TRAPPED_BOTTLE;
	public static Item ALLAY_IN_A_BOTTLE;
	public static Item VOID_COLA_BOTTLECAP;
	public static Item VOID_COLA;
	public static Item CRATE;
	public static Item CAT;
	public static Item NIKO;
	public static Item NIKO_WITH_SUN;
	public static Item ENDER_PUREE;

	public static void load() {
		COLA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "cola"), new ColaItem());
		CAP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "cap"), new CapItem());
		NITRO_CAP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "nitro_cap"), new NitroCapItem());
		NITRO_COLA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "nitro_cola"), new NitroColaItem());
		TRAPPED_BOTTLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "trapped_bottle"), new TrappedBottleItem());
		ALLAY_IN_A_BOTTLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "allay_in_a_bottle"), new AllayInABottleItem());
		VOID_COLA_BOTTLECAP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "void_cola_bottlecap"), new VoidColaBottlecapItem());
		VOID_COLA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "void_cola"), new VoidColaItem());
		CRATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "crate"), new BlockItem(CappedModBlocks.CRATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CappedModTabs.TAB_CAPPED).register(content -> content.accept(CRATE));
		CAT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "cat"), new CatItem());
		NIKO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "niko"), new NikoItem());
		NIKO_WITH_SUN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "niko_with_sun"), new BlockItem(CappedModBlocks.NIKO_WITH_SUN, new Item.Properties()));
		ENDER_PUREE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CappedMod.MODID, "ender_puree"), new EnderPureeItem());
	}

	public static void clientLoad() {
	}
}
