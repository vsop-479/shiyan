package shiyan.web.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import shiyan.domain.user.User;

/**
 * Created by Administrator on 2016/4/27.
 */
@Controller
@Scope("prototype")
@RequestMapping("/user/")
public class UserController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody String login(User user){
        System.out.println(user.getPwd());
        return user.getPwd() ;
    }
}
