package org.csc.nsk.java2020.task03.rle;

import java.io.IOException;
import java.io.OutputStream;

public class RLECompressorStream implements AutoCloseable {
    private OutputStream os;

    public OutputStream getOs() {
        return os;
    }

    public RLECompressorStream(OutputStream oss) {
        os = oss;
    }


    public void consume(byte b) {
        throw new RuntimeException("not implemented yet");
    }

    @Override
    public void close() throws Exception {
        /// not really implemented yet
        os.close();
    }
}
