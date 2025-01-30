package dev.liam.glyphrenderer;

import lombok.Getter;

import java.util.Map;

public class GlyphPage {

    @Getter
    private final FontTexture texture;
    @Getter
    private final int maxHeight;
    private final Map<Integer, CharacterData> characterRegistry;

    public GlyphPage(FontTexture texture, int maxHeight, Map<Integer, CharacterData> characterRegistry) {
        this.texture = texture;
        this.maxHeight = maxHeight;
        this.characterRegistry = characterRegistry;
    }

    public CharacterData getCharacterData(char c) {
        return characterRegistry.get((int) c);
    }
}
