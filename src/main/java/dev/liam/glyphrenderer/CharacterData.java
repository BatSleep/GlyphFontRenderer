package dev.liam.glyphrenderer;

import lombok.Getter;

@Getter
public class CharacterData {

    private final int x, y, width, height;

    public CharacterData(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
