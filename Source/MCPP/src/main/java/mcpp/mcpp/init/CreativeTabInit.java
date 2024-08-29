package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mcpp.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.example_tab"))
                    .icon(ItemInit.EXAMPLE_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ItemInit.EXAMPLE_ITEM.get());
                        output.accept(BlockInit.EXAMPLE_BLOCK_ITEM.get());
                    })
                    .build()
    );
}
