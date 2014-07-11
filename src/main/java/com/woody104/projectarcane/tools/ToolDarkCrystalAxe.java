package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemAxe;

public class ToolDarkCrystalAxe extends ItemAxe{
	
	public ToolDarkCrystalAxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
