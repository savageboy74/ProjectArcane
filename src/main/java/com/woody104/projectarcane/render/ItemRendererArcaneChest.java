package com.woody104.projectarcane.render;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;

public class ItemRendererArcaneChest implements IItemRenderer {

    private ModelChest chestModel;

    public ItemRendererArcaneChest() {
        chestModel = new ModelChest();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityArcaneChest(), 0.0D, 0.0D, 0.0D, 0.0F);
    }

}