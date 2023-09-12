package studio.thinkground.testproject1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/postform")
    void postform(){

    }

    @ResponseBody
    @PostMapping("log-test")
        public void logTest(){

        LOGGER.trace("Tlace LOG");
        LOGGER.debug("Debug LOG");
        LOGGER.info("Info LOG");
        LOGGER.warn("Warn LOG");
        LOGGER.error("Error LOG");

        }
}
