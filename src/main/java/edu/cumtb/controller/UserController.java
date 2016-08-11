package edu.cumtb.controller;

import edu.cumtb.model.User;
import edu.cumtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("register")
    public String register(User user){
        return null;
    }

    @RequestMapping("login")
    public String login(User user){
        user = userService.login(user);
        System.out.println(user);
        if (user!=null) {
            session.setAttribute("user", user);
            String role = user.getRole();
            if (role.equals("admin")) {
                return "redirect:/userView/admin.jsp";
            }
        }
        request.setAttribute("message","Invalid USERNAME/PASSWORD.");
        return "index";
    }

    @RequestMapping("logout")
    public String logout(){
        session.invalidate();
        return "index";
    }
}
