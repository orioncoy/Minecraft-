package mcpp.mcpp.init.tiers;

import mcpp.mcpp.Mcpp;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

// :(
public class ModArmorMaterial implements ArmorMaterial {

    private final int[] durabilityForType;
    private final int[] offenseForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    public ModArmorMaterial(
            int[] durabilityForType,
            int[] offenseForType,
            int enchantability,
            SoundEvent equipSound,
            Supplier<Ingredient> repairMaterial,
            String name, float toughness,
            float knockbackResistance) {
                    this.durabilityForType = durabilityForType;
                    this.offenseForType = offenseForType;
                    this.enchantability = enchantability;
                    this.equipSound = equipSound;
                    this.repairMaterial = repairMaterial;
                    this.name = Mcpp.MODID + ":" + name;
                    this.toughness = toughness;
                    this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.durabilityForType[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.offenseForType[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return Mcpp.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
