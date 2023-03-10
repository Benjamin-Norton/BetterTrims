package com.bawnorton.mixin;

import com.bawnorton.config.Config;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SmithingTemplateItem.class)
public abstract class SmithingTemplateItemMixin {

    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V"))
    private static Item.Settings modifyItemSettings(Item.Settings settings) {
        return settings.maxDamage(Config.getInstance().trimDurability);
    }
}
