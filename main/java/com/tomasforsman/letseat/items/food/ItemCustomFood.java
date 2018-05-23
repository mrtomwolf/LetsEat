package com.tomasforsman.letseat.items.food;

import com.tomasforsman.letseat.Main;
import com.tomasforsman.letseat.init.ModItems;
import com.tomasforsman.letseat.util.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel
{
	public ItemCustomFood(String name, int amount, boolean isWolfFood) 
	{
		super(amount, isWolfFood);
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
