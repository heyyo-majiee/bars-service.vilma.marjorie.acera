package com.accenture.bars.controller;

import com.accenture.bars.domain.Record;
import com.accenture.bars.exception.BarsException;
import org.apache.catalina.connector.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController // or @Controller
public class BarsController {

    private static final Logger log = LoggerFactory.getLogger(BarsController.class);

    @Autowired private FileProcessor fileProcessor;
//    @->add annotation to be use as your endpoint
    @GetMapping("/bars")
    public List<Record> requestBilling(@RequestParam("filePath") String fileName) throws BarsException {

        File file = new File(" ");
        public List<Request> executive(File file);


        requests = fileProcessor.execute(file);

        return requests;

    }

}
