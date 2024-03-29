package net.forgecraft.services.ember.app.mods.downloader;

import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

/**
 * A downloader for CurseForge
 * <p>
 * Expected inputs:
 * - https://www.curseforge.com/minecraft/mc-mods/simply-graves/files/5126737 // We need to look this up with the api
 * - https://mediafilez.forgecdn.net/files/5126/737/simplygraves-1.19.2-1.1.0-build.19.jar // We can use this directly
 * - curseforge:simply-graves:1.19.2 // Maybe? We need to look this up with the api
 */
public class CurseForgeDownloader implements Downloader {
    @Override
    public boolean isAcceptable(String inputData) {
        return inputData.startsWith("https://curseforge.com") || inputData.startsWith("https://www.curseforge.com") || inputData.startsWith("curseforge:");
    }

    @Override
    public @Nullable Path download(String inputData) {
        System.out.println("CurseForgeDownloader: " + inputData);
        return null;
    }

    /**
     * Attempts to parse out the correct download link from a given curseforge link
     *
     * @param inputData The input data
     * @return The download link
     */
    @Nullable
    private String lookup(String inputData) {
        return null;
    }
}
