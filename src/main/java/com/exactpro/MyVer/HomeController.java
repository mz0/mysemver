package com.exactpro.MyVer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @Autowired
  private BuildProperties buildProps;

  private String myVer() {
    return buildProps.getVersion().length()>1 ? buildProps.getVersion() : "unknown!";
  }

  @GetMapping
  public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
    return name.equals("") ? myVer() : "Hey, " + name + "!";
  }
}
