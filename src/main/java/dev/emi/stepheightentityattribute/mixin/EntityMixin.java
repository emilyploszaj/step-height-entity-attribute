package dev.emi.stepheightentityattribute.mixin;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import dev.emi.stepheightentityattribute.StepHeightEntityAttributeMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

@Mixin(Entity.class)
public abstract class EntityMixin {

	@Redirect(at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;stepHeight:F", opcode = Opcodes.GETFIELD), method = "adjustMovementForCollisions*")
	public float getStepHeight(Entity e) {
		if (e instanceof LivingEntity) {
			return StepHeightEntityAttributeMain.getStepHeight((LivingEntity) e);
		} else return e.stepHeight;
	}
}