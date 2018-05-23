package com.tomasforsman.letseat.init;

import java.util.ArrayList;
import java.util.List;

import com.tomasforsman.letseat.items.ItemBase;
import com.tomasforsman.letseat.items.armor.ArmorBase;
import com.tomasforsman.letseat.items.food.ItemCustomFood;
import com.tomasforsman.letseat.items.food.ItemRice;
import com.tomasforsman.letseat.items.tools.ToolAxe;
import com.tomasforsman.letseat.items.tools.ToolHoe;
import com.tomasforsman.letseat.items.tools.ToolPickaxe;
import com.tomasforsman.letseat.items.tools.ToolSpade;
import com.tomasforsman.letseat.items.tools.ToolSword;
import com.tomasforsman.letseat.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
    /* Materials 
     * (name, harvestLevel, maxUses, efficiency, damage, enchantability)
     * 
     * ("WOOD",0, 59, 2.0F, 0.0F, 15), 
     * ("STONE", 1, 131, 4.0F, 1.0F, 5),
     * ("IRON", 2, 250, 6.0F, 2.0F, 14),
     * ("DIAMOND", 3, 1561, 8.0F, 3.0F, 10),
     * ("GOLD", 0, 32, 12.0F, 0.0F, 22);
     */
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 200, 16.0F, 3.0F, 10);
	public static final ArmorMaterial MATERIAL_RUBY_ARMOR = EnumHelper.addArmorMaterial("material_ruby_armor", Reference.MOD_ID + ":ruby", 33, new int[]{3, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial MATERIAL_CUCUMBER = EnumHelper.addToolMaterial("material_cucumber", 5, 10, 32.0F, 5.0F, 30);
	public static final ArmorMaterial MATERIAL_CUCUMBER_ARMOR = EnumHelper.addArmorMaterial("material_cucumber_armor", Reference.MOD_ID + ":cucumber", 33, new int[]{3, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	
	// Items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	// Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemTool RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY, 6.0F, -3.2F);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemPickaxe CUCUMBER_PICKAXE = new ToolPickaxe("cucumber_pickaxe", MATERIAL_RUBY);
	
	// Armor
	public static final Item CUCUMBER_HELMET = new ArmorBase("cucumber_helmet", MATERIAL_CUCUMBER_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item CUCUMBER_CHESTPLATE = new ArmorBase("cucumber_chestplate", MATERIAL_CUCUMBER_ARMOR, 1, EntityEquipmentSlot.CHEST); 
	public static final Item CUCUMBER_LEGGINGS = new ArmorBase("cucumber_leggings", MATERIAL_CUCUMBER_ARMOR, 2, EntityEquipmentSlot.LEGS); 
	public static final Item CUCUMBER_BOOTS = new ArmorBase("cucumber_boots", MATERIAL_CUCUMBER_ARMOR, 1, EntityEquipmentSlot.FEET); 

	//Food
	public static final Item RICE_BOWL = new ItemCustomFood("rice_bowl", 8, false);
	public static final Item RICE = new ItemRice("rice", 1, false);
	
}
