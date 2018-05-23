package com.tomasforsman.letseat.tabs;

import com.tomasforsman.letseat.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LetsEatTab extends CreativeTabs{

	public LetsEatTab(String label) {
		super("Let's Eat");
		this.setBackgroundImageName("letseat.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItems.CUCUMBER_PICKAXE);
	}

}
