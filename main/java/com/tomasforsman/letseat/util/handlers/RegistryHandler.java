package com.tomasforsman.letseat.util.handlers;

import com.tomasforsman.letseat.Main;
import com.tomasforsman.letseat.commands.TPDimensionCommand;
import com.tomasforsman.letseat.init.BiomeInit;
import com.tomasforsman.letseat.init.ModBlocks;
import com.tomasforsman.letseat.init.DimensionInit;
import com.tomasforsman.letseat.init.EntityInit;
import com.tomasforsman.letseat.init.ModItems;
import com.tomasforsman.letseat.util.interfaces.IHasModel;
import com.tomasforsman.letseat.world.gen.WorldGenCustomOres;
import com.tomasforsman.letseat.world.gen.WorldGenCustomStructures;
import com.tomasforsman.letseat.world.types.WorldTypeCopper;
import com.tomasforsman.letseat.world.types.WorldTypeCustom;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		BiomeInit.registerBiomes();
		DimensionInit.registerDimensions();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void initRegistries()
	{
		System.out.println("INIT!");
		SoundsHandler.registerSounds();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		TileEntityHandler.registerTileEntities();
	}
	
	public static void postInitRegistries()
	{
		WorldType COPPER = new WorldTypeCopper();
		WorldType CUSTOM = new WorldTypeCustom();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new TPDimensionCommand());
	}
}