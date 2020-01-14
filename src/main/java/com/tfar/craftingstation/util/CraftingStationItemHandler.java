package com.tfar.craftingstation.util;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.items.ItemStackHandler;

public class CraftingStationItemHandler extends ItemStackHandler {
  public CraftingStationItemHandler(int size){
    super(size);
  }

  public NonNullList<ItemStack> getContents(){
    return stacks;
  }

  public boolean isEmpty(){
    return getContents().stream().allMatch(ItemStack::isEmpty);
  }
}
