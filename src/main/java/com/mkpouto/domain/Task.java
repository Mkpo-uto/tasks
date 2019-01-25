package com.mkpouto.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
//@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @JsonFormat(pattern ="MM/dd/yyyy")
    private LocalDate dueDate;

    private boolean completed;

    public Task(long id, String name, LocalDate dueDate, boolean completed) {

    }
}
