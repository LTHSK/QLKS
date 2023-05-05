/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author thule
 */
public class ServiceDetail {
    private String ServiceDetailID;
    private Service service;
    private BookRoom bookRoom;
    private int quantity;
    private OrderDetail orderDetail; 

    public ServiceDetail(String ServiceDetailID, Service service, BookRoom bookRoom, int quantity, OrderDetail orderDetail) {
        this.ServiceDetailID = ServiceDetailID;
        this.service = service;
        this.bookRoom = bookRoom;
        this.quantity = quantity;
        this.orderDetail = orderDetail;
    }

    public ServiceDetail() {
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public BookRoom getBookRoom() {
        return bookRoom;
    }

    public void setBookRoom(BookRoom bookRoom) {
        this.bookRoom = bookRoom;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getServiceDetailID() {
        return ServiceDetailID;
    }

    public void setServiceDetailID(String ServiceDetailID) {
        this.ServiceDetailID = ServiceDetailID;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "ServiceDetail{" + "ServiceDetailID=" + ServiceDetailID + ", service=" + service + ", bookRoom=" + bookRoom + ", quantity=" + quantity + ", orderDetail=" + orderDetail + '}';
    }
}
