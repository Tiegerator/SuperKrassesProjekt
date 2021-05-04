
package net.mcreator.superkrassesprojekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.superkrassesprojekt.itemgroup.SuperKrasserTabItemGroup;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;

@SuperkrassesprojektModElements.ModElement.Tag
public class DreonyxItem extends SuperkrassesprojektModElements.ModElement {
	@ObjectHolder("superkrassesprojekt:dreonyx")
	public static final Item block = null;
	public DreonyxItem(SuperkrassesprojektModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SuperKrasserTabItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("dreonyx");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
