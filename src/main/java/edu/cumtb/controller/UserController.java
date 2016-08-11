package edu.cumtb.controller;

import edu.cumtb.model.User;
import edu.cumtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String register(User user) {
        request.setAttribute("message", (userService.add(user) == 1) ? "Registered successfully ,please Login! " : "Failed to register!");
        return "index";
    }

    @RequestMapping("showPersonalView")
    public String showPersonalView() {
//        session.setAttribute("user", userService.searchById());
        return "";
    }

    @RequestMapping("showAdminView")
    public String showAdminView() {
        session.setAttribute("allUsers", userService.searchAll());
        return "redirect:/userView/admin.jsp";
    }

    @RequestMapping("searchById/{id}")
    public String searchById(@PathVariable("id") int id) {
        request.setAttribute("user",userService.searchById(id));
        return "/userView/edit";
    }

    @RequestMapping("edit")
    public String edit(User user) {
        userService.modify(user);
        return "redirect:/user/showAdminView";
    }

    @RequestMapping("remove/{id}")
    public String remove(@PathVariable("id") int id) {
        userService.remove(id);
        return "redirect:/user/showAdminView";
    }

    @RequestMapping("login")
    public String login(User user) {
        user = userService.login(user);
        if (user != null) {
            session.setAttribute("user", user);
            String role = user.getRole();
            if (role.equals("admin")) {
                return "redirect:/user/showAdminView";
            }
            if (role.equals("user")) {
                return "redirect:/userView/user.jsp";
            }
        }
        request.setAttribute("message", "Invalid USERNAME/PASSWORD.");
        return "index";
    }

    @RequestMapping("logout")
    public String logout() {
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
