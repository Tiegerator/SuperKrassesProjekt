
package net.mcreator.superkrassesprojekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.superkrassesprojekt.itemgroup.SuperKrasserTabItemGroup;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;

@SuperkrassesprojektModElements.ModElement.Tag
public class DreonyxPixaxeItem extends SuperkrassesprojektModElements.ModElement {
	@ObjectHolder("superkrassesprojekt:dreonyx_pixaxe")
	public static final Item block = null;
	public DreonyxPixaxeItem(SuperkrassesprojektModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1951;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DreonyxItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(SuperKrasserTabItemGroup.tab)) {
		}.setRegistryName("dreonyx_pixaxe"));
	}
}
