package net.cub.lucidity.item.custom;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent LUCIDIUM = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .snack()
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200), 1)
            .build();


}
