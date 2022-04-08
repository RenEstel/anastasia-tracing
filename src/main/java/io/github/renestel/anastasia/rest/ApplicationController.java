package io.github.renestel.anastasia.rest;

import io.github.renestel.anastasia.domain.AnswerDto;
import io.github.renestel.anastasia.domain.RequestDto;
import io.github.renestel.anastasia.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j(topic = "APPLICATION-CONTROLLER")
@RequiredArgsConstructor
public class ApplicationController {
    final ApplicationService applicationService;

    @PostMapping("/hello")
    public AnswerDto some(@RequestBody RequestDto requestDto) {
        log.info("we are in controller");
        return applicationService.some();
    }
}
