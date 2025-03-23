package com.zombromine.szsyfeature;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class modItems {
    public static final DeferredRegister.Items modItemsRegister = DeferredRegister.createItems(SzsyFeature.MODID);

    public static void register(IEventBus modBus){
        modItemsRegister.register(modBus);
    }
}
