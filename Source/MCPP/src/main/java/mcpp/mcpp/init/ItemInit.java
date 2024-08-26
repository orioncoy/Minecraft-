package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mcpp.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example", () -> new Item(new
            Item.Properties()
            .stacksTo(16)
            .food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(0.2f)
                    .build())
            .rarity(Rarity.EPIC)
    ));

}
