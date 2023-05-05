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

    public ServiceDetail(String ServiceDetailID, Service service, BookRoom bookRoom, int quantity) {
        this.ServiceDetailID = ServiceDetailID;
        this.service = service;
        this.bookRoom = bookRoom;
        this.quantity = quantity;
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

   
    @Override
    public String toString() {
        return "ServiceDetail{" + "ServiceDetailID=" + ServiceDetailID + ", service=" + service + ", bookRoom=" + bookRoom + ", quantity=" + quantity + '}';
    }
}
