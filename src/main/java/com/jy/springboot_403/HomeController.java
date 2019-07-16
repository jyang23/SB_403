package com.jy.springboot_403;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    //when the user logins in with a user account, if the url is changed to /admin, they cannot view it because they only have user rights.
    //However, if the user logins with a admin account, they can view the admin page by typing in the /admin in the url.
    @RequestMapping("/admin")
    public String admin()
    {
        return "admin";
    }
}
