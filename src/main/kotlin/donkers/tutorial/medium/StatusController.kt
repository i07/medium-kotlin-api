package donkers.tutorial.medium

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

data class StatusObject(var timestamp:LocalDateTime, var message:String) {
    constructor():this(LocalDateTime.now(), "Server Ok!")
}

@RestController
@RequestMapping("/")
class StatusController {

    @GetMapping("status")
    fun getStatus():ResponseEntity<StatusObject> {
        return ResponseEntity(StatusObject(), HttpStatus.OK)
    }
}
