package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    // Creates the DeferredRegister that is then registered to the bus
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mcpp.MODID);

    public static final List<Supplier<? extends ItemLike>> MCPP_TAB = new ArrayList<>();

    public static <T extends ItemLike> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        MCPP_TAB.add(itemLike);
        return itemLike;
    }
}
