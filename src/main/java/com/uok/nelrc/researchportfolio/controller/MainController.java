package com.uok.nelrc.researchportfolio.controller;

import com.uok.nelrc.researchportfolio.model.*;
import com.uok.nelrc.researchportfolio.repository.AuthorRepository;
import com.uok.nelrc.researchportfolio.repository.FundRepository;
import com.uok.nelrc.researchportfolio.repository.PublicationRepository;
import com.uok.nelrc.researchportfolio.repository.ResearchPaperRepository;
import com.uok.nelrc.researchportfolio.repository.ResearcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(value = "portfolio")
public class MainController {

    private static final String SUCCESS = "Saved";
    @Autowired
    private ResearcherRepository researcherRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private FundRepository fundRepository;
    @Autowired
    private PublicationRepository publicationRepository;
    @Autowired
    private ResearchPaperRepository researchPaperRepository;

    /*
    * Researcher for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/researcher")
    public @ResponseBody
    Iterable<Researcher> getResearchers() {
        return researcherRepository.findAll();
    }

    @GetMapping("/researcher/{id}")
    public Optional<Researcher> researcherFindById(@PathVariable("id") Long id) {
        return researcherRepository.findById(id);
    }

    @PostMapping("/researcherCreate")
    public Researcher addResearcher(@RequestBody Researcher researcher) {
        return researcherRepository.save(researcher);
    }

    @PutMapping("/researcherUpdate/{id}")
    public Researcher updateResearcher(@RequestBody Researcher researcher) {
        return researcherRepository.save(researcher);
    }

    @DeleteMapping("resercherDelete/{id}")
    public void deleteResearcher(@PathVariable("id") Long id) {
        researcherRepository.deleteById(id);
    }

    /*
    * Author for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/author")
    public @ResponseBody
    Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/author/{id}")
    public Optional<Author> authorFindById(@PathVariable("id") Long author_id) {
        return authorRepository.findById(author_id);
    }

    @PostMapping("/authorCreate")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/authorUpdate/{id}")
    public Author updateResearcher(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @DeleteMapping("authorDelete/{id}")
    public void deleteAuthor(@PathVariable("id") Long author_id) {
        researcherRepository.deleteById(author_id);
    }

    /*
    * Fund for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/fund")
    public @ResponseBody
    Iterable<Fund> getFunds() {
        return fundRepository.findAll();
    }

    @GetMapping("/fund/{fund_id}")
    public Optional<Fund> FundFindById(@PathVariable("fund_id") Long fund_id) {
        return fundRepository.findById(fund_id);
    }

    @PostMapping("/fundCreate")
    public Fund addFund(@RequestBody Fund fund) {
        return fundRepository.save(fund);
    }

    @PutMapping("/fundUpdate/{fund_id}")
    public Fund updateFund(@RequestBody Fund fund) {
        return fundRepository.save(fund);
    }

    @DeleteMapping("fundDelete/{fund_id}")
    public void deleteFund(@PathVariable("fund_id") Long fund_id) {
        researcherRepository.deleteById(fund_id);
    }

    /*
    * Publication for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/publication")
    public @ResponseBody
    Iterable<Publication> getPublications() {
        return publicationRepository.findAll();
    }

    @GetMapping("/publication/{publication_id}")
    public Optional<Publication> PublicationFindById(@PathVariable("publication_id") Long publication_id) {
        return publicationRepository.findById(publication_id);
    }

    @PostMapping("/publicationCreate")
    public Publication addPublication(@RequestBody Publication publication) {
        return publicationRepository.save(publication);
    }

    @PutMapping("/publicationUpdate/{publication_id}")
    public Publication updatePublication(@RequestBody Publication publication) {
        return publicationRepository.save(publication);
    }

    @DeleteMapping("publicationDelete/{publication_id}")
    public void deletePublication(@PathVariable("publication_id") Long publication_id) {
        publicationRepository.deleteById(publication_id);
    }

    /*
    * ResearcherPaper for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/researchPaper")
    public @ResponseBody
    Iterable<ResearchPapers> getResearchPapers() {
        return researchPaperRepository.findAll();
    }

    @GetMapping("/researchPaper/{research_paper_id}")
    public Optional<ResearchPapers> ResearchPapersFindById(@PathVariable("research_paper_id") Long research_paper_id) {
        return researchPaperRepository.findById(research_paper_id);
    }

    @PostMapping("/researchPaperCreate")
    public ResearchPapers addResearchPapers(@RequestBody ResearchPapers researchPapers) {
        return researchPaperRepository.save(researchPapers);
    }

    @PutMapping("/researchPaperUpdate/{publication_id}")
    public ResearchPapers updateResearchPaper(@RequestBody ResearchPapers researchPapers) {
        return researchPaperRepository.save(researchPapers);
    }

    @DeleteMapping("researchPaperDelete/{research_paper_id}")
    public void deleteResearchPapers(@PathVariable("research_paper_id") Long research_paper_id) {
        researchPaperRepository.deleteById(research_paper_id);
    }
}

