package com.hexaware.MLP335.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 */
  private int foodId;
  private String itemName;
  private float foodPrice;

  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final String argFoodId,final String argName,final float argPrice) {

    this.foodId = argFoodId;
    this.itemName=name;
    this.foodPrice=price;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId);
  }
    /**
     * @return this food ID.
     */
  public final String getFoodId() {
    return foodId;
  }
  public final String getItemName() {
    return itemName;
  }
  public final float getFoodPrice() {
    return foodPrice;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final String argFoodId) {
    this.foodId = argFoodId;
  }
  public final void setItemName(final String argName) {
    this.itemName = argName;
  }
  public final void setFoddPrice(final float argPrice) {
    this.foodPrice = argPrice;
  }
}
