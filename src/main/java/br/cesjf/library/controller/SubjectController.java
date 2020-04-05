package br.cesjf.library.controller;

import br.cesjf.library.dao.SubjectDAO;
import br.cesjf.library.model.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubjectController {

    private Subject subject;
    private List<Subject> subjects;

    public SubjectController() {
        this.clear();
    }

    public void save(Subject subject) {
        SubjectDAO.getInstance().persist(subject);
    }

    public void delete(Subject subject) {
        SubjectDAO.getInstance().remove(subject.getId());
    }

    public void findById(Long id) {
        subjects.add(SubjectDAO.getInstance().find(id));
    }

    public void findBySubject(String subject) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("subject", subject));
        subjects = SubjectDAO.getInstance().findByNamedQuery("Subject.findBySubject", parameters);
    }

    public void findAll() {
        subjects = SubjectDAO.getInstance().getList();
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

    public List getSubjects() {
        return subjects;
    }

    public void setSubjects(List subjects) {
        this.subjects = subjects;
    }

}