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

}
