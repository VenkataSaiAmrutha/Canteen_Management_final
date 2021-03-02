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

  public static void insertCustomer(int cusid, String cusname, String cusaddress, int cusphno, String cusemail, int cusdob) {
    dao().insert(cusid,cusname,cusaddress,cusphno,cusemail,cusdob);
    System.out.println("Record inserted successfully.");
  }

  public static void updateCustomer(int cusid, String cusname, String cusaddress, int phno) {
    dao().update(cusid,cusname,cusaddress,country);
    System.out.println("Record updated successfully.");
  }

    public static void deleteCustomer(int cusid) {
    dao().delete(cusid);
    System.out.println("Record deleted successfully.");
  }
}