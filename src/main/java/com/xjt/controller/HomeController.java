package com.xjt.controller;

import com.xjt.aop.Teacher;
import com.xjt.model.User;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;


@Controller
public class HomeController {


    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student");
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudent(@ModelAttribute("student") Teacher student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        return "result";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        User user = new User();
        user.setId(1);
        user.setUserName("tom");
        user.setPassWord("123456");
        user.setUrl("/");
        user.setCreateTime(new Date());
        modelMap.addAttribute(user);

        return "user";
    }


    @RequestMapping(value = "/forward",method = RequestMethod.GET)
    public String forward(){
        return "forward:/user";
    }

    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:/jsp/hello.jsp";
    }


    @RequestMapping("/request")
    public void request(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("message", "hahahh");
        request.getRequestDispatcher("/jsp/hello.jsp").forward(request, response);
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public void upload(MultipartFile file) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());

        //拷贝文件
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\code\\demoSSM\\src\\main\\webapp\\file\\"+file.getOriginalFilename());
        IOUtils.copy(file.getInputStream(), fileOutputStream);

        //关闭输出流
        IOUtils.closeQuietly(fileOutputStream);
    }

    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public void upload(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println(request.getSession().getServletContext().getRealPath("/"));

        System.out.println("-----------下载------------");
        //防止中文乱码
        String name = URLEncoder.encode("数据趋势对比copy.xls","utf-8");
        //设值下载的响应头
        response.setHeader("Content-Disposition","attachment;filename=" +name+ "");
        //读取文件
        FileInputStream fileInputStream = new FileInputStream("D:\\code\\demoSSM\\src\\main\\webapp\\file\\数据趋势对比.xls");
        IOUtils.copy(fileInputStream, response.getOutputStream());

        IOUtils.closeQuietly(fileInputStream);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpSession session,Teacher user){
        if("admin".equals(user.getName()) && 10 == user.getAge()){
            session.setAttribute("user", user);
            return "redirect:/jsp/hello.jsp";
        }else{
            session.setAttribute("message","账号密码错误");
            return "redirect:/jsp/login.jsp";
        }
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String login(HttpSession session){
      if (session.getAttribute("user") != null){
          session.invalidate();
      }
        return "redirect:/jsp/login.jsp";
    }

}
