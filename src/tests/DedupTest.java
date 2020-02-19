package tests;

import task4.deduplicator.Deduplicator;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class DedupTest {
    public static void main(String[] args) throws URISyntaxException {
        URL resource = DedupTest.class.getResource("./");
        Paths.get(resource.toURI()).toFile();
        String folder="/home/stiv/csc-java-2020/src/tests/dupfolder1";
        Set<Set<Path>> dupes = Deduplicator.findDupes(Path.of(folder));
        System.out.println(dupes);
    }
}
