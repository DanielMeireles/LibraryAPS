package br.cesjf.library.controller;

import br.cesjf.library.dao.SubjectDAO;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindSubject;
import br.cesjf.library.model.Subject;

import java.util.List;

public class SubjectController {

    private Subject subject;
    private List<Subject> subjects;

    public SubjectController() {
        this.clear();
    }
    
    public SubjectController(Subject subject) {
        this.subject = subject;
    }

    public void save() {
        SubjectDAO.getInstance().persist(subject);
    }

    public void delete() {
        SubjectDAO.getInstance().remove(subject.getId());
    }

    public void findById(Long id) {
        Find find = new FindSubject();
        subjects = find.find("Id", Long.toString(id));
    }

    public void findBySubject(String subject) {
        Find find = new FindSubject();
        subjects = find.find("Subject", subject);
    }

    public void findAll() {
        Find find = new FindSubject();
        subjects = find.find("All", "");
    }

    public void clear() {
        subject = Subject.Builder
                .newInstance()
                .build();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List subjects) {
        this.subjects = subjects;
    }

}