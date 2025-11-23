package net.edwinox.monkeykit.item;

import net.edwinox.monkeykit.MonkeyKit;
import net.edwinox.monkeykit.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MonkeyKit.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MONKEY_TAB = CREATIVE_MODE_TABS.register("monkey_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_KRONA.get()))
                    .title(Component.translatable("creativetab.monkey_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DRIVERS_LICENSE.get());
                        output.accept(ModItems.COPPER_KRONA.get());
                        output.accept(ModItems.SILVER_KRONA.get());
                        output.accept(ModItems.GOLD_KRONA.get());

                        output.accept(ModBlocks.TIME_WASTE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);


    }
}
