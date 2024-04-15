package com.mycompany.springframework.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.springframework.dto.Ch04LoginForm;
import com.mycompany.springframework.dto.Ch04LoginFormValidator;
import com.mycompany.springframework.dto.Ch04SignupForm;
import com.mycompany.springframework.dto.Ch04SignupFormValidator;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch04")
public class Ch04Controller {
  @GetMapping("/loginForm")
  public String loginForm(Model model) {
    model.addAttribute("chNum", "ch04");
    return "ch04/loginForm";
  }
  @GetMapping("/signupForm")
  public String signupForm(Model model) {
    model.addAttribute("chNum","ch04");
    return "ch04/signupForm";
  }

  @InitBinder("ch04LoginForm")
  public void ch04LoginFormValidator(WebDataBinder binder) {
    binder.setValidator(new Ch04LoginFormValidator());
  }
  @InitBinder("ch04SignupForm")
  public void ch04SignupFormValidator(WebDataBinder binder) {
    binder.setValidator(new Ch04SignupFormValidator());
  }
  @RequestMapping("/login")
  public String login(@Valid Ch04LoginForm loginForm, Errors errors, Model model) {
    // 유효성 검사 실패시 다시 로그인 폼 보여주기
    if (errors.hasErrors()) {
      model.addAttribute("chNum","ch04");
      return "ch04/loginForm";
    }

    // 로그인 처리
    return "redirect:/";

  }
  
  @RequestMapping("/signup")
  public String signup(@Valid Ch04SignupForm signupForm, Errors errors, Model model) {
    // 유효성 검사 실패시 다시 로그인 폼 보여주기
    if (errors.hasErrors()) {
      model.addAttribute("chNum","ch04");
      return "ch04/signupForm";
    }

    // 로그인 처리
    return "redirect:/ch04/login";

  }
}
