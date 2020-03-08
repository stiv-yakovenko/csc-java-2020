package org.csc.nsk.java2020.task04.deduplicator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Deduplicator {
    // naive deadly slow implementation, you have to implement it efficiently
    public static Set<Set<Path>> findDupes(Path folder) {
        Set<Set<Path>> dupes = new HashSet<>();
        Set<Path> paths = new HashSet<>();
        try {
            Files.walk(folder)
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        paths.add(path);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Path p1 : paths) {
            for (Path p2 : paths) {
                if (p2.equals(p1)) {
                    continue;
                }
                byte[] b1, b2;
                try {
                    b1 = Files.readAllBytes(p1);
                    b2 = Files.readAllBytes(p2);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }
                if (Arrays.equals(b1, b2)) {
                    boolean[] added = {false};
                    dupes.forEach(strings -> {
                        boolean[] contains = {false};
                        strings.forEach(str -> {
                            if (str.equals(p1) || str.equals(p2)) {
                                contains[0] = true;
                            }
                        });
                        if (contains[0]) {
                            strings.add(p1);
                            strings.add(p2);
                            added[0] = true;
                        }
                    });
                    if (!added[0]) {
                        HashSet<Path> p = new HashSet<Path>();
                        p.add(p1);
                        p.add(p2);
                        dupes.add(p);
                    }
                }
            }
        }
        return dupes;
    }
}
