package dev.emi.stepheightentityattribute.mixin;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import dev.emi.stepheightentityattribute.StepHeightEntityAttributeMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

@Mixin(Entity.class)
public abstract class EntityMixin {
	@Shadow public abstract float getStepHeight();

	@Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getStepHeight()F"), method = "adjustMovementForCollisions")
	public float getStepHeight(Entity e) {
		if (e instanceof LivingEntity) {
			return StepHeightEntityAttributeMain.getStepHeight((LivingEntity) e);
		} else return this.getStepHeight();
	}
}