package org.springbootcamp.camunda.server

import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component


@SpringBootApplication
@EnableProcessApplication
open class ProcessEngineApplication

fun main(args: Array<String>) {
  SpringApplication.run(ProcessEngineApplication::class.java, *args);
}

@Component
class Start(val runtimeService: RuntimeService) : CommandLineRunner {
  override fun run(vararg args: String?) {
    val processInstance = runtimeService.startProcessInstanceByKey("process_example")
  }
}
