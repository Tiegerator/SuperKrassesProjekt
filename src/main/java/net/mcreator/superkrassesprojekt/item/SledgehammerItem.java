
package net.mcreator.superkrassesprojekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.superkrassesprojekt.procedures.SledgehammerToolInHandTickProcedure;
import net.mcreator.superkrassesprojekt.itemgroup.SuperKrasserTabItemGroup;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;

import java.util.Map;
import java.util.HashMap;

@SuperkrassesprojektModElements.ModElement.Tag
public class SledgehammerItem extends SuperkrassesprojektModElements.ModElement {
	@ObjectHolder("superkrassesprojekt:sledgehammer")
	public static final Item block = null;
	public SledgehammerItem(SuperkrassesprojektModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 666;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.IRON_BLOCK, (int) (1)));
			}
		}, 3, -3.5f, new Item.Properties().group(SuperKrasserTabItemGroup.tab)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					SledgehammerToolInHandTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("sledgehammer"));
	}
}
