package com.tomasforsman.letseat.util.handlers;

import com.tomasforsman.letseat.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation CENTAUR = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "centaur"));
}
