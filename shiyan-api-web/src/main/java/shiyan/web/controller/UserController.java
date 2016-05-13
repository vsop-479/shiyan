package shiyan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import shiyan.domain.user.User;
import shiyan.service.user.UserService;

/**
 * Created by Administrator on 2016/4/27.
 */
@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(User user){
        System.out.println(user.getPwd());
        return user.getPwd() ;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registry(User user){
        ModelAndView modelAndView = new ModelAndView();
        try{
            int add = userService.add(user);
            modelAndView.addObject("user", user);
            modelAndView.setViewName("index");
//            modelAndView.setViewName("article");
        }catch (Exception e){
            logger.error("", e);
        }
        return modelAndView;
    }
}
