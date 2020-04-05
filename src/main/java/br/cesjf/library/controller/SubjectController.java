package br.cesjf.library.controller;

import br.cesjf.library.dao.SubjectDAO;
import br.cesjf.library.model.Subject;

import java.util.List;

public class SubjectController {

    private Subject author;
    private List<Subject> subject;

    private SubjectController() {
        this.clear();
    }

    public void save(Subject author) {
        SubjectDAO.getInstance().persist(author);
    }

    public void delete(Subject author) {
        SubjectDAO.getInstance().remove(author.getId());
    }

    public void findById(Long id) {
        subject.add(SubjectDAO.getInstance().find(id));
    }

    public void findAll() {
        subject = SubjectDAO.getInstance().getList();
    }

    public void clear() {
        author = Subject.Builder
                .newInstance()
                .build();
    }

    public Subject getSubject() {
        return author;
    }

    public void setSubject(Subject author) {
        this.author = author;
    }

    public List getSubjects() {
        return subject;
    }

    public void setSubjects(List subjects) {
        this.subject = subjects;
    }

}