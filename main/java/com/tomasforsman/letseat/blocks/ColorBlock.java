package com.tomasforsman.letseat.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ColorBlock extends BlockBase {

	public ColorBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(2.0F);
		setResistance(15.0F);
		//setHarvestLevel("axe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
