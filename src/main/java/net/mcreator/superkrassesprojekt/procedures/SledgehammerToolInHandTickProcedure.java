package net.mcreator.superkrassesprojekt.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.superkrassesprojekt.item.SledgehammerItem;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektMod;

import java.util.Map;

@SuperkrassesprojektModElements.ModElement.Tag
public class SledgehammerToolInHandTickProcedure extends SuperkrassesprojektModElements.ModElement {
	public SledgehammerToolInHandTickProcedure(SuperkrassesprojektModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperkrassesprojektMod.LOGGER.warn("Failed to load dependency entity for procedure SledgehammerToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SledgehammerItem.block, (int) (1)))
				: false)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 30, (int) 0, (false), (false)));
		}
	}
}
