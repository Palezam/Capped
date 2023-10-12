/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.capped;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.capped.init.CappedModTrades;
import net.mcreator.capped.init.CappedModTabs;
import net.mcreator.capped.init.CappedModSounds;
import net.mcreator.capped.init.CappedModProcedures;
import net.mcreator.capped.init.CappedModItems;
import net.mcreator.capped.init.CappedModFeatures;
import net.mcreator.capped.init.CappedModBlocks;

import net.fabricmc.api.ModInitializer;

public class CappedMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "capped";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CappedMod");

		CappedModTabs.load();

		CappedModBlocks.load();
		CappedModItems.load();

		CappedModFeatures.load();

		CappedModProcedures.load();

		CappedModTrades.registerTrades();
		CappedModSounds.load();

	}
}
