package com.GBSN.x00185119;

public final class ID {

    private static int counter;

    private ID(){
    }

    public static int newId(){
        counter+= 1;
        return counter;
    }

}
