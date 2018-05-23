package com.tomasforsman.letseat.init;

import com.tomasforsman.letseat.Main;
import com.tomasforsman.letseat.entity.EntityCentaur;
import com.tomasforsman.letseat.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("centaur", EntityCentaur.class, Reference.ENTITY_CENTAUR, 50, 11437146, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
