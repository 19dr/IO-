package org.redis.BuffCode;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class BufRead {


    @Test
    /**
     * 缓冲流是字符流,处理二进制文件可能造成损失
     */
    public void  test1() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/redis/characterText/reader.txt"));



        String str;
        while ( ( str =  reader.readLine())!=null){

            System.out.println(str);

        }







    }
}
