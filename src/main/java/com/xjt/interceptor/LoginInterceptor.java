package com.xjt.interceptor;

import com.xjt.aop.Teacher;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/24 13:49
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        // 获取Session
        HttpSession session = request.getSession();
        Teacher user = (Teacher) session.getAttribute("user");
        // 判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if (user != null) {
            return true;
        }
        // 不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("message", "您还没有登录，请先登录！");
        request.getRequestDispatcher("/jsp/login.jsp")
                .forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行controller方法之后");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("渲染视图之后");
    }
}
