package com.example.demo;

import com.example.demo.web.set.FooProperties;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;

@EnableSwagger2Doc
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var context= SpringApplication.run(DemoApplication.class, args);
        Binder binder = Binder.get(context.getEnvironment());
        // 绑定简单配置
        FooProperties foo = binder.bind("com.didispace", Bindable.of(FooProperties.class)).get();
        System.out.println(foo.getFoo());
    }

}
