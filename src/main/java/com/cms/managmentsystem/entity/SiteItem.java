package com.cms.managmentsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SiteItem {

    @Id
    public int id;
    public String name;
}
