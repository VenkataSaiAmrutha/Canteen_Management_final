package com.hexaware.MLP335.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP335.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();
    @sqlUpdate("INSERT INTO menu(food_id,item_name,food_price) VALUES (:food_id, :item_name, :food_price")
    void insert(@Bind("food_id")String food_id, @Bind("item_name")String item_name, @Bind(food_price)float food_price);
    @sqlUpdate("UPDATE menu SET  item_price= :item_price, food_price= :food_price WHERE food_id= :food_id")
    void update(@Bind("food_id")String food_id, @Bind("item_name")String item_name, @Bind(food_price)float food_price);
    @sqlUpdate("DELETE FROM menu WHERE food_id= :food_id")
    void delete(@Bind("food_id")String food_id);
}
