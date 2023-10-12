
package net.mcreator.capped.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.capped.procedures.AllayInABottleRightclickedProcedure;
import net.mcreator.capped.init.CappedModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class AllayInABottleItem extends Item {
	public AllayInABottleItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(CappedModTabs.TAB_CAPPED).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AllayInABottleRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		AllayInABottleRightclickedProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
