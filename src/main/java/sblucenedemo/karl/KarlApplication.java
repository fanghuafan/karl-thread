package sblucenedemo.karl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class KarlApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(KarlApplication.class, args);
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        //连接池名称
        System.out.println("datasource is :" + dataSource);
    }

}
