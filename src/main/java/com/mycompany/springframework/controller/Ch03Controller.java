
package com.mycompany.springframework.controller;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch03")
public class Ch03Controller {

  @RequestMapping("/receiveParamData")
  public String receiveParamData(String param1, String param2, String param3, String param4,
      String param5, Model model) {
    log.info("receiveParamData() 실행");
    log.info("param1: " + param1);
    log.info("param1: " + param2);
    log.info("param1: " + param3);
    log.info("param1: " + param4);
    log.info("param1: " + param5);

    model.addAttribute("chNum", "ch03");
    model.addAttribute("param1", param1);
    model.addAttribute("param2", param2);
    model.addAttribute("param3", param3);
    model.addAttribute("param4", param4);
    model.addAttribute("param5", param5);

    return "ch03/receiveParamData";
  }


  @GetMapping("/postMethodForm")
  public String postMethodForm(String chNum, Model model) {
    log.info("postMethodForm() 실행");
    model.addAttribute("chNum", "ch03");
    return "ch03/postMethodForm";
  }

  @RequestMapping("/requestParamAnnotation")
  public String requestParamAnnotation(@RequestParam("param1") String param1,
      @RequestParam("param2") String param2, @RequestParam("param3") String param3,
      @RequestParam("param4") String param4, @RequestParam("param5") String param5, Model model) {
    log.info("receiveParamData() 실행");
    log.info("param1: " + param1);
    log.info("param1: " + param2);
    log.info("param1: " + param3);
    log.info("param1: " + param4);
    log.info("param1: " + param5);

    model.addAttribute("chNum", "ch03");
    model.addAttribute("param1", param1);
    model.addAttribute("param2", param2);
    model.addAttribute("param3", param3);
    model.addAttribute("param4", param4);
    model.addAttribute("param5", param5);

    return "ch03/receiveParamData";
  }

  @RequestMapping("/requestParamAnnotationRequired")
  public String requestParamAnnotationRequired(@RequestParam(required = true) String param1,
      @RequestParam(required = true) String param2, String param3, String param4, String param5,
      Model model) {
    log.info("receiveParamData() 실행");
    log.info("param1: " + param1);
    log.info("param1: " + param2);
    log.info("param1: " + param3);
    log.info("param1: " + param4);
    log.info("param1: " + param5);

    model.addAttribute("chNum", "ch03");
    model.addAttribute("param1", param1);
    model.addAttribute("param2", param2);
    model.addAttribute("param3", param3);
    model.addAttribute("param4", param4);
    model.addAttribute("param5", param5);

    return "ch03/receiveParamData";
  }

  @RequestMapping("/requestParamAnnotationDefaultValue")
  public String requestParamAnnotationDefaultValue(@RequestParam(required = true) String param1,
      @RequestParam(required = true) String param2, String param3, String param4, String param5,
      @RequestParam(defaultValue = "기본값") String param6, Model model) {
    log.info("receiveParamData() 실행");
    log.info("param1: " + param1);
    log.info("param2: " + param2);
    log.info("param3: " + param3);
    log.info("param4: " + param4);
    log.info("param5: " + param5);
    log.info("param6: " + param6);

    model.addAttribute("chNum", "ch03");
    model.addAttribute("param1", param1);
    model.addAttribute("param2", param2);
    model.addAttribute("param3", param3);
    model.addAttribute("param4", param4);
    model.addAttribute("param5", param5);
    model.addAttribute("param6", param6);

    return "ch03/receiveParamData";
  }

  @RequestMapping("/typeChange")
  public String typeChange(@RequestParam(required = true) String param1,
      int param2, double param3, boolean param4,@DateTimeFormat(pattern="yyyy-MM-dd") Date param5,
      @RequestParam(defaultValue ="0") int param6, Model model) {
    log.info("receiveParamData() 실행");
    log.info("param1: " + param1);
    log.info("param2: " + param2);
    log.info("param3: " + param3);
    log.info("param4: " + param4);
    log.info("param5: " + param5);
    log.info("param6: " + param6);

    model.addAttribute("chNum", "ch03");
    model.addAttribute("param1", param1);
    model.addAttribute("param2", param2);
    model.addAttribute("param3", param3);
    model.addAttribute("param4", param4);
    model.addAttribute("param5", param5);
    model.addAttribute("param6", param6);

    return "ch03/receiveParamData";
  }
}
