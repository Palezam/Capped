
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.mcreator.capped.procedures.VoidColaRightclickedProcedure;
import net.mcreator.capped.procedures.VoidColaDrankProcedure;
import net.mcreator.capped.procedures.TrappedBottleRightClickAllayProcedure;
import net.mcreator.capped.procedures.NitroColaDrankProcedure;
import net.mcreator.capped.procedures.CatRightclickedProcedure;
import net.mcreator.capped.procedures.AllayInABottleRightclickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CappedModProcedures {
	public static void load() {
		new AllayInABottleRightclickedProcedure();
		new NitroColaDrankProcedure();
		new TrappedBottleRightClickAllayProcedure();
		new VoidColaDrankProcedure();
		new CatRightclickedProcedure();
		new VoidColaRightclickedProcedure();
	}
}
