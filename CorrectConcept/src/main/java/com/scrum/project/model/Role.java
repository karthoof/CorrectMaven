package com.scrum.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Role")

public enum Role {

    PRODUCTOWNER, SCRUMMASTER, DEVELOPER, TESTER;

    Role() {

    }



}
