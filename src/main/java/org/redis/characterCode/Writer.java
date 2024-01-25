package org.redis.characterCode;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dx
 * @version 1.0
 * @description \
 * @data 2024/1/25
 */
public class Writer {

    @Test
    public void test1() throws IOException, InterruptedException {
        FileWriter fileWriter = new FileWriter("src/main/java/org/redis/characterText/writer.txt",true);

        FileReader fileReader = new FileReader("src/main/java/org/redis/characterText/reader.txt");


        char[] bytes = new char[10];

        int len;
        while ((len = fileReader.read(bytes)) != -1) {


            fileWriter.write(new String(bytes,0,len));

        }

        fileWriter.close();
        fileReader.close();


    }


}
