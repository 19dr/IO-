package org.redis.ObjIO.objFile;

import org.redis.ObjIO.pojo.Cat;

import java.io.*;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
public class Test {


    /**
     * 对象流的对象必须实现Serializable接口
     * 将对象以字节的形式存储在文件中
     */

    @org.junit.jupiter.api.Test
    public  void  test1() throws IOException {/**/

        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/java/org/redis/ObjIO/txt/output.txt"));


        Cat cat = new Cat("张三",18);
                outputStream.writeObject(cat);



    }


    @org.junit.jupiter.api.Test
    public  void test2() throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/java/org/redis/ObjIO/txt/output.txt"));


        Object o = inputStream.readObject();
        System.out.println(o);
    }
}
