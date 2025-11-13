package com.example.demo.controller;

import com.example.demo.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HomeController {

  // @PathVariable("first") String num1, @PathVariable("second") String num2
  public HomeService homeService = new HomeService();

  @GetMapping("/home")
  public String loadHome() {
    return "loaded home";
  }

  @GetMapping("/add/{first}/{second}")
  public String add(@PathVariable("first") String first, @PathVariable("second") String second) {
    // return "works fine";
    return homeService.add(first, second);
  }

  @GetMapping("/mul/{first}/{second}")
  public String mul(@PathVariable("first") String first, @PathVariable("second") String second) {
    // return "works fine";
    return homeService.mull(first, second);
  }

  @GetMapping("/custom/{fnum}/{snum}")
  public void runCustom(@PathVariable("fnum") int a,@PathVariable("snum") int b){
    homeService.executeCustom(a,b);
  }
}
