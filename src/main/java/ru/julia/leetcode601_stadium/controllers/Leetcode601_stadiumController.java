package ru.julia.leetcode601_stadium.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode601_stadium.dto.Visit;
import ru.julia.leetcode601_stadium.service.StadiumVisitService;

import java.util.List;

@RestController
public class Leetcode601_stadiumController {// правильно назвала контроллер?
    @RequestMapping("/")
    public static String hi(){
        return "lallala";
    }
    StadiumVisitService stadiumVisitService;

    public Leetcode601_stadiumController(StadiumVisitService stadiumVisitService) {
        this.stadiumVisitService = stadiumVisitService;
    }

    @RequestMapping("/acs")
    public List<Visit> acs(){
        return stadiumVisitService.acs();
    }
    @RequestMapping("/biggerThan{a}")// правильно ли я здесь пишу а?
    public List<Visit> biggerThan(@PathVariable int a){
        return stadiumVisitService.biggerThan(a);
    }
}
