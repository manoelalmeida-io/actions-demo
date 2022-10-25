package school.sptech.actionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

  @GetMapping
  public Integer sum(@RequestParam Integer a, @RequestParam Integer b) {
    // Adding conflict comment
    return a + b;
  }
}
