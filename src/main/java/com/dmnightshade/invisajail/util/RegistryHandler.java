package com.dmnightshade.invisajail.util;

import com.dmnightshade.invisajail.InvisaJail;
import com.dmnightshade.invisajail.blocks.BlockItemBase;
import com.dmnightshade.invisajail.blocks.RubyBlock;
import com.dmnightshade.invisajail.items.ItemBase;
import com.dmnightshade.invisajail.tools.InvisaIJailItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dmnightshade.invisajail.tools.InvisaIJailItemTier.*;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InvisaJail.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InvisaJail.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(InvisaIJailItemTier.RUBY, 2,-2.4F, new Item.Properties().group(InvisaJail.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(InvisaIJailItemTier.RUBY, 0,-2.8F, new Item.Properties().group(InvisaJail.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(InvisaIJailItemTier.RUBY, 0.5F,-3.0F, new Item.Properties().group(InvisaJail.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(InvisaIJailItemTier.RUBY, 0.5F,-3.0F, new Item.Properties().group(InvisaJail.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(InvisaIJailItemTier.RUBY,-3, new Item.Properties().group(InvisaJail.TAB)));


    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));

}
