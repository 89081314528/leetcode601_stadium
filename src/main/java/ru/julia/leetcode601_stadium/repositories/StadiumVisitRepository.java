package ru.julia.leetcode601_stadium.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.leetcode601_stadium.entity.StadiumVisit;

public interface StadiumVisitRepository extends JpaRepository<StadiumVisit, Long> {
}
