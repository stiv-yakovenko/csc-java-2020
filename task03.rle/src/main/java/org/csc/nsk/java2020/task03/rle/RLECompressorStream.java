package org.csc.nsk.java2020.task03.rle;

import java.io.IOException;
import java.io.OutputStream;

public class RLECompressorStream {
    private OutputStream os;

    public OutputStream getOs() {
        return os;
    }

    public RLECompressorStream(OutputStream oss) {
        os = oss;
    }

    public void flush() throws IOException {
        os.close();
    }

    public void consume(byte b) {
        throw new RuntimeException("not implemented yet");
    }
}
