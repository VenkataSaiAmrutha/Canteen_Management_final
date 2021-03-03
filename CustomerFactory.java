package com.hexaware.MLP335.factory;

import com.hexaware.example.persistence.CustomerDAO;
import com.hexaware.example.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Customer;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  
  public static Customer[] showCustomers() {
    List<Customer> Customers = dao().show();
    return Customers.toArray(new Customer[Customers.size()]);
  }

  public static void insertCustomer(String CUS_ID, String CUS_NAME, String CUS_ADD, int CUS_PHN, String CUS_EMAIL) {
    dao().insert(CUS_ID,CUS_NAME,CUS_ADD,CUS_PHN,CUS_EMAIL);
    System.out.println("Record inserted successfully.");
  }

  public static void updateCustomer(String CUS_ID, String CUS_NAME, String CUS_ADD, int CUS_PHN) {
    dao().update(CUS_ID,CUS_NAME,CUS_ADD,CUS_PHN);
    System.out.println("Record updated successfully.");
  }

    public static void deleteCustomer(String CUS_ID) {
    dao().delete(CUS_ID);
    System.out.println("Record deleted successfully.");
  }
}