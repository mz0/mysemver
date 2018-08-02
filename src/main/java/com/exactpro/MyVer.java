package com.exactpro;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class MyVer {
    public static void main(String[] args) {
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
