package com.hexaware.MLP335.persistence;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.example.model.Customer;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Customer")
    @Mapper(CustomerMapper.class)
    List<Customer> show();

  @SqlUpdate("INSERT INTO Customer (CUS_ID,CUS_NAME,CUS_ADD,CUS_PHN,CUS_EMAIL) values (:CUS_ID, :CUS_NAME, :CUS_ADD, :CUS_PHN,:CUS_EMAIL)")
  void insert(@Bind("CUS_ID")String CUS_ID, @Bind("CUS_NAME")String CUS_NAME, @Bind("CUS_ADD")String CUS_ADD, @Bind("CUS_EMAIL") String CUS_EMAIL;

  @SqlUpdate("UPDATE Customer SET CUS_NAME = :CUS_NAME, CUS_ADD = :CUS_ADD,CUS_PHN = :CUS_PHN WHERE CUS_ID = :CUS_ID")
  void update(@Bind("CUS_ID")String CUS_ID, @Bind("CUS_NAME")String CUS_NAME, @Bind("CUS_ADD")String CUS_ADD, @Bind("CUS_PHN")Int CUS_PHN);

  @SqlUpdate("DELETE FROM Customer WHERE CUS_ID = :CUS_ID")
  void delete(@Bind("CUS_ID")String CUS_ID);  
}