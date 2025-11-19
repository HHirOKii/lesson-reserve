package com.example.lesson.reserve.controller;

import com.example.lesson.reserve.model.response.GetLessonListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lesson")
public class LessonController {

    @GetMapping
    public GetLessonListResponse getLessonList() {
        return GetLessonListResponse.builder()
                                    .build();
    }
}
