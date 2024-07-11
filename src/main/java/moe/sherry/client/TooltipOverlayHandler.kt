package moe.sherry.client

import moe.sherry.utils.Perks
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.font.TextRenderer.TextLayerType
import net.minecraft.client.gui.tooltip.TooltipComponent
import net.minecraft.client.item.TooltipContext
import net.minecraft.client.item.TooltipData
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.text.*
import org.joml.Matrix4f

object TooltipOverlayHandler {
    fun onItemTooltip(stack: ItemStack?, player: PlayerEntity?, context: TooltipContext, tooltip: MutableList<Text>?){
        if(stack == null || player == null || tooltip == null) return
        val addDescriptionsAt: MutableList<Pair<Int, String>> = ArrayList()
        tooltip.forEachIndexed { index, text ->
            val description = Perks.all[text.string.lowercase()]
            if(description != null) addDescriptionsAt.add(Pair(index+1, description))
        }
        addDescriptionsAt.reverse()

        addDescriptionsAt.forEach { tooltip.add(it.first, Text.of("- " + it.second)) }
    }
}

//abstract class EmptyText : Text {
//    override fun getStyle(): Style {
//        return Style.EMPTY
//    }
//
//    override fun getContent(): TextContent {
//        return TextContent.EMPTY
//    }
//
//    override fun getSiblings(): List<Text> {
//        return emptySiblings
//    }
//
//    companion object {
//        var emptySiblings: List<Text> = ArrayList()
//    }
//}
//
//class FoodOverlayTextComponent(val text: String) : EmptyText(), OrderedText {
//
//    override fun asOrderedText(): OrderedText {
//        return this
//    }
//
//    override fun accept(visitor: CharacterVisitor): Boolean {
//        return TextVisitFactory.visitFormatted(this, style, visitor)
//    }
//}

//class FoodOverlay: TooltipComponent, TooltipData {
//    override fun getHeight(): Int {
//        return 200
//    }
//
//    override fun getWidth(textRenderer: TextRenderer?): Int {
//        return 200
//    }
//
//    override fun drawText(
//        textRenderer: TextRenderer?,
//        x: Int,
//        y: Int,
//        matrix: Matrix4f?,
//        vertexConsumers: VertexConsumerProvider.Immediate?
//    ) {
//        textRenderer?.draw("test", x.toFloat(), y.toFloat(), 0, false, matrix, vertexConsumers, TextLayerType.NORMAL, 0, 100)
//        super.drawText(textRenderer, x, y, matrix, vertexConsumers)
//    }
//
//}