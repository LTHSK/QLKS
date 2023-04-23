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
    private Service service;
    private BookRoom bookRoom;
    private int quantity;

    public ServiceDetail() {
    }

    public ServiceDetail(Service service, BookRoom bookRoom, int quantity) {
        this.service = service;
        this.bookRoom = bookRoom;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "ServiceDetail{" + "service=" + service + ", bookRoom=" + bookRoom + ", quantity=" + quantity + '}';
    }
    
}
