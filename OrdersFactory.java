package com.hexaware.MLP335.factory;

import com.hexaware.example.persistence.CustomerDAO;
import com.hexaware.example.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Customer;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class OrdersFactory {
  /**
   *  Protected constructor.
   */
  protected OrdersFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static OrdersDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrdersDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Orders[] showOrders() {
    List<Orders> Orders = dao().show();
    return Orders.toArray(new Orders[Orders.size()]);
  }

  public static void insertOrders(String ORD_ID, Int ORD_DATE,String FOOD_ID, String CUS_ID) {
    dao().insert(ORD_ID,ORD_DATE,FOOD_ID,CUS_ID);
    System.out.println("Record inserted successfully.");
  }

  public static void updateOrders(String ORD_ID, Int ORD_DATE, String FOOD_ID, String CUS_ID) {
    dao().update(ORD_ID,ORD_DATE,FOOD_ID,CUS_ID);
    System.out.println("Record updated successfully.");
  }

    public static void deleteOrders(String ORD_ID) {
    dao().delete(ORD_ID);
    System.out.println("Record deleted successfully.");
  }
}