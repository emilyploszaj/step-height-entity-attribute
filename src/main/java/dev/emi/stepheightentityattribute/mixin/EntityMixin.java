package dev.emi.stepheightentityattribute.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;

import dev.emi.stepheightentityattribute.StepHeightEntityAttributeMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
	@Shadow private float stepHeight;

	@Inject(method = "getStepHeight", at = @At(value = "RETURN"), cancellable = true)
	public void getStepHeight(CallbackInfoReturnable<Float> cir) {
		if((Object)this instanceof LivingEntity) {
			cir.setReturnValue(StepHeightEntityAttributeMain.getStepHeight(this.stepHeight, (LivingEntity) (Object)this));
		}
	}
}