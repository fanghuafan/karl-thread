package sblucenedemo.karl.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sblucenedemo.karl.service.search.ILuceneService;

import java.io.IOException;

@Component
@Order(value = 1)
public class LuceneInitHandle implements ApplicationRunner {
    @Autowired
    private ILuceneService service;

    @Override
    public void run(ApplicationArguments arg0) throws IOException {
        service.synProductCreatIndex();
    }
}
