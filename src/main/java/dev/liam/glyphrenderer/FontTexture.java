package dev.liam.glyphrenderer;

import lombok.Getter;

import java.awt.image.BufferedImage;

@Getter
public class FontTexture {

    private final int textureID;

    public FontTexture(BufferedImage image) {
        textureID = RenderUtil.uploadTexture(image);
    }

}
