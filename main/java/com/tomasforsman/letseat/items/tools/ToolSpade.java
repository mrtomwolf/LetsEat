package com.tomasforsman.letseat.items.tools;

import com.tomasforsman.letseat.Main;
import com.tomasforsman.letseat.init.ModItems;
import com.tomasforsman.letseat.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {
	
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.letseattab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
