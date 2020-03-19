package org.csc.nsk.java2020.task03.rle;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

public class RLETest {
    @Test
    public void usageTest(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(RLECompressorStream rcs = new RLECompressorStream(baos)) {
            rcs.consume((byte) 1);
            rcs.consume((byte) 1);
            rcs.consume((byte) 1);
            rcs.consume((byte) 1);
            rcs.consume((byte) 7);
            rcs.consume((byte) 7);
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] bytes = baos.toByteArray();
        Assert.assertEquals(bytes.length,4);
        Assert.assertEquals(bytes[0],1);
        Assert.assertEquals(bytes[1],4);
        Assert.assertEquals(bytes[2],7);
        Assert.assertEquals(bytes[3],2);
    }
}
