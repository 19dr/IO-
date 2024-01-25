package org.redis.ObjIO.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dx
 * @version 1.0
 * @description
 * @data 2024/1/25
 */
@Data
@AllArgsConstructor
public class Cat implements Serializable {

    private  String name;
    private int age;
}
