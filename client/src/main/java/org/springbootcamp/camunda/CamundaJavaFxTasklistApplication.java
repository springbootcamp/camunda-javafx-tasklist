package org.springbootcamp.camunda;

import org.springbootcamp.camunda.view.MainView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class CamundaJavaFxTasklistApplication extends AbstractJavaFxApplicationSupport {

  public static void main(String[] args) {
    launchApp(CamundaJavaFxTasklistApplication.class, MainView.class, args);
  }
}
