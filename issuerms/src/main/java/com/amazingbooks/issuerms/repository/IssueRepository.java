package com.amazingbooks.issuerms.repository;

import com.amazingbooks.issuerms.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {
}
