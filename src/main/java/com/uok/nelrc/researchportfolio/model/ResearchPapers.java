package com.uok.nelrc.researchportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResearchPapers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long researchPaperId;

    private String name;
    private String publication;
    private String funding;

    public Long getResearchPaperId() {
        return researchPaperId;
    }

    public void setResearchPaperId(Long researchPaperId) {
        this.researchPaperId = researchPaperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }
}
