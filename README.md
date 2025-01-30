# GFR

A simple + efficent GlyphFontRenderer library.

## Dependencies

LWJGL is a **REQUIRED** dependency

You need jitpack to install it

```java
repositories {
    
    //your repositories

    mavenCentral()
    maven {
        url('https://repo.marcloud.net/')
        name('marCloud-Repository')
    }

    maven {
        url "https://jitpack.io"
    }
}

dependencies {

    //your dependencies    

    implementation "org.lwjgl:lwjgl:2.9.4-nightly"
    implementation "org.lwjgl:util:2.9.4-nightly"
}
```

## Adding GFR (GlyphFontRenderer)

Add as a dependency

```bash
implementation "com.github.BatSleep:GlyphFontRenderer:VERSION"
```
Replace verson with the current release tag (ex. 0.0.2)

## Usage

Once the library is in your project, you need to initialize the font.

```bash
final UnicodeGlyphFont font = new UnicodeGlyphFont(new Font("Arial", Font.PLAIN, 30));
```

Keep in mind when you instantiate the font, it saves itself as a cache, meaning this method should be called **ONCE**. Not in any sort of loop, or for an example, on game tick.

Drawing a string is just as easy.

```bash
font.drawString("luv from bat", 100, 100, -1);
```
