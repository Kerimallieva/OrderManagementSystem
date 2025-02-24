package com.example.onlineordermanagementsystem;

import com.example.onlineordermanagementsystem.config.AppConfig;
import com.example.onlineordermanagementsystem.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OnlineOrderManagementSystemApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService service = context.getBean("orderService", OrderService.class);

        // Создаём заказ (запустится @Around)
        service.placeOrder(1, "Ноутбук", 1200.00);
        try {
            service.getOrderById(2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
