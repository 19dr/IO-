package org.redis.ByteCode;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class ByteOut {


    @Test
    /**
     * 字节输入流，写入数据到文件
     */
    public  void test1() throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/redis/text/output");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/redis/text/output",true);//开启追加
        //一次写入多个数据
        byte[] bytes = "\ntasdasdasdasd".getBytes();
        fileOutputStream.write(bytes);




    }
}
