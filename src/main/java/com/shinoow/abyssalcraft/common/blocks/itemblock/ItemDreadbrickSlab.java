/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.blocks.itemblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.shinoow.abyssalcraft.AbyssalCraft;
import com.shinoow.abyssalcraft.api.block.ACBlocks;

public class ItemDreadbrickSlab extends ItemSlab {

	public ItemDreadbrickSlab(Block block) {
		super(block, (BlockSlab)ACBlocks.dreadstone_brick_slab, (BlockSlab)AbyssalCraft.dreadbrickslab2);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
}
