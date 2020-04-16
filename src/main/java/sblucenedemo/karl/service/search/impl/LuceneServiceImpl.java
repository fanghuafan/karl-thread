package sblucenedemo.karl.service.search.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sblucenedemo.karl.dao.ILuceneDao;
import sblucenedemo.karl.entity.Product;
import sblucenedemo.karl.service.search.ILuceneService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LuceneServiceImpl implements ILuceneService {
    private Logger logger = LoggerFactory.getLogger(ILuceneService.class);

    @Autowired
    private ILuceneDao iLuceneDao;

    @Override
    public boolean synProductCreatIndex() throws IOException {
        logger.info("同步索引数据！");
        Product product = new Product();
        product.setId(19876566);
        product.setCategory("测试01");
        product.setCode("m09102938192yuyua839123");
        product.setName("GOODS ttt name1");
        product.setPlace("shenzhen work");
        product.setPrice(134342.3F);

        Product product01 = new Product();
        product01.setId(111);
        product01.setCategory("001测试01");
        product01.setCode("wertwer");
        product01.setName("GOODS 421342134 name1");
        product01.setPrice(23234.3F);
        product01.setPlace("shanghai");

        Product product02 = new Product();
        product02.setId(11331);
        product02.setCategory("测试01234");
        product02.setCode("wert234234234wer");
        product02.setName("GOODS 421323423442134 name1");
        product02.setPlace("shang234234hai");
        product02.setPrice(23223434.3F);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product01);
        productList.add(product02);
        iLuceneDao.createProductIndex(productList);
        return true;
    }
}
