
package net.mcreator.superkrassesprojekt.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.superkrassesprojekt.item.CoinsItem;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;

@SuperkrassesprojektModElements.ModElement.Tag
public class SuperKrasserTabItemGroup extends SuperkrassesprojektModElements.ModElement {
	public SuperKrasserTabItemGroup(SuperkrassesprojektModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsuper_krasser_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CoinsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
