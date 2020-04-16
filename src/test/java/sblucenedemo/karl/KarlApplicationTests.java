package sblucenedemo.karl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import sblucenedemo.karl.service.doorls.DroolsService;

import javax.annotation.Resource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Properties;

@SpringBootTest
//@PropertySource(value = {"classpath:baidu-api.properties"}, encoding = "utf-8")
class KarlApplicationTests {
    @Autowired
    private DroolsService droolsService;

    @Test
    public void test() {
        droolsService.fireRule();
    }

    @Test
    public void contextLoads() {

        Properties prop = new Properties();
        try {
            //读取属性文件a.properties
            InputStream in = new BufferedInputStream(new FileInputStream("D:\\code\\java\\release\\karl-thread\\src\\main\\resources\\baidu-api.properties"));
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            prop.load(in);     ///加载属性列表
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println(key + ":" + prop.getProperty(key));
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }

}
