package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static mcpp.mcpp.init.CreativeTabInit.addToTab;

public class ItemInit {
    // Creates the DeferredRegister that is then registered to the bus
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcpp.MODID);

    // Example food item
    public static final RegistryObject<Item> EXAMPLE_ITEM =
            addToTab(ITEMS.register("example_item", () -> new Item(new
                    Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(1)
                            .build())
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<SwordItem> EXAMPLE_SWORD =
            addToTab(ITEMS.register("example_sword", () -> (new
                    SwordItem(TierInit.EXAMPLE, 1, 2.5f,
                            new Item.Properties())
            )));

    public static final RegistryObject<PickaxeItem> EXAMPLE_PICKAXE =
            addToTab(ITEMS.register("example_pickaxe", () -> (new
                    PickaxeItem(TierInit.EXAMPLE, 1, 2.5f,
                        new Item.Properties())
            )));

    public static final RegistryObject<AxeItem> EXAMPLE_AXE =
            addToTab(ITEMS.register("example_axe", () -> (new
                    AxeItem(TierInit.EXAMPLE, 1, 2.5f,
                            new Item.Properties())
            )));

    public static final RegistryObject<ShovelItem> EXAMPLE_SHOVEL =
            addToTab(ITEMS.register("example_shovel", () -> (new
                    ShovelItem(TierInit.EXAMPLE, 1, 2.5f,
                            new Item.Properties())
            )));

    public static final RegistryObject<HoeItem> EXAMPLE_HOE =
            addToTab(ITEMS.register("example_hoe", () -> (new
                    HoeItem(TierInit.EXAMPLE, 1, 2.5f,
                    new Item.Properties())
            )));

    public static final RegistryObject<ArmorItem> EXAMPLE_HELMET =
            addToTab(ITEMS.register("example_helmet", () -> new ArmorItem(
                    ArmorMaterialInit.EXAMPLE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> EXAMPLE_CEHSTPLATE =
            addToTab(ITEMS.register("example_chestplate", () -> new ArmorItem(
                    ArmorMaterialInit.EXAMPLE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> EXAMPLE_LEGGINGS =
            addToTab(ITEMS.register("example_leggings", () -> new ArmorItem(
                    ArmorMaterialInit.EXAMPLE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> EXAMPLE_BOOTS =
            addToTab(ITEMS.register("example_boots", () -> new ArmorItem(
                    ArmorMaterialInit.EXAMPLE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )));
}
