package org.datastreams.thymeleafgtvg.web.controller;

import org.datastreams.thymeleafgtvg.business.entities.Comment;
import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.entities.Product;
import org.datastreams.thymeleafgtvg.business.mapper.CommentMapper;
import org.datastreams.thymeleafgtvg.business.mapper.OrderMapper;
import org.datastreams.thymeleafgtvg.business.services.OrderService;
import org.datastreams.thymeleafgtvg.business.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MainApiController {

  @Autowired
  private ProductService productService;

  @Autowired
  private CommentMapper commentMapper;

  @Autowired
  private OrderService orderService;

  @Autowired
  private OrderMapper orderMapper;

  @GetMapping("product/list")
  public List<Product> productList() {
    List<Product> products = productService.findAll();

    return products;
  }

  @GetMapping("product/list/{productId}")
  public Product product(@PathVariable Integer productId) {
    Product product = productService.findById(productId);

    return product;
  }

  @GetMapping("comments/{productId}")
  public List<Comment> findByProductId(@PathVariable Integer productId) {
    List<Comment> comments = commentMapper.findByProductId(productId);
    return comments;
  };

  @GetMapping("order/list")
  public List<Order> orderList() {
    List<Order> orders = orderService.findAll();
    return orders;
  }

  @GetMapping("order/details")
  public Order orderLineList(@RequestParam("orderId") Integer orderId) {
    Order order= orderMapper.findById(orderId);
    return order;
  }
}