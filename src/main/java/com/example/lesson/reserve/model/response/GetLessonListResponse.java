package com.example.lesson.reserve.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetLessonListResponse {

    /**
     * レッスンID
     */
    private Integer id;

    /**
     * レッスン名
     */
    private String name;

    /**
     *レッスン概要
     */
    private String description;

    /**
     * 対象言語
     */
    private String language;

    /**
     * 料金
     */
    private Integer fee;
}
