
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.capped.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class CappedModSounds {
	public static SoundEvent NIKO_PLACE = SoundEvent.createVariableRangeEvent(new ResourceLocation("capped", "niko_place"));
	public static SoundEvent NIKO_BREAK = SoundEvent.createVariableRangeEvent(new ResourceLocation("capped", "niko_break"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("capped", "niko_place"), NIKO_PLACE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("capped", "niko_break"), NIKO_BREAK);
	}
}
