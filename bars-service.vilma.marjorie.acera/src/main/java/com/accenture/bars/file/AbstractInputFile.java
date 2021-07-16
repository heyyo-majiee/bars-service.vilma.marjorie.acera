package com.accenture.bars.file;

import org.apache.catalina.connector.Request;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class AbstractInputFile {

    public static final int MIN_BILLING_CYCLE = 1;
    public static  int MAX_BILLING_CYCLE = 12;
    private File file;

    public AbstractInputFile(/*File file*/) {
//        this.file = file;
    }

    public  List<Request> readFile() throws IOException {
        return (List<Request>) file;
    }

    public File getFile(){

    }

    public void setFile(File file){
        this.file = file;
    }
}
