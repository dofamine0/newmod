package com.mmc.balbes.item;

import com.mmc.balbes.SuperBalbesMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SuperItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperBalbesMod.MOD_ID);

    public static final RegistryObject<Item> POZOR = ITEMS.register("pozor",() -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus)
        {
            ITEMS.register(eventBus);
        }
}
