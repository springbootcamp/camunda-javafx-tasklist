package org.springbootcamp.camunda.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultAwesomeActionService implements AwesomeActionService {

  @Override
  public String processName(final String name) {
    if (name.equals("Anton")) {
      return "Hello Anton!";
    } else {
      return "Hello Unknown Stranger!";
    }
  }

}
