/**
 * AbyssalCraft
 * Copyright 2012-2015 Shinoow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shinoow.abyssalcraft.common.structures.abyss;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.shinoow.abyssalcraft.AbyssalCraft;

public class Abypillar extends WorldGenerator
{
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] {
				AbyssalCraft.abystone
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockMetadata(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockMetadata(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3)
			return false;
		j += distanceToAir - 1;

		Block blockID = world.getBlock(i, j, k);
		Block blockIDAbove = world.getBlock(i, j+1, k);
		Block blockIDBelow = world.getBlock(i, j-1, k);
		for (Block x : GetValidSpawnBlocks()){
			if (blockIDAbove != Blocks.air)
				return false;
			if (blockID == x)
				return true;
			else if (blockID == Blocks.snow && blockIDBelow == x)
				return true;
		}
		return false;
	}

	public Abypillar() { }

	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 6, j, k) || !LocationIsValidSpawn(world, i + 6, j, k + 6) || !LocationIsValidSpawn(world, i, j, k + 6))
			return false;

		world.setBlock (i + 0, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 0, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 0, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 0, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 0, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 1, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 1, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 1, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 2, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 1, j + 98, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 0, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 0, k + 6, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 1, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 1, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 1, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 1, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 1, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 2, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 2, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 2, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 3, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 3, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 3, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 4, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 5, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 6, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 7, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 7, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 8, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 9, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 10, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 11, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 11, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 12, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 13, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 14, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 15, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 15, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 16, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 17, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 18, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 19, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 19, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 20, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 21, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 22, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 23, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 23, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 24, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 25, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 26, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 27, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 27, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 28, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 29, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 30, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 31, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 31, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 32, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 33, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 34, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 35, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 35, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 36, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 37, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 38, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 39, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 39, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 40, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 41, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 42, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 43, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 43, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 44, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 45, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 46, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 47, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 47, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 48, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 49, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 50, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 51, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 51, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 52, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 53, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 54, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 55, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 55, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 56, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 57, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 58, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 59, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 59, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 60, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 61, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 62, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 63, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 63, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 64, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 65, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 66, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 67, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 67, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 68, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 69, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 70, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 71, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 71, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 72, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 73, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 74, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 75, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 75, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 76, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 77, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 78, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 79, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 79, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 80, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 81, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 82, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 83, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 83, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 84, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 85, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 86, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 87, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 87, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 88, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 89, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 90, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 91, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 91, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 92, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 93, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 94, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 95, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 95, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 96, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 97, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 98, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 98, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 98, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 2, j + 99, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 0, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 0, k + 6, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 1, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 1, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 1, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 1, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 1, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 2, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 2, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 2, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 2, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 2, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 3, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 3, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 3, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 4, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 4, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 4, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 5, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 5, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 5, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 6, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 6, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 6, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 7, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 8, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 8, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 8, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 9, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 9, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 9, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 10, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 10, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 10, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 11, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 12, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 12, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 12, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 13, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 13, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 13, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 14, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 14, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 14, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 15, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 16, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 16, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 16, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 17, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 17, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 17, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 18, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 18, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 18, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 19, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 20, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 20, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 20, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 21, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 21, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 21, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 22, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 22, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 22, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 23, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 24, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 24, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 24, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 25, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 25, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 25, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 26, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 26, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 26, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 27, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 28, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 28, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 28, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 29, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 29, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 29, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 30, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 30, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 30, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 31, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 32, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 32, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 32, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 33, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 33, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 33, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 34, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 34, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 34, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 35, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 36, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 36, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 36, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 37, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 37, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 37, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 38, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 38, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 38, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 39, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 40, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 40, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 40, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 41, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 41, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 41, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 42, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 42, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 42, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 43, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 44, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 44, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 44, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 45, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 45, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 45, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 46, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 46, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 46, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 47, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 48, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 48, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 48, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 49, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 49, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 49, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 50, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 50, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 50, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 51, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 52, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 52, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 52, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 53, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 53, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 53, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 54, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 54, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 54, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 55, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 56, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 56, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 56, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 57, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 57, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 57, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 58, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 58, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 58, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 59, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 60, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 60, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 60, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 61, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 61, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 61, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 62, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 62, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 62, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 63, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 64, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 64, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 64, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 65, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 65, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 65, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 66, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 66, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 66, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 67, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 68, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 68, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 68, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 69, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 69, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 69, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 70, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 70, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 70, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 71, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 72, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 72, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 72, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 73, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 73, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 73, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 74, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 74, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 74, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 75, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 76, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 76, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 76, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 77, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 77, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 77, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 78, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 78, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 78, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 79, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 80, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 80, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 80, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 81, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 81, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 81, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 82, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 82, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 82, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 83, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 84, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 84, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 84, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 85, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 85, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 85, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 86, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 86, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 86, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 87, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 88, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 88, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 88, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 89, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 89, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 89, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 90, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 90, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 90, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 91, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 92, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 92, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 92, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 93, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 93, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 93, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 94, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 94, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 94, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 95, k + 3, Blocks.glowstone, 0, 0);
		world.setBlock (i + 3, j + 96, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 96, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 96, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 97, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 97, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 97, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 98, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 98, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 98, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 98, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 98, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 99, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 3, j + 99, k + 3, Blocks.diamond_block, 0, 0);
		world.setBlock (i + 3, j + 99, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 0, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 0, k + 6, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 1, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 1, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 1, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 1, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 1, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 2, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 2, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 2, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 3, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 3, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 3, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 4, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 5, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 6, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 7, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 7, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 8, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 9, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 10, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 11, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 11, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 12, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 13, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 14, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 15, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 15, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 16, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 17, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 18, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 19, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 19, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 20, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 21, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 22, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 23, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 23, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 24, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 25, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 26, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 27, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 27, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 28, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 29, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 30, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 31, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 31, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 32, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 33, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 34, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 35, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 35, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 36, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 37, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 38, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 39, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 39, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 40, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 41, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 42, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 43, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 43, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 44, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 45, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 46, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 47, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 47, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 48, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 49, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 50, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 51, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 51, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 52, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 53, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 54, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 55, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 55, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 56, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 57, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 58, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 59, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 59, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 60, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 61, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 62, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 63, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 63, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 64, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 65, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 66, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 67, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 67, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 68, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 69, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 70, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 71, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 71, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 72, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 73, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 74, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 75, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 75, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 76, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 77, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 78, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 79, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 79, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 80, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 81, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 82, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 83, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 83, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 84, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 85, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 86, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 87, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 87, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 88, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 89, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 90, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 91, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 91, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 92, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 93, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 94, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 95, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 95, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 96, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 97, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 98, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 98, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 98, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 4, j + 99, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 0, k + 1, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 0, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 0, k + 5, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 1, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 1, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 1, k + 4, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 2, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 5, j + 98, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 6, j + 0, k + 2, Blocks.obsidian, 0, 0);
		world.setBlock (i + 6, j + 0, k + 3, Blocks.obsidian, 0, 0);
		world.setBlock (i + 6, j + 0, k + 4, Blocks.obsidian, 0, 0);

		return true;
	}
}