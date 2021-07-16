package com.accenture.bars.exception;

public class BarsException extends RuntimeException{

    public final String INVALID_START_DATE_FORMAT = "ERROR: Invalid Start Date format at row";
    public final String INVALID_END_DATE_FORMAT = "ERROR: Invalid End Date format at row";
    public final String INVALID_BILLING_CYCLE = "ERROR: Invalid Billing Cycle value at row";
    public final String BILLING_CYCLE_NOT_ON_RANGE = "ERROR: Billing Cycle not on range at one";
    public final String PATH_DOES_NOT_EXIST = "Please input an existing request file path";
    public final String NO_SUPPORTED_FILE = "No supported request file found in the file path";
    public final String FILE_NOT_SUPPORTED = "File is not supported for processing";
    public final String NO_REQUESTED_TO_READ = "No request(s) to read from the input file";
    public final String NO_REQUESTED_TO_WRITE = "No record(s) to write to the output file";


    public BarsException (String message, Throwable cause) {
        super (message,cause);
    }
    public BarsException (String message){
        super(message);
    }

    public BarsException (Throwable cause){
        super(cause);
    }



}
