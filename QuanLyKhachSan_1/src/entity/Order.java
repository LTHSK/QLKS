/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author thule
 */
public class Order {
    private String orderID;
    private String checkOutDate;
    private String checkOutTime;
    private List<BookRoom> bookRooms;
    private Employee employee;

    public Order() {
    }

    public Order(String orderID, String checkOutDate, String checkOutTime, List<BookRoom> bookRooms, Employee employee) {
        this.orderID = orderID;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.bookRooms = bookRooms;
        this.employee = employee;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public List<BookRoom> getBookRooms() {
        return bookRooms;
    }

    public void setBookRooms(List<BookRoom> bookRooms) {
        this.bookRooms = bookRooms;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", checkOutDate=" + checkOutDate + ", checkOutTime=" + checkOutTime + ", bookRooms=" + bookRooms + ", employee=" + employee + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.orderID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return Objects.equals(this.orderID, other.orderID);
    }
    
}
