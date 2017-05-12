package org.springbootcamp.camunda

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport.launchApp
import org.springbootcamp.camunda.view.MainView
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class CamundaJavaFxTasklistApplication : AbstractJavaFxApplicationSupport()

fun main(args: Array<String>) {
  launchApp(CamundaJavaFxTasklistApplication::class.java, MainView::class.java, args)
}
