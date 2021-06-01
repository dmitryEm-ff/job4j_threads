package ru.job4j.concurrent.io;

import java.io.*;
public class ParseFileModel {
    private final File file;

    public ParseFileModel(File file) {
        this.file = file;
    }

//    public File getFile() {
//        return file;
//    }

    public static void main(String[] args) {
        ParseFileModel pfm = new ParseFileModel(new File("test.txt"));
        try {
            System.out.println(new ParseFileActions().content((x -> x < 0x80), pfm.file));
            System.out.println(new ParseFileActions().content((x -> true), pfm.file));
            ParseFileActions pfa = new ParseFileActions();
            pfa.saveContent("Reverse this!!!", pfm.file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}