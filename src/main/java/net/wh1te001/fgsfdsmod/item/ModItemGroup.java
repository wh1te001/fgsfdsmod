package net.wh1te001.fgsfdsmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup FGSFDS_GROUP = new ItemGroup("fgsfdsModTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
