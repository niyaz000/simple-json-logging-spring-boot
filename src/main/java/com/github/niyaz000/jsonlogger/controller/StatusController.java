package com.github.niyaz000.jsonlogger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/status")
public class StatusController {
  private final Logger LOGGER = LoggerFactory.getLogger(StatusController.class);

  @GetMapping()
  public String get() {
    LOGGER.info("processing request");
    return "{\"status\": \"OK\"}";
  }

}