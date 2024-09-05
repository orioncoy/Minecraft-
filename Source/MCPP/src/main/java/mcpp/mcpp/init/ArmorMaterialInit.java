package mcpp.mcpp.init;

import mcpp.mcpp.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial EXAMPLE = new ModArmorMaterial(
            new int[] {400, 400, 400, 400},
            new int[] {400, 400, 400, 400},
            20,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            () -> Ingredient.of(ItemInit.EXAMPLE_ITEM::get),
            "example",
            0.254f,
            0.5f
    );
}

