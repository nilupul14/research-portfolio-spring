package com.uok.nelrc.researchportfolio.controller;

import com.uok.nelrc.researchportfolio.model.*;
import com.uok.nelrc.researchportfolio.repository.AuthorRepository;
import com.uok.nelrc.researchportfolio.repository.FundRepository;
import com.uok.nelrc.researchportfolio.repository.PublicationRepository;
import com.uok.nelrc.researchportfolio.repository.ResearchPaperRepository;
import com.uok.nelrc.researchportfolio.repository.ResearcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
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

    @GetMapping("/researcherInfo/{id}")
    public Optional<Researcher> researcherFindById(@PathVariable("id") Long id) {
        return researcherRepository.findById(id);
    }

    @PostMapping("/researcherCreate")
    public Researcher addResearcher(@RequestBody Researcher researcher) {
        return researcherRepository.save(researcher);
    }

    @PutMapping("/researcherUpdate/{id}")
    public Researcher updateResearcher(@PathVariable("id") Long id, @RequestBody Researcher researcher) {
        researcher.setId(id);
        return researcherRepository.save(researcher);
    }

    @DeleteMapping("researcherDelete/{id}")
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

    @GetMapping("/authorInfo/{id}")
    public Optional<Author> authorFindById(@PathVariable("id") Long authorId) {
        return authorRepository.findById(authorId);
    }

    @PostMapping("/authorCreate")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/authorUpdate/{id}")
    public Author updateAuthor(@PathVariable("id") Long authorId,@RequestBody Author author) {
        author.setAuthorId(authorId);
        return authorRepository.save(author);
    }

    @DeleteMapping("authorDelete/{id}")
    public void deleteAuthor(@PathVariable("id") Long authorId) {
        authorRepository.deleteById(authorId);
    }

    /*
    * Fund for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/fund")
    public @ResponseBody
    Iterable<Fund> getFunds() {
        return fundRepository.findAll();
    }

    @GetMapping("/fundInfo/{id}")
    public Optional<Fund> FundFindById(@PathVariable("id") Long fundId) {
        return fundRepository.findById(fundId);
    }

    @PostMapping("/fundCreate")
    public Fund addFund(@RequestBody Fund fund) {
        return fundRepository.save(fund);
    }

    @PutMapping("/fundUpdate/{id}")
    public Fund updateFund(@PathVariable("id") Long fundId,@RequestBody Fund fund) {
        fund.setFundId(fundId);
        return fundRepository.save(fund);
    }

    @DeleteMapping("/fundDelete/{id}")
    public void deleteFund(@PathVariable("id") Long fundId) {
        fundRepository.deleteById(fundId);
    }

    /*
    * Publication for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/publication")
    public @ResponseBody
    Iterable<Publication> getPublications() {
        return publicationRepository.findAll();
    }

    @GetMapping("/publicationInfo/{id}")
    public Optional<Publication> PublicationFindById(@PathVariable("id") Long publicationId) {
        return publicationRepository.findById(publicationId);
    }

    @PostMapping("/publicationCreate")
    public Publication addPublication(@RequestBody Publication publication) {
        return publicationRepository.save(publication);
    }

    @PutMapping("/publicationUpdate/{id}")
    public Publication updatePublication(@PathVariable("id") Long publicationId,@RequestBody Publication publication) {
        publication.setPublicationId(publicationId);
        return publicationRepository.save(publication);
    }

    @DeleteMapping("publicationDelete/{id}")
    public void deletePublication(@PathVariable("id") Long publicationId) {
        publicationRepository.deleteById(publicationId);
    }

    /*
    * ResearcherPaper for GET,POST,PUT and DELETE Methods
    * */
    @GetMapping("/researchPaper")
    public @ResponseBody
    Iterable<ResearchPapers> getResearchPapers() {
        return researchPaperRepository.findAll();
    }

    @GetMapping("/researchPaperInfo/{id}")
    public Optional<ResearchPapers> ResearchPapersFindById(@PathVariable("id") Long researchPaperId) {
        return researchPaperRepository.findById(researchPaperId);
    }

    @PostMapping("/researchPaperCreate")
    public ResearchPapers addResearchPapers(@RequestBody ResearchPapers researchPapers) {
        return researchPaperRepository.save(researchPapers);
    }

    @PutMapping("/researchPaperUpdate/{id}")
    public ResearchPapers updateResearchPaper(@PathVariable("id") Long researchPaperId,@RequestBody ResearchPapers researchPapers) {
        researchPapers.setResearchPaperId(researchPaperId);
        return researchPaperRepository.save(researchPapers);
    }

    @DeleteMapping("researchPaperDelete/{id}")
    public void deleteResearchPapers(@PathVariable("id") Long researchPaperId) {
        researchPaperRepository.deleteById(researchPaperId);
    }
}

