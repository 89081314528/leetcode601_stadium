package ru.julia.leetcode601_stadium.dto;

public class Visit {
    final Long id;
    final Long date;

    public Long getId() {
        return id;
    }

    public Long getDate() {
        return date;
    }

    public Long getPeople() {
        return people;
    }

    public Visit(Long id, Long date, Long people) {
        this.id = id;
        this.date = date;
        this.people = people;
    }

    final Long people;
}
