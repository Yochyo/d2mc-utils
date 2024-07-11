package moe.sherry.mixin

import moe.sherry.client.TooltipOverlayHandler
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable

@Mixin(ItemStack::class)
class ItemStackMixin {
    @Inject(at = [At("RETURN")], method = ["getTooltip(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/client/item/TooltipContext;)Ljava/util/List;"])
    private fun getTooltipFromItem(player: PlayerEntity, context: TooltipContext, info: CallbackInfoReturnable<MutableList<Text>>){
        TooltipOverlayHandler.onItemTooltip((this as ItemStack), player, context, info.returnValue)
    }
}