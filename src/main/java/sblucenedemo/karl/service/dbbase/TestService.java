package sblucenedemo.karl.service.dbbase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sblucenedemo.karl.dao.TestDao;

@Service
public class TestService {
    @Autowired
    private TestDao dao;

    public int testSelect() {
        return dao.testSelect();
    }
}