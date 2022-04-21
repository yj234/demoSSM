package com.xjt.action;

import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAction {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/sel",method = {RequestMethod.GET})
    public ModelAndView findById(@RequestParam("id") int id){
        ModelAndView mv = new ModelAndView();
        User user = userService.findByid(id);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
}
