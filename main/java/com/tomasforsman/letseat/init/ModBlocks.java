package com.tomasforsman.letseat.init;

import java.util.ArrayList;
import java.util.List;

import com.tomasforsman.letseat.blocks.BlockBase;
import com.tomasforsman.letseat.blocks.BlockDirts;
import com.tomasforsman.letseat.blocks.BlockLeaf;
import com.tomasforsman.letseat.blocks.BlockLogs;
import com.tomasforsman.letseat.blocks.BlockOres;
import com.tomasforsman.letseat.blocks.BlockPlank;
import com.tomasforsman.letseat.blocks.BlockRicePlant;
import com.tomasforsman.letseat.blocks.BlockSaplings;
import com.tomasforsman.letseat.blocks.ColorBlock;
import com.tomasforsman.letseat.blocks.RubyBlock;

import com.tomasforsman.letseat.blocks.BlockSantaHat;
import com.tomasforsman.letseat.blocks.machines.sinterer.BlockSinteringFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Material
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block GREEN_BLOCK = new ColorBlock("green_block", Material.IRON);
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	// Ore
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	// Tree
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block SANTA_HAT = new BlockSantaHat("santa_hat");
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");
	
	public static final Block RICE_PLANT = new BlockRicePlant("rice_plant");
}
