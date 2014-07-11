package com.woody104.projectarcane.items;

import com.woody104.projectarcane.core.Arcane;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by woody104 on 5/17/2014.
 */
public class PAMaterial extends Item {

    public PAMaterial() {
        this.setCreativeTab(Arcane.arcaneTab_material);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Arcane.MODID + ":" + this.getUnlocalizedName().substring(5));
    }
}