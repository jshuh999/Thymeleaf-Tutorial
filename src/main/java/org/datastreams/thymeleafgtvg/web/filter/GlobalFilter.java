package org.datastreams.thymeleafgtvg.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.datastreams.thymeleafgtvg.business.models.User;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class GlobalFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    Filter.super.init(filterConfig);
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    User loginUser = new User(1L,"jinseok","heo","korea",44);
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpServletResponse httpServletResponse= (HttpServletResponse) response;
    ((HttpServletRequest) request).getSession().setAttribute("user", loginUser);

    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    Filter.super.destroy();
  }
}
