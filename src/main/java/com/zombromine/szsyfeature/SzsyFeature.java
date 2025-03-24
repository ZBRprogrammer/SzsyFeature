package com.zombromine.szsyfeature;

import com.zombromine.szsyfeature.elements.modBlocks;
import com.zombromine.szsyfeature.elements.modCreativeTab;
import com.zombromine.szsyfeature.elements.modItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SzsyFeature.MODID)
public class SzsyFeature
{
    public static final String MODID = "szsyfeature";
    private static final Logger LOGGER = LogUtils.getLogger();

//    public static final CreativeModeTab MY_TAB = CreativeModeTab.builder()
//            .title(Component.translatable("itemGroup.szsyfeature.creativetab"))
//            .icon(() -> new ItemStack(modBlocks.dx_beacon.get()))
//            .build();
    public SzsyFeature(IEventBus modEventBus, ModContainer modContainer)
    {
        modBlocks.register(modEventBus);
        modItems.register(modEventBus);
        modCreativeTab.register(modEventBus);
        LOGGER.info("SZSY Feature Blocks registry!");
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }



    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
        }
    }
}
