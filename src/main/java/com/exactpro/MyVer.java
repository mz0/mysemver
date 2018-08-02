package com.exactpro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class MyVer {
    public static void main(String[] args) {
        String verFile = "version.properties";
        Properties version = new Properties();
        try {
            FileInputStream f = new FileInputStream(verFile);
            version.load(f);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(String.format("Version file '%s' not found!",verFile));
        } catch (IOException e) {
            System.out.println(String.format("Error reading version file '%s': %s",verFile, e.getMessage()));
        }

        String ver=version.getProperty("version");
        System.out.println(String.format("Hello, this is build %s of MyVer project according to %s",ver,verFile));

        Manifest mf = new Manifest();
        try {
          mf.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/MANIFEST.MF"));
        } catch (IOException e) {
            System.out.println(String.format("Error reading MANIFEST: %s", e.getMessage()));
        }

        Attributes atts = mf.getMainAttributes();

        System.out.println("Build from Manifest: " + atts.getValue("Implementation-Build"));

    }
}
