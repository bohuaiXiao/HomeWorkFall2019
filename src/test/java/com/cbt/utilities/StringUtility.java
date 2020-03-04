package com.cbt.utilities;

/**
 * @author:
 * @create:
 * @date:
 */
public class StringUtility {

    //Create a public static method verifyEquals which
    // takes two string arguments,expected and actual.
    public static void verifyEquals(String expect,String actual){
        if (expect.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FALL");
        }
    }

}
