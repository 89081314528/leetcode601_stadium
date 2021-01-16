package ru.julia.leetcode601_stadium.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode601_stadium.dto.Visit;
import ru.julia.leetcode601_stadium.service.StadiumVisitService;

import java.util.List;

/**
 * 1) расположить данные по возрастанию (по дате)
 * 2) вернуть данные больше числа а
 */
@RestController
public class Leetcode601_stadiumController {// правильно назвала контроллер?
    // в названии классов нельзя исп нижнее подчеркивание
    @RequestMapping("/")
    public static String hi(){
        return "lallala";
    }
    final StadiumVisitService stadiumVisitService;

    public Leetcode601_stadiumController(StadiumVisitService stadiumVisitService) {
        this.stadiumVisitService = stadiumVisitService;
    }

    @RequestMapping("/acs")
    public List<Visit> acs(){
        return stadiumVisitService.getVisitsSortedAsc();
    }
    @RequestMapping("/biggerThan/{b}")// правильно ли я здесь пишу а?
    public List<Visit> biggerThan(@PathVariable("b") int numberOfPeople){
        return stadiumVisitService.biggerThan(numberOfPeople);
    }
}
