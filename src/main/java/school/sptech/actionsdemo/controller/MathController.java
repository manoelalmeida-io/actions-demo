package school.sptech.actionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/math")
public class MathController {

  @GetMapping
  public Integer sum(@RequestParam Integer a, @RequestParam Integer b) {
    return a + b;
  }
}
