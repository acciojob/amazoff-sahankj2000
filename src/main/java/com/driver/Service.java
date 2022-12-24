package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    void addOrder(Order order){
        repository.addOrder(order);
    }

    void addDeliveryPartner(String deliveryPartner){
        repository.addDeliveryPartner(deliveryPartner);
    }

    void addOrderPartnerPair(String orderId,String partnerId){
        repository.addOrderPartnerPair(orderId, partnerId);
    }

    Order getOrderById(String orderId){
        return repository.getOrderById(orderId);
    }

    DeliveryPartner getPartnerById(String partnerId){
        return repository.getPartnerById(partnerId);
    }

    int getOrderCountByPartnerId(String partnerId){
        return repository.getOrderCountByPartnerId(partnerId);
    }

    List<Order> getOrdersByPartnerId(String partnerId){
        return repository.getOrdersByPartnerId(partnerId);
    }

    List<Order> getAllOrders(){
        return repository.getAllOrders();
    }

    int getCountOfUnassignedOrders(){
        return repository.getCountOfUnassignedOrders();
    }

    int getOrdersLeftAfterGivenTimeByPartnerId(String deliveryTime,String partnerId){
        return repository.getOrdersLeftAfterGivenTimeByPartnerId(deliveryTime,partnerId);
    }

    String getLastDeliveryTimeByPartnerId(String partnerId){
        return repository.getLastDeliveryTimeByPartnerId(partnerId);
    }

    void deletePartnerById(String partnerId){
        repository.deletePartnerById(partnerId);
    }

    void deleteOrderById(String orderId){
        repository.deleteOrderById(orderId);
    }
}
