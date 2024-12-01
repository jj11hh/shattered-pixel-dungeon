package com.badlogic.gdx.utils;

public class SharedLibraryLoader {
    static public boolean isWindows = System.getProperty("os.name").contains("Windows");
    static public boolean isLinux = System.getProperty("os.name").contains("Linux");
    static public boolean isMac = System.getProperty("os.name").contains("Mac");
    static public boolean isIos = false;
    static public boolean isAndroid = false;
    static public boolean isARM = System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64");
    static public boolean is64Bit = System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8");
}
