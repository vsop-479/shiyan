package shiyan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shiyan.domain.Article;
import shiyan.service.book.BookService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/10.
 */
@Controller
@Scope("prototype")
@RequestMapping("/book/")
public class BookController {
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

    @RequestMapping("add")
    public String addBook(HttpServletRequest request, HttpServletResponse response, Article article){
        bookService.doService();
        return "book";
    }

    @RequestMapping(value = "get/{title}/{author}", method=RequestMethod.GET)
    public ModelAndView getBook(HttpServletRequest request, HttpServletResponse response, Article article, @PathVariable String title, @PathVariable String author){
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
