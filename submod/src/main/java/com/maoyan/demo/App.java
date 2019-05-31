package com.maoyan.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentManager manager = new StudentManagerImpl();
        System.out.println(manager.queryById(1));
        System.out.println( "Hello World!" );
    }
}