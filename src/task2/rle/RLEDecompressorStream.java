package task2.rle;

interface ByteReader {
    int read(byte b); // returns -1 on EOF
}

public class RLEDecompressorStream {
    ByteReader byteReader;
    RLEDecompressorStream(ByteReader b){
        byteReader =b;
    }
    public int read(){ // should return -1 on EOF
        throw new RuntimeException("not implemented yet");
    }
}
