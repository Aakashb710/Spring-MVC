package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController
{
    @RequestMapping("/home")
    public String home()
    {
        System.out.println("This is home controller");
        return "home";
    }

    @RequestMapping("/about")
    public String about()
    {
        System.out.println("This is our about page");
        return "about";
    }

    @RequestMapping("/model")
    public String help(Model model)
    {
        model.addAttribute("name","Gublu");
        model.addAttribute("id",7);

        List<String> myfriends = new ArrayList<>();
        myfriends.add("Anxeity");
        myfriends.add("Self-doubt");
        myfriends.add("Depression");
        myfriends.add("Loneliness");

        model.addAttribute("list",myfriends);

        return "help";
    }

    @RequestMapping("/success")
    public ModelAndView dkm()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");

        mv.addObject("name","Khushi");

        return mv;
    }
}
