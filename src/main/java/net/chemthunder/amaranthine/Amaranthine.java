package net.chemthunder.amaranthine;

import net.chemthunder.amaranthine.init.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Amaranthine implements ModInitializer {
	public static final String MOD_ID = "amaranthine";




	public void onInitialize() {
        ModItems.init();

        ModSounds.init();

        ModStatusEffects.init();

        ModBlocks.init();

        ModItemGroup.init();

	}

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}