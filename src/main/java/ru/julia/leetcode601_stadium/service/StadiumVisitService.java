package ru.julia.leetcode601_stadium.service;

import ru.julia.leetcode601_stadium.dto.Visit;

import java.util.List;

public interface StadiumVisitService {
public List<Visit> getVisitsSortedAsc();
public List<Visit> biggerThan(int a);

}
