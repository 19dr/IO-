package org.redis.CopyPng;

import java.io.*;
import java.util.Calendar;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class Test {


    @org.junit.jupiter.api.Test
    /**
     * 测试字节流复制图片
     */
    public void test1() throws IOException {
        FileInputStream inputStream = new FileInputStream("src/main/java/org/redis/Img/img.png");
        FileOutputStream OutputStream = new FileOutputStream("src/main/java/org/redis/Img/imgFileinputCopy.png");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            OutputStream.write(bytes, 0, len);
            //不加这个会损坏，因为字节输入流1024个字节没有全部用完就数据读取完成
        }

    }

    /**
     * 测试字符流复制图片
     */

    @org.junit.jupiter.api.Test
    public void test2() throws IOException {

        FileReader reader = new FileReader("src/main/java/org/redis/Img/img.png");

        FileWriter writer = new FileWriter("src/main/java/org/redis/Img/imgFileWriteCopy.png");


        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            writer.write(new String(chars, 0, len));

        }

        //因为图片是二进制文件，所以字符流处理会失败
    }


    @org.junit.jupiter.api.Test
    /**
     * 测试缓冲流复制文件
     */
    public void test3() throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/redis/Img/img.png"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/org/redis/Img/imgBufFileWriteCopy.png"));
        String str;


        char[] chars = new char[1021];
        int len;
        while ((len = reader.read(chars)) != -1){

            writer.write(chars,0,len);

        }

        //缓冲流底层是运用字符流，所图片也会复制失败
    }


}
