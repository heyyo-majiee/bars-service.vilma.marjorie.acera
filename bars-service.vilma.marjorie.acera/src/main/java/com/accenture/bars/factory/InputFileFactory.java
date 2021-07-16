package com.accenture.bars.factory;

import com.accenture.bars.exception.BarsException;
import com.accenture.bars.file.AbstractInputFile;
import com.accenture.bars.file.CSVInputFileImpl;
import com.accenture.bars.file.TextInputFileImpl;

import java.io.File;

public class InputFileFactory {

    private static InputFileFactory factory;

    private InputFileFactory() {
    }

    public static InputFileFactory getInstance(){
        if (factory == null) {
            factory = new InputFileFactory();
        }
        return factory;
    }

    public AbstractInputFile getInputFile(File file) throws BarsException {
        if ("billing-cycle-not-on-range-csv.csv"){
            return new TextInputFileImpl();
        } else if ("billing-cycle-not-on-range-csv.csv") {
            return new CSVInputFileImpl();
        }
        else {
            throw ();
        }
    }

}
