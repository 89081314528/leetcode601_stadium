package ru.julia.leetcode601_stadium.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stadium_visits")
public class StadiumVisit {
    @Column(name = "stadium_visit_id")
    @Id
    Long id;
    @Column(name = "date")
    Long date;
    @Column(name = "people")
    Long people;

    public Long getId() {
        return id;
    }

    public Long getDate() {
        return date;
    }

    public Long getPeople() {
        return people;
    }

    public StadiumVisit() {
    }

    public StadiumVisit(Long id, Long date, Long people) {
        this.id = id;
        this.date = date;
        this.people = people;
    }
}
