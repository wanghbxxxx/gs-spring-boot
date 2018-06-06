package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import hello.filter.WebSiteMeshFilter;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public FilterRegistrationBean<WebSiteMeshFilter> siteMeshFilter() {
//        FilterRegistrationBean<WebSiteMeshFilter> filter = new FilterRegistrationBean<>();
//        filter.setFilter(new WebSiteMeshFilter());
//        return filter;
//    }

}
