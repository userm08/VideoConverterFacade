import subsystem.VideoFile;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        VideoConversionFacade converter = new VideoConversionFacade();


        File mp4Video = converter.convertVideo("funny-cat-video.ogg", "mp4");

        System.out.println("Main: conversion is finished! Output file: " + mp4Video.getName());
    }
}