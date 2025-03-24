package com.zombromine.szsyfeature.elements;


import com.zombromine.szsyfeature.SzsyFeature;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class modItems {
    public static final DeferredRegister.Items modItemsRegister = DeferredRegister.createItems(SzsyFeature.MODID);

    public static final DeferredItem<Item> icon = modItemsRegister.register(
            "szsy_icon",
            registryName->new Item(
                    new Item.Properties().stacksTo(1).durability(-1).rarity(Rarity.COMMON)
            )
    );
    public static void register(IEventBus modBus){
        modItemsRegister.register(modBus);
    }
}
