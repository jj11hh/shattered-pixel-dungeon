package com.shatteredpixel.shatteredpixeldungeon.teavm;
import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration;
import com.github.xpenatan.gdx.backends.teavm.TeaApplication;
import com.shatteredpixel.shatteredpixeldungeon.ShatteredPixelDungeon;

public class TeaVMLauncher {

    public static void main(String[] args) {
        TeaApplicationConfiguration config = new TeaApplicationConfiguration("canvas");
        config.width = 0;
        config.height = 0;
        config.showDownloadLogs = false;
        config.useGL30 = true;
        new TeaApplication(new ShatteredPixelDungeon(new TeaVMPlatformSupport()), config);
    }
}