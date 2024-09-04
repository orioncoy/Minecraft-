package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static mcpp.mcpp.init.ItemInit.ITEMS;

public class BlockInit {
    // Creates the DeferredRegister that is then registered to the bus
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcpp.MODID);

    
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(5.0f, 17f)
                    .lightLevel(state -> 10)
            ));
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block_item",
            () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            ));
}
