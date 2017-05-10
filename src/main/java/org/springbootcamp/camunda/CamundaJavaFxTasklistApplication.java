package org.springbootcamp.camunda;

import org.springbootcamp.camunda.view.HelloWorldView;
import org.springbootcamp.camunda.view.SecondJavaView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class CamundaJavaFxTasklistApplication extends AbstractJavaFxApplicationSupport {

  public static void main(String[] args) {
    launchApp(CamundaJavaFxTasklistApplication.class, SecondJavaView.class, args);
//    launchApp(CamundaJavaFxTasklistApplication.class, HelloWorldView.class, args);
  }
}
