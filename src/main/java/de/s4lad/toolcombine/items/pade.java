package de.s4lad.toolcombine.items;


import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.ForgeHooks;

import java.util.Collections;
import java.util.Set;

/**
 * A tool that can function as a sword, pickaxe, axe or shovel.
 * <p>
 * Test for this thread:
 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/modification-development/2550421-how-to-make-a-tool-e-g-a-sword-have-the-abilities
 */
public class pade extends ItemTool {
	/**
	 * The speed at which blocks are harvested if this isn't their correct tool
	 */
	private static final float DIG_SPEED_DEFAULT = 1.0f;

	public pade(ToolMaterial toolMaterial) {
		super(4.0f, 0.0f, toolMaterial, Collections.EMPTY_SET);
		setHarvestLevel("pickaxe", toolMaterial.getHarvestLevel());
		setHarvestLevel("shovel", toolMaterial.getHarvestLevel());
	}

	/**
	 * The {@link Material}s that this tool is effective on.
	 */
	private static final Set<Material> EFFECTIVE_MATERIALS = ImmutableSet.of(
			// Pickaxe
			Material.ROCK, Material.IRON, Material.ICE, Material.GLASS, Material.PISTON, Material.ANVIL, Material.CIRCUITS,

			// Shovel
			Material.GRASS, Material.GROUND, Material.SAND, Material.SNOW, Material.CRAFTED_SNOW, Material.CLAY
	);

	/**
	 * Can this tool harvest the {@link Block}?
	 * <p>
	 * This should only be used by {@link EntityPlayer#isCurrentToolAdventureModeExempt(int, int, int)} and {@link ForgeHooks#canHarvestBlock(Block, EntityPlayer, int)},
	 * use the tool class/harvest level system where possible.
	 *
	 * @param block     The Block
	 * @param itemStack The tool
	 * @return Is this tool effective on the {@link Block}'s {@link Material}?
	 */
	public boolean canHarvestBlock(Block block, ItemStack itemStack) {
		return EFFECTIVE_MATERIALS.contains(block.getMaterial(block.getDefaultState())) || block == Blocks.WEB;
	}
}
