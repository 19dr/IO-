package org.redis.characterCode;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class Reader {


    @Test
    public void  test1() throws IOException {
        FileReader fileReader = new FileReader("src/main/java/org/redis/characterText/reader.txt");

        char [] chars = new char[1024];
        int read ;
       /* while ((read=fileReader.read(chars))!=-1){
        //这样结果·会出现错误
            System.out.println(new String(chars));
        }*/
        while ((read=fileReader.read(chars))!=-1){

            System.out.println(new String(chars,0,read));
        }


    }




}
