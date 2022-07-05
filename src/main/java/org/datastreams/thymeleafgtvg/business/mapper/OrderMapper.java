package org.datastreams.thymeleafgtvg.business.mapper;

import org.apache.ibatis.annotations.*;
import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.entities.OrderLine;

import java.util.List;

@Mapper
public interface OrderMapper {

  @Select("select id, order_date, customer_id from orders")
  @Results(id="orderResultMap", value={
      @Result(property = "id", column = "id"),
      @Result(property = "orderDate", column = "order_date"),
      @Result(property = "customer", column = "customer_id", one = @One(select = "org.datastreams.thymeleafgtvg.business.mapper.CustomerMapper.findById")),
      @Result(property = "orderLines", column = "id", many = @Many(select = "findByOrderId"))
  })
  public List<Order> findAll();

  @Select("select id, order_date, customer_id from orders where id = #{id}")
  @ResultMap("orderResultMap")
  public Order findById(@Param("id") final Integer id);

  @Select("select id, order_date, customer_id from orders where customer_id = #{customer_id}")
  @ResultMap("orderResultMap")
  public List<Order> findByCustomerId(final Integer customerId);


  @Select("select order_id, product_id, amount, purchase_price from orderline where order_id = #{order_id}")
  @Results(value = {
      @Result(property = "amount", column = "amount"),
      @Result(property = "purchasePrice", column = "purchase_price"),
      @Result(property = "product", column = "product_id", one = @One(select = "org.datastreams.thymeleafgtvg.business.mapper.ProductMapper.findById"))
  })
  public List<OrderLine> findByOrderId(final Integer orderId);
}
