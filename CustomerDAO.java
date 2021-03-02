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

  @SqlUpdate("INSERT INTO Customer1 (cusid,cusname,cusaddress,cusphno,cusemail,cusdob) values (:cusid, :cusname, :cusaddress, :cusphno,:cusemail,:cusdob)")
  void insert(@Bind("cusid")int cusid, @Bind("cusname")String cusname, @Bind("cusaddress")String cusaddress, @Bind("cusemail") String cusemail,@bind("cusdob")String cusdob);

  @SqlUpdate("UPDATE Customer1 SET cusname = :cusname, cusaddress = :cusaddress,cusphno = :cusphno WHERE cusid = :cusid")
  void update(@Bind("cusid")int cusid, @Bind("cusname")String cusname, @Bind("cusaddress")float cusaddress, @Bind("cusphno") String cusphno);

  @SqlUpdate("DELETE FROM Customer1 WHERE cusid = :cusid")
  void delete(@Bind("cusid")int cusid);  
}