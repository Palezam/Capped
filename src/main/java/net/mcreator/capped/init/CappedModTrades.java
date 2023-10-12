
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.capped.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class CappedModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.IRON_INGOT), ItemStack.EMPTY, new ItemStack(CappedModItems.CAP, 5), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.IRON_HORSE_ARMOR), ItemStack.EMPTY, new ItemStack(CappedModItems.CAP), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Blocks.RAIL), ItemStack.EMPTY, new ItemStack(CappedModItems.CAP), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Blocks.CAULDRON), ItemStack.EMPTY, new ItemStack(CappedModItems.CAP, 15), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
			factories.add(new BasicTrade(new ItemStack(CappedModItems.CAP, 64), new ItemStack(CappedModItems.CAP, 64), new ItemStack(CappedModItems.ALLAY_IN_A_BOTTLE), 3, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.CAP, 64), ItemStack.EMPTY, new ItemStack(Blocks.SNIFFER_EGG), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.CAP, 32), ItemStack.EMPTY, new ItemStack(Blocks.BELL), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.NITRO_CAP), ItemStack.EMPTY, new ItemStack(Items.GOLDEN_CARROT, 64), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.NITRO_CAP), ItemStack.EMPTY, new ItemStack(Blocks.TNT, 16), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.NITRO_CAP), ItemStack.EMPTY, new ItemStack(Blocks.PIGLIN_HEAD), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.VOID_COLA_BOTTLECAP, 2), ItemStack.EMPTY, new ItemStack(Items.NETHER_STAR), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(CappedModItems.CAP, 64), new ItemStack(CappedModItems.CAP, 64), new ItemStack(CappedModItems.NITRO_CAP), 99, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(CappedModItems.NITRO_CAP, 64), new ItemStack(CappedModItems.NITRO_CAP, 64), new ItemStack(CappedModItems.VOID_COLA_BOTTLECAP), 99, 5, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(price, price2, offer, maxTrades, xp, priceMult);
		}
	}
}
