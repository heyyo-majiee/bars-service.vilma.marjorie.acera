package com.accenture.bars.file;

import org.apache.catalina.connector.Request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class
CSVInputFileImpl extends AbstractInputFile{


    private String row;

    public List<Request> readFile(File file) throws IOException, BarsException{
        String[] data = null;
        String ab = null;
        List<Request> requests  = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");

        FileReader fileReader = new FileReader( "/Users/vilma.marjorie.acera/Desktop/BARS Service Materials v3.0/BARS_TEST/billing-cycle-not-on-range-csv.csv");
        BufferedReader br = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        br.readLine();
        
        int billingCycle = 0;
        String startDate = null;
        String endDate = null;

        try {
            while ( scanner.hasNextLine()) {
                ab = scanner.nextLine();
                data = ab.split(",");
                try {
                    if (billingCycle <= 12){
                        billingCycle = Integer.parseInt(data[0]);
                        boolean add = requests.add(new Request(billingCycle, (String) null, (String) null));
                    } else {
                        throw new BarsException(INVALID_BILLING_CYCLE);
                    }
                    } catch (){
                }
            }
            }catch(IOException e){
            e.printStackTrace();
        }
            return requests;
    }

    private String data(int i) {
    }


    private static final Logger log = null;

    public CSVInputFileImpl(/*Logger log*/) {
//        this.log = log;
    }

    private class BarsException extends Exception {
    }
}


