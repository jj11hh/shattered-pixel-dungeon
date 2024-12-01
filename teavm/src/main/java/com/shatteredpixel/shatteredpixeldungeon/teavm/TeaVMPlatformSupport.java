package com.shatteredpixel.shatteredpixeldungeon.teavm;
import com.watabou.utils.PlatformSupport;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class TeaVMPlatformSupport extends PlatformSupport {
    @Override
    public void updateDisplaySize() {

    }

    @Override
    public void updateSystemUI() {

    }

    @Override
    public boolean connectedToUnmeteredNetwork() {
        return false;
    }

    @Override
    public boolean supportsVibration() {
        return false;
    }

    @Override
    public void setupFontGenerators(int pageSize, boolean systemFont) {

    }

    @Override
    protected FreeTypeFontGenerator getGeneratorForString(String input) {
        return null;
    }

    @Override
    public String[] splitforTextBlock(String text, boolean multiline) {
        return new String[0];
    }
}
