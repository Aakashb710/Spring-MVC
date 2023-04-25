package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController
{

    @RequestMapping("/contact")
    public String showForm()
    {
        System.out.println("This is form page");
        return "contact";
    }


//    @RequestMapping(path = "/processform", method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email") String email,
//                             @RequestParam("userName") String userName,
//                             @RequestParam("password") String password, Model model)
//    {
//        System.out.println("email : " +email );
//        System.out.println("username : "+userName);
//        System.out.println(("password : "+password));
//
//        model.addAttribute("email",email);
//        model.addAttribute("userName",userName);
//        model.addAttribute("password",password);
//
//
//
//        return "success";
//    }



    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model)
    {

        return "success";
    }

}
