package com.accenture.bars.controller;

import com.accenture.bars.domain.Record;
import com.accenture.bars.entity.Billing;
import com.accenture.bars.factory.InputFileFactory;
import com.accenture.bars.repository.BillingRepository;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileProcessor {

    private BillingRepository billingRepository;

    public FileProcessor(/*BillingRepository billingRepository*/) {
//        this.billingRepository = billingRepository;
    }

    public List<Request> execute (File file) {

        InputFileFactory factory = InputFileFactory.getInstance();

        List<Request> requests = abstractInputFile.readFile();

        return requests;
    }

    public List<Record> retrieveRecordfromDB(List<Request> requests){

        List<Record> records = new ArrayList<>();
        for (Request request : requests) {
            Billing billing = billingRepository.findByBillingCycleAndStartDateAndEndDate(request.getBillingCycle(), request.getStartDate(), request.getEndDate());
            if (billing != null) {

            }
        }
    }
}
