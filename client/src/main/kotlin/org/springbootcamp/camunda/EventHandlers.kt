package org.springbootcamp.camunda.eventhandler

import javafx.event.ActionEvent
import javafx.event.EventHandler
import org.springframework.stereotype.Component

@Component
class PrintHello : EventHandler<ActionEvent> {

  override fun handle(event: ActionEvent?) = print(event)

}
