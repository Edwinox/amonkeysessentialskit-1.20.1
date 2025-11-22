package net.edwinox.monkeykit.item;

import net.edwinox.monkeykit.MonkeyKit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MonkeyKit.MOD_ID);

    public static final RegistryObject<Item> DRIVERS_LICENSE = ITEMS.register("drivers_license",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_KRONA = ITEMS.register("copper_krona",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_KRONA = ITEMS.register("silver_krona",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_KRONA = ITEMS.register("gold_krona",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
