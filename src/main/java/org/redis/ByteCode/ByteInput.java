package org.redis.ByteCode;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class ByteInput {




    @Test
    /**
     * 字节输入流(读取中文就会有乱码)，从文件中获取数据
     * 单个读取数据
     */
    public void readSingle() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/org/redis/text/a.txt");
        int read;

        long l = System.currentTimeMillis();

        while ((read =fileInputStream.read())!=-1){

            System.out.print((char)read);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("-------------"+(l1-l));
    }

    /**
     * 读取多个
     */
    @Test
    public void  test2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/org/redis/text/a.txt");
       byte[] bytes = new byte[1024];
        int read ;

        /*while ((read=fileInputStream.read(bytes))!=-1){
                //这种情况会造成数据误差
            System.out.println(new String(bytes));
        }*/
        while ((read=fileInputStream.read(bytes))!=-1){
        //这样就不会造成误差
            System.out.println(new String(bytes,0,read));
        }

    }

}
