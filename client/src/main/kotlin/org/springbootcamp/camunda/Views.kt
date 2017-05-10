package org.springbootcamp.camunda.view

import de.felixroske.jfxsupport.AbstractFxmlView
import de.felixroske.jfxsupport.FXMLView
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.Pane
import javafx.scene.layout.StackPane

@FXMLView
class HelloWorldView : AbstractFxmlView()

@FXMLView
class MainView : AbstractFxmlView()

@FXMLView
class SecondJavaView : AbstractFxmlView() {

  private val pane: Pane

  init {
    val btn = Button()
    btn.text = "Say 'Hello World'"
    btn.onAction = EventHandler<ActionEvent> { println(it) }

    pane = StackPane()
    pane.children.add(btn)

  }

  override fun getView(): Parent = pane
}
