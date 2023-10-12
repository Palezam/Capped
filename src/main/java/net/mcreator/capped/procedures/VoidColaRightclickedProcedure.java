package net.mcreator.capped.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class VoidColaRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 1), y, (z + 1), 5, 1, 1, 1, 1);
	}
}
