package donkers.tutorial.medium

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TutorialRestApiApplication

fun main(args: Array<String>) {
	runApplication<TutorialRestApiApplication>(*args)
}
