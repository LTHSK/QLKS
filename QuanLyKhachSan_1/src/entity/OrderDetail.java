/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author thule
 */
public class OrderDetail {
    private Order order;
    private List<ServiceDetail> seviceDetails;

    public OrderDetail() {
    }

    public OrderDetail(Order order, List<ServiceDetail> seviceDetails) {
        this.order = order;
        this.seviceDetails = seviceDetails;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<ServiceDetail> getSeviceDetails() {
        return seviceDetails;
    }

    public void setSeviceDetails(List<ServiceDetail> seviceDetails) {
        this.seviceDetails = seviceDetails;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "order=" + order + ", seviceDetails=" + seviceDetails + '}';
    }
    
}
