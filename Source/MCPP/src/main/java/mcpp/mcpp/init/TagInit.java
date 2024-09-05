package mcpp.mcpp.init;

import mcpp.mcpp.Mcpp;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

// imma be real, i have no fucking clue
// god help me
public class TagInit {
    public static final TagKey<Block> NEEDS_EXAMPLE_TOOL = tag("needs_example_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Mcpp.MODID, name));
    }

}
