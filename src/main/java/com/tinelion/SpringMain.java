package com.tinelion;

import com.tinelion.service.AnnotationService;
import com.tinelion.service.XmlContextService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        // 用我们的配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        // 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
        XmlContextService messageService = context.getBean(XmlContextService.class);
        // 这句将输出: hello world
        System.out.println(messageService.sayHello());

        AnnotationService annotationService=(AnnotationService)context.getBean("annotationService");
        System.out.println(annotationService.sayAnnotation());

        AnnotationService annotationServices=context.getBean(AnnotationService.class);
        System.out.println(annotationServices.sayAnnotation());
    }
}
