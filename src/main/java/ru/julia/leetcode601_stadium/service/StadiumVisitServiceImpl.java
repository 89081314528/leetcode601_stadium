package ru.julia.leetcode601_stadium.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.julia.leetcode601_stadium.dto.Visit;
import ru.julia.leetcode601_stadium.entity.StadiumVisit;
import ru.julia.leetcode601_stadium.repositories.StadiumVisitRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StadiumVisitServiceImpl implements StadiumVisitService {
    StadiumVisitRepository stadiumVisitRepository;

    public StadiumVisitServiceImpl(StadiumVisitRepository stadiumVisitRepository) {
        this.stadiumVisitRepository = stadiumVisitRepository;
    }

    public List<Visit> acs() {
        List<StadiumVisit> stadiumVisitList =
                stadiumVisitRepository.findAll(Sort.by(Sort.Direction.ASC, "date"));
        List<Visit> visitList = new ArrayList<>();
        for (int i = 0; i < stadiumVisitList.size(); i++) {
            StadiumVisit stadiumVisit = stadiumVisitList.get(i);
            visitList.add(new Visit(stadiumVisit.getId(), stadiumVisit.getDate(),stadiumVisit.getPeople()));
        }
        return visitList;
    }

    public List<Visit> biggerThan(int a) {// как здесь вызвать acs?
        List<StadiumVisit> stadiumVisitList =
                stadiumVisitRepository.findAll(Sort.by(Sort.Direction.ASC, "date"));
        List<Visit> visitList = new ArrayList<>();
        for (int i = 0; i < stadiumVisitList.size(); i++) {
            StadiumVisit stadiumVisit = stadiumVisitList.get(i);
            if (stadiumVisit.getPeople() >= a) {
                visitList.add(new Visit(stadiumVisit.getId(), stadiumVisit.getDate(), stadiumVisit.getPeople()));
            }
        }
        return visitList;
    }
}
