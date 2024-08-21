package com.example.patterns.service.Singleton;

public class Logger
{
     private static Logger instance;

     public Logger()
     {
         System.out.println("logger initiated");
     }

     public static Logger getLoggerInstance()
     {
        if(instance == null)
                instance = new Logger();
        return instance;
     }

     public void log(String message)
     {
         System.out.println(message);
     }
}
