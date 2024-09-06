package com.cms.managmentsystem.repository;

import com.cms.managmentsystem.entity.SiteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<SiteItem, Integer> {
}
