package com.javafee.java.lessons.lesson25.mvc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {
    public List<String> read(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }
    public void save(String path,List<String> data)throws IOException{
        Files.write(Path.of(path),data);
    }
}
