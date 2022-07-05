package org.datastreams.thymeleafgtvg.business.mapper;

import org.apache.ibatis.annotations.*;
import org.datastreams.thymeleafgtvg.business.entities.Comment;

import java.util.List;

@Mapper
public interface CommentMapper {

  @Results(value = {
      @Result(property = "id", column = "id"),
      @Result(property = "commentText", column = "comment_text")
  })
  @Select("select id, comment_text from comment where product_id = #{productId}")
  public List<Comment> findByProductId(@Param("productId") Integer productId);
}
