package com.dmnightshade.invisajail.items;

import com.dmnightshade.invisajail.InvisaJail;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(InvisaJail.TAB));
    }
}
