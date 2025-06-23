package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }
}

@RestController
class TestController {

    @GetMapping("/")
    String test() {
        return "Test Rest service!"
    }
}
