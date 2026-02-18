package com.nvksskull.astralember.registry;

import com.nvksskull.astralember.AstralEmber;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    // Crea un DeferredRegister para Items, usando el ID de tu mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AstralEmber.MODID);

    // Registrar un item de ejemplo
    public static final RegistryObject<Item> ASTRAL_SHARD = ITEMS.register(
        "astral_shard",
        () -> new Item(new Item.Properties().group(ItemGroup.MISC))
    );
}
