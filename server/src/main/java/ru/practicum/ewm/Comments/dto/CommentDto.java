package ru.practicum.ewm.Comments.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CommentDto {

    private int id;

    private String description;

    private LocalDateTime timestamp;

    private int user;

    private int event;
}

