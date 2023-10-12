
package net.mcreator.capped.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.capped.init.CappedModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class EnderPureeItem extends Item {
	public EnderPureeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(CappedModTabs.TAB_CAPPED).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
