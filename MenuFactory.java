package com.hexaware.MLP335.factory;

import com.hexaware.MLP335.persistence.MenuDAO;
import com.hexaware.MLP335.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);

  public static void insertMenu( String food_Id, String itemName, int foodprice) {
      dao().insert(food_Id,itemName,foodprice);
      System.out.println("Data inserted successfully.");
    }
  public static void updateMenu(String food_Id, String itemName, int foodprice) {
      dao().update(food_Id,itemName,foodprice);
      System.out.println("Data updated successfully.");
    }
  public static void deleteMenu(String food_Id) {
      dao().delete(food_Id);
      System.out.println("Data deleted successfully.");
    }
  
  }
}
