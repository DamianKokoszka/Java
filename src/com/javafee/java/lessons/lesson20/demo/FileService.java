package com.javafee.java.lessons.lesson20.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    public static void main(String[] args) throws IOException {
        saveToFile(List.of(new Test("test 1", 1), new Test("test 2", 2), new Test("test 3", 3)));
        List<Test> testList = readFromFile();
        testList.forEach(System.out::println);
    }

    public static void saveToFile(List<Test> testList) throws IOException {
        Files.write(Paths.get("test.data"), testList.stream().map(Test::toString).toList());
    }

    public static List<Test> readFromFile() throws IOException {
        return Files.readAllLines(Paths.get("test.data")).stream().map(e -> {
            String[] tests = e.split(",");
            return new Test(tests[1], Integer.parseInt(tests[0]));
        }).toList();
    }
}
