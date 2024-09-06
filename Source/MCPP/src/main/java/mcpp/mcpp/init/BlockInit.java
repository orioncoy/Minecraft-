package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static mcpp.mcpp.init.CreativeTabInit.addToTab;
import static mcpp.mcpp.init.ItemInit.ITEMS;

public class BlockInit {
    // Creates the DeferredRegister that is then registered to the bus
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mcpp.MODID);

    // Example block and corresponding block item
    // block items are stored in this class as opposed to ItemInit because of organization
    public static final RegistryObject<Block> EXAMPLE_BLOCK =
            addToTab(BLOCKS.register("example_block", () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_GREEN)
                            .strength(5.0f, 17f)
                            .lightLevel(state -> 10)
            )));
    
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM =
            addToTab(ITEMS.register("example_block_item", () -> new
                    BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));

    public static final RegistryObject<DropExperienceBlock> EXAMPLE_ORE =
            addToTab(BLOCKS.register("example_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(4, 7)
            )));

    public static final RegistryObject<BlockItem> EXAMPLE_ORE_ITEM =
            addToTab(ITEMS.register("example_ore_item", () -> new
                    BlockItem(EXAMPLE_ORE.get(), new Item.Properties()
            )));

    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_EXAMPLE_ORE =
            addToTab(BLOCKS.register("deepslate_example_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE),
                    UniformInt.of(4, 7)
            )));

    public static final RegistryObject<BlockItem> DEEPSLATE_EXAMPLE_ORE_ITEM =
            addToTab(ITEMS.register("deepslate_example_ore_item", () -> new
                    BlockItem(DEEPSLATE_EXAMPLE_ORE.get(), new Item.Properties()
            )));

    public static final RegistryObject<DropExperienceBlock> NETHER_EXAMPLE_ORE =
            addToTab(BLOCKS.register("nether_example_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE),
                    UniformInt.of(4, 7)
            )));

    public static final RegistryObject<BlockItem> NETHER_EXAMPLE_ORE_ITEM =
            addToTab(ITEMS.register("nether_example_ore_item", () -> new
                    BlockItem(NETHER_EXAMPLE_ORE.get(), new Item.Properties()
            )));

    public static final RegistryObject<DropExperienceBlock> END_EXAMPLE_ORE =
            addToTab(BLOCKS.register("end_example_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(4, 7)
            )));

    public static final RegistryObject<BlockItem> END_EXAMPLE_ORE_ITEM =
            addToTab(ITEMS.register("end_example_ore_item", () -> new
                    BlockItem(END_EXAMPLE_ORE.get(), new Item.Properties()
            )));
}
