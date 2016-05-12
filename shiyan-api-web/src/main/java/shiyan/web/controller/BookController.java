package shiyan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shiyan.domain.Article;
import shiyan.domain.result.Result;
import shiyan.service.book.BookService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2015/9/10.
 */
@Controller
@Scope("prototype")
@RequestMapping("/book/")
public class BookController extends BaseController{
    @Autowired
    private BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public BookController(){
        System.out.println("BookController init");
    }

    @RequestMapping("toAdd")
    public ModelAndView toBook(HttpServletRequest request, HttpServletResponse response, Article article){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add-article");
        return modelAndView;
    }

//    @RequestMapping("add")
//    public Result add(HttpServletRequest request, HttpServletResponse response, Article article){
//        Result result = new Result();
//        try{
//            article.setOid(UUID.randomUUID().toString());
//            bookService.addArticle(article);
//            result.setSuccess(true);
//            result.setMsg(article.getTitle() + ":添加成功");
//        }catch (Exception e){
//            logger.error("", e);
//            result.setMsg(article.getTitle() + ":失败原因");
//            result.setSuccess(false);
//        }
//        return result;
//    }

    @RequestMapping("add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Article article){
        Result result = new Result();
        try{
            article.setOid(UUID.randomUUID().toString());
            bookService.addArticle(article);
            result.setSuccess(true);
            result.setMsg(article.getTitle() + ":添加成功");
        }catch (Exception e){
            logger.error("", e);
            result.setMsg(article.getTitle() + ":失败原因");
            result.setSuccess(false);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("submit-article-form-result");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @RequestMapping(value = "get/{title}/{author}", method=RequestMethod.GET)
    public ModelAndView getBook(HttpServletRequest request, HttpServletResponse response, Article article, @PathVariable String title, @PathVariable String author){
        Cookie cookie = new Cookie("user-key", UUID.randomUUID().toString());
        cookie.setMaxAge(60*60);
        cookie.setPath("/");//对整个项目可见, 通过setDomain可设置整个网站有效
        response.addCookie(cookie);
        Map map = new HashMap();
        map.put("title", title);
        map.put("author", author);
        Article article1 = bookService.getBook(map);
        article1.setContent(article1.getContent().replace("\n", "<p>"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("article", article1);
        modelAndView.setViewName("article");
        return modelAndView;
    }

    @RequestMapping("getbookson")
    public @ResponseBody
    Article getBookson(){
        bookService.doService();
        Article article = new Article();
        article.setAuthor("罗贯中");
        return article;
    }
    @RequestMapping(value = "getwhat", method = RequestMethod.GET)
    public String getWhat(HttpServletRequest request, HttpServletResponse response, Article article, RedirectAttributes attr){
        attr.addAttribute("author", article.getAuthor());

        return "redirect:/book/get";
    }
}
