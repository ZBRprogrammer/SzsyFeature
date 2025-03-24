package com.zombromine.szsyfeature.elements;

import com.zombromine.szsyfeature.SzsyFeature;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class modCreativeTab {
    public static final DeferredRegister<CreativeModeTab> modCreativeTabRegister = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, SzsyFeature.MODID);
    public static final Supplier<CreativeModeTab> szsyFeartureModTab = modCreativeTabRegister.register(
            "szsyfeature",
            ()-> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.szsyfeature.creativetab"))
                    .icon(()->new ItemStack(modItems.icon.get()))
                    .displayItems(((pParameters, pOutput) ->
                            {
                                pOutput.accept(modBlocks.dx_beacon.get());
                                pOutput.accept(modItems.icon.get());
                            })
                    )
                    .build()
    );
    public static void register(IEventBus modBus){
        modCreativeTabRegister.register(modBus);
    }
}
