package task2.rle;

import java.io.DataInputStream;
import java.io.InputStream;
interface ByteWriter {
    void write(byte b);
    void end();
}
public class RLECompressorStream {
    ByteWriter byteWriter;
    RLECompressorStream(ByteWriter b){
        byteWriter =b;
    }
    public void flush(){
        byteWriter.end();
    }
    public void consume(byte b){
        byteWriter.write((byte)22);
        byteWriter.write((byte)12);
        throw new RuntimeException("not implemented yet");
    }
}
