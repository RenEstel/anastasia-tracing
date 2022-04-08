package io.github.renestel.anastasia.service;

import io.github.renestel.anastasia.domain.AnswerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j(topic = "APPLICATION-SERVICE")
public class ApplicationService {
    public AnswerDto some() {
        log.info("we are in service");
        return AnswerDto.builder().text("hello from service").build();
    }
}
