package org.datastreams.thymeleafgtvg.business.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.datastreams.thymeleafgtvg.business.entities.User;

@Mapper
public interface UserMapper {

  @Select("select firstname, lastname, nationality, age from user where id = #{id}")
  public User findById(final Integer id);
}
