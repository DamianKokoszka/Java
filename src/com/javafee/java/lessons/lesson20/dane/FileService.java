package com.javafee.java.lessons.lesson20.dane;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {
    public static void main(String[] args) throws IOException {
        saveToFilee(List.of(new UDanych("Dawid", 1), new UDanych("Tomek", 2), new UDanych("Olek", 3)));
        saveToFile(List.of(new ADanych("Dawid", 1, "Warsaw"), new ADanych("Tomek", 2, "Warsaw"), new ADanych("Olek", 3, "Warsaw")));
        saveToFileee(List.of(new UsDanych("Dawid", 1, "Warsaw", 20)));
        List<UDanych> UDList = readFromFile();
        UDList.forEach(System.out::println);
        List<ADanych> ADList = readFromFilee();
        ADList.forEach(System.out::println);

    }

    public static void saveToFilee(List<UDanych> UDanychList) throws IOException {
        Files.write(Paths.get("utwodanych.data"), UDanychList.stream().map(UDanych::toString).toList());
    }

    public static void saveToFile(List<ADanych> ADanychList) throws IOException {
        Files.write(Paths.get("utwodanych.data"), ADanychList.stream().map(ADanych::toString).toList());
    }

    public static void saveToFileee(List<UsDanych> UsDanychList) throws IOException {
        Files.write(Paths.get("ustwodanych.data"), UsDanychList.stream().map(UsDanych::toString).toList());
    }

    public static List<UDanych> readFromFile() throws IOException {
        return Files.readAllLines(Paths.get("utwodanych.data")).stream().map(e -> {
            String[] udanychs = e.split(",");
            return new UDanych(udanychs[0], Integer.parseInt(udanychs[1]));
        }).toList();

    }

    public static List<ADanych> readFromFilee() throws IOException {
        return Files.readAllLines(Paths.get("utwodanych.data")).stream().map(e -> {
            String[] adanychs = e.split(",");
            return new ADanych(adanychs[0], Integer.parseInt(adanychs[1]), adanychs[2]);
        }).toList();
    }

}