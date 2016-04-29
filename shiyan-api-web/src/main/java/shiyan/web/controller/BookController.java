package shiyan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shiyan.domain.Book;
import shiyan.service.book.BookService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public String addBook(HttpServletRequest request, HttpServletResponse response, Book book){
        bookService.doService();
        return "book";
    }

    @RequestMapping(value = "get", method=RequestMethod.GET)
    public ModelAndView getBook(HttpServletRequest request, HttpServletResponse response, Book book){
        Book book1 = bookService.getBook();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("book", book1);
        modelAndView.setViewName("book");
        return modelAndView;
    }

    @RequestMapping("getbookson")
    public @ResponseBody Book getBookson(){
        bookService.doService();
        Book book = new Book();
        book.setAuthor("罗贯中");
        return book;
    }
    @RequestMapping(value = "getwhat", method = RequestMethod.GET)
    public String getWhat(HttpServletRequest request, HttpServletResponse response, Book book, RedirectAttributes attr){
        attr.addAttribute("author", book.getAuthor());

        return "redirect:/book/get";
    }
}
