package io.github.aelpecyem.la_cucaracha.mixin;

import io.github.aelpecyem.la_cucaracha.RoachEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CatEntity.class)
public abstract class CatEntityMixin extends TameableEntity {
	protected CatEntityMixin(EntityType<? extends TameableEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(method = "initGoals", at = @At("TAIL"))
	private void cucaracha_addGoals(CallbackInfo ci)  {
		//change TargetGoal to ActiveTargetGoal
		this.targetSelector.add(1, new ActiveTargetGoal<>(this, RoachEntity.class, false, null));
	}
}
