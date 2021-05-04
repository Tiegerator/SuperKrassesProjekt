
package net.mcreator.superkrassesprojekt.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.superkrassesprojekt.itemgroup.SuperKrasserTabItemGroup;
import net.mcreator.superkrassesprojekt.SuperkrassesprojektModElements;

import java.util.List;
import java.util.Collections;

@SuperkrassesprojektModElements.ModElement.Tag
public class DreonyxGemblockBlock extends SuperkrassesprojektModElements.ModElement {
	@ObjectHolder("superkrassesprojekt:dreonyx_gemblock")
	public static final Block block = null;
	public DreonyxGemblockBlock(SuperkrassesprojektModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SuperKrasserTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(50f, 1200f).lightValue(0).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("dreonyx_gemblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
