package org.datastreams.thymeleafgtvg.web.controller;

import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.entities.Product;
import org.datastreams.thymeleafgtvg.business.entities.User;
import org.datastreams.thymeleafgtvg.business.services.OrderService;
import org.datastreams.thymeleafgtvg.business.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

  @Autowired
  private OrderService orderService;

  @Autowired
  private ProductService productService;

  @GetMapping("/")
  public String home(HttpServletRequest request, Model model) {
    HttpSession session = request.getSession();
    User loginUser = new User("jinseok","heo","korea",44);
    session.setAttribute("user", loginUser);
    model.addAttribute("today", Calendar.getInstance());
    return "home";
  }


  @GetMapping("order/details")
  public String orderDetails(@RequestParam("orderId") Integer orderId, Model model) {
    Order order = orderService.findById(orderId);
    model.addAttribute("order", order);
    return "order/details";
  }

  @GetMapping("order/list")
  public String orderList(Model model) {
    List<Order> orders = orderService.findAll();
    model.addAttribute("orders", orders);
    return "order/list";
  }

  @GetMapping("product/list")
  public String productList(Model model) {
    List<Product> products = productService.findAll();
    model.addAttribute("prods", products);
    return "product/list";
  }

  @GetMapping("/subscribe")
  public String subscribe() {
    return "subscribe";
  }

  @GetMapping("/userprofile")
  public String  userprofile(HttpServletRequest request) {
    User user = (User) request.getSession().getAttribute("user");
    System.out.println(user.getFirstName());
    return "userprofile";
  }

  @GetMapping("/product/comments")
  public String  productComments(@RequestParam("prodId") Integer prodId, Model model) {
    Product product = productService.findById(prodId);

    model.addAttribute("prod", product);
    return "product/comments";
  }
}
