package org.csc.nsk.java2020.task03.rle;


import java.io.InputStream;

public class RLEDecompressorStream {
    private InputStream byteReader;

    public InputStream getByteReader() {
        return byteReader;
    }

    public RLEDecompressorStream(InputStream b) {
        byteReader = b;
    }

    public int read() { // should return -1 on EOF
        throw new RuntimeException("not implemented yet");
    }
}
