package dev.emi.stepheightentityattribute.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import dev.emi.stepheightentityattribute.StepHeightEntityAttributeMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

	public LivingEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}

	@Inject(at = @At("TAIL"), method = "initAttributes")
	public void initAttributes(CallbackInfo info) {
		((LivingEntity) (Entity) this).getAttributeContainer().register(StepHeightEntityAttributeMain.STEP_HEIGHT);
	}
}