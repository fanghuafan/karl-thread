package sblucenedemo.karl.dao;

import org.apache.lucene.queryparser.classic.ParseException;
import sblucenedemo.karl.entity.PageQuery;
import sblucenedemo.karl.entity.Product;

import java.io.IOException;
import java.util.List;

public interface ILuceneDao {
    /**
     * 创建索引
     * @param productList
     * @throws IOException
     */
    public void createProductIndex(List<Product> productList) throws IOException;
    /**
     * 查询索引
     * @param pageQuery
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public PageQuery<Product> searchProduct(PageQuery<Product> pageQuery) throws IOException, ParseException, ParseException;
    /**
     * 添加一个新索引
     * @param product
     * @throws IOException
     */
    public void addProductIndex(Product product) throws IOException;
    /**
     * 通过id删除商品索引
     * @param id
     * @throws IOException
     */
    public void deleteProductIndexById(String id) throws IOException;


}