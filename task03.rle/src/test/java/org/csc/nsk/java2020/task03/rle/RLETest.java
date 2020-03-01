package org.csc.nsk.java2020.task03.rle;

import org.junit.Assert;
import org.junit.Test;
import task2.rle.RLECompress;
import task2.rle.RLECompressorStream;
import task2.rle.RLEDecompress;
import task2.rle.RLEDecompressorStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RLETest {
    @Test
    public void testCompress() {
        String s0 = "ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО ПООООООВВВВВТТТТТОООРРООВВ";
        String c = "T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2";
        String res = RLECompress.compress(s0);
        Assert.assertEquals(res, c);
    }

    @Test
    public void testDecompress() {
        String s0 = "ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО ПООООООВВВВВТТТТТОООРРООВВ";
        String c = "T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2";
        String res = RLEDecompress.decompress(c);
        Assert.assertEquals(res, s0);
    }

    public byte[]load(String name){
        try(InputStream some = this.getClass().getResourceAsStream(name)){
            return some.readAllBytes();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testLoadFile()throws IOException{
    }

    @Test
    public void testCompressionWStreams() throws IOException {
        byte[] array = load("./some.txt");
        try (FileOutputStream fos = new FileOutputStream("./some.dat")) {
            RLECompressorStream rc = new RLECompressorStream(fos);
            for (byte a : array) {
                rc.consume(a);
            }
            rc.flush();
        }
    }
    @Test
    public void testDecompressionWStreams() throws IOException {
        byte[] array = load("./some.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (FileInputStream fis = new FileInputStream("./some.dat")) {
            RLEDecompressorStream rc = new RLEDecompressorStream(fis);
            while (true){
                int b = rc.read();
                if (b==-1) {
                    Assert.assertArrayEquals(baos.toByteArray(),array);
                } else baos.write(b);
            }
        }
    }
}
