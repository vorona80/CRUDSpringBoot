package com.vorona.crudspringboot.crudspringboot.controller;

import com.vorona.crudspringboot.crudspringboot.Service.UserService;
import com.vorona.crudspringboot.crudspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("")
    public String returnUser (Model model) {
        model.addAttribute("user",userService.getUser());
        return "user";
    }
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("people",userService.show(id));
//        return "show";
//    }
    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }
    @PostMapping
    public String create(@ModelAttribute("user")@Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "new";
        userService.save(user);
        return "redirect:/user";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable("id") Long id) {
        model.addAttribute("user", userService.show(id));
        return "edit";
    }
    @PatchMapping("/{id}")
    public String update (@ModelAttribute("user") @Validated User user, BindingResult bindingResult, @PathVariable("id")Long id) {
        if(bindingResult.hasErrors())
            return "edit";
        userService.update(id,user);
        return  "redirect:/user";
    }
 //   @DeleteMapping("/{id}")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")Long id) {
        userService.delete(id);
        return  "redirect:/user";
    }
}


