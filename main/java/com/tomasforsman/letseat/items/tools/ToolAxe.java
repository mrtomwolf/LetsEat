package com.tomasforsman.letseat.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.tomasforsman.letseat.Main;
import com.tomasforsman.letseat.init.ModBlocks;
import com.tomasforsman.letseat.init.ModItems;
import com.tomasforsman.letseat.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel {
	
	private static final Set<Block> EFFECTIVE_ON_BASE = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	private static final Set<Block> EFFECTIVE_ON_MOD = Sets.newHashSet(ModBlocks.GREEN_BLOCK);
	private static Set<Block> EFFECTIVE_ON = Sets.newHashSet();
	boolean addBase = EFFECTIVE_ON.addAll(EFFECTIVE_ON_BASE);
	boolean addMod = EFFECTIVE_ON.addAll(EFFECTIVE_ON_MOD);
	
	
	public ToolAxe(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.letseattab);
        this.attackDamage = damage;
        this.attackSpeed = speed;
		
		ModItems.ITEMS.add(this);
	}

	public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
