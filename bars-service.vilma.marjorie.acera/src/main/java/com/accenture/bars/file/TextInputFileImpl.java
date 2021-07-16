package com.accenture.bars.file;

import com.accenture.bars.exception.BarsException;
import org.apache.catalina.connector.Request;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class TextInputFileImpl extends AbstractInputFile {

    private static final Logger log = null;

    public TextInputFileImpl() {
    }

    @Override
    public List<Request> readFile() throws IOException, BarsException {
        String[] data = null;
        List<Request> requests  = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");

        FileReader fileReader = new FileReader( "/Users/vilma.marjorie.acera/Desktop/BARS Service Materials v3.0/BARS_TEST/billing-cycle-not-on-range-txt.txt");
        BufferedReader br = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        br.readLine();

        int billingCycle = 0;
        String startDate = null;
        String endDate = null;

        try {
            while ( scanner.hasNextLine()) {
                String scan = scanner.nextLine();
                requests = scan.split(",");
                try {
                    if (billingCycle <= 12){
                        billingCycle = Integer.parseInt(data[0]);
                        requests.add(new Request(billingCycle, (String) null, (String) null));
                    } else {
                        throw new BarsException(BarsException.BILLING_CYCLE_NOT_ON_RANGE + row);
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

    private class BarsException extends Exception {
    }
}


}
