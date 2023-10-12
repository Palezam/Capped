
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.capped.CappedMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class CappedModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CAPPED = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CappedMod.MODID, "capped"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CAPPED, FabricItemGroup.builder().title(Component.translatable("item_group." + CappedMod.MODID + ".capped")).icon(() -> new ItemStack(CappedModItems.CAP)).build());
	}
}
