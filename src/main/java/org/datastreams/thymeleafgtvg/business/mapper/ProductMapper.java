package org.datastreams.thymeleafgtvg.business.mapper;

import org.apache.ibatis.annotations.*;
import org.datastreams.thymeleafgtvg.business.entities.Product;
import org.datastreams.thymeleafgtvg.business.entities.Comment;

import java.util.List;

@Mapper
public interface ProductMapper {

  @Select("select id, name, price, in_stock from product")
  @Results(id = "productResultMap", value={
      @Result(property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "price", column = "price"),
      @Result(property = "inStock", column = "in_stock"),
      @Result(property = "comments", column = "id", many=@Many(select = "org.datastreams.thymeleafgtvg.business.mapper.CommentMapper.findByProductId"))})
  public List<Product> findAll();

  @Select("select id, name, price, in_stock from product where id = #{id}")
  @ResultMap("productResultMap")
  public Product findById(@Param("id") Integer id);

}
