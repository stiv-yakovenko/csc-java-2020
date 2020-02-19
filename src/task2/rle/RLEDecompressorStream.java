package task2.rle;


import java.io.InputStream;

public class RLEDecompressorStream {
    InputStream byteReader;
    public RLEDecompressorStream(InputStream b){
        byteReader =b;
    }
    public int read(){ // should return -1 on EOF
        throw new RuntimeException("not implemented yet");
    }
}
