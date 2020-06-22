package mn.auto.ts.test

import groovy.util.logging.Slf4j
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject

@Controller('/')
@Slf4j
class TimeController {

    @Inject
    TimeService timeService

    @Get('/')
    def index() {
        final id = timeService.saveTime()
        "Saved instance ${id}"
    }

    @Get('/list')
    def list(){
        timeService.list()
    }
}
