package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // Creates the DeferredRegister that is then registered to the bus
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcpp.MODID);

    // Example food item
    public static final RegistryObject<Item> EXAMPLE_ITEM =
            ITEMS.register("example_item", () -> new Item(new
                    Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(1)
                            .build())
                    .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<SwordItem> EXAMPLE_SWORD =
            ITEMS.register("example_sword", () -> new SwordItem(new
                    SwordItem(, 1, 2.5f,
                    new Item.Properties(

                    ))
            ));

    public static final RegistryObject<SwordItem> EXAMPLE_PICKAXE =
            ITEMS.register("example_pickaxe", () -> new SwordItem(new
                    SwordItem(, 1, 2.5f,
                    new Item.Properties(

                    ))
            ));

    public static final RegistryObject<SwordItem> EXAMPLE_AXE =
            ITEMS.register("example_axe", () -> new SwordItem(new
                    SwordItem(, 1, 2.5f,
                    new Item.Properties(

                    ))
            ));

    public static final RegistryObject<SwordItem> EXAMPLE_SHOVEL =
            ITEMS.register("example_shovel", () -> new SwordItem(new
                    SwordItem(, 1, 2.5f,
                    new Item.Properties(

                    ))
            ));

    public static final RegistryObject<SwordItem> EXAMPLE_HOE =
            ITEMS.register("example_hoe", () -> new SwordItem(new
                    SwordItem(, 1, 2.5f,
                    new Item.Properties(

                    ))
            ));
}
