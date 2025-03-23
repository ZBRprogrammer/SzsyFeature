package com.zombromine.szsyfeature;




import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class modBlocks {
    public static final DeferredRegister.Blocks modBlocksRegister = DeferredRegister.createBlocks(SzsyFeature.MODID);


    public static DeferredBlock<Block> blockRegister(String Name, BlockBehaviour.Properties prop, DeferredRegister.Items modItemsRegister){
        DeferredBlock<Block> registryBlock = modBlocksRegister.register(Name, registryName -> new Block(prop));
        modItemsRegister.register(Name,
                ()->new BlockItem(registryBlock.get(),new Item.Properties()));
        return registryBlock;
    }
    public static final DeferredBlock<Block> dx_beacon = blockRegister("dx_beacon",BlockBehaviour.Properties.ofFullCopy(Blocks.BEACON),modItems.modItemsRegister);

    public static void register(IEventBus modBus){
        modBlocksRegister.register(modBus);
    }
}
