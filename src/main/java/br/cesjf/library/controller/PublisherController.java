package br.cesjf.library.controller;

import br.cesjf.library.dao.PublisherDAO;
import br.cesjf.library.model.Publisher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PublisherController {

    private Publisher publisher;
    private List<Publisher> publishers;

    public PublisherController() {
        this.clear();
    }

    public void save(Publisher publisher) {
        PublisherDAO.getInstance().persist(publisher);
    }

    public void delete(Publisher publisher) {
        PublisherDAO.getInstance().remove(publisher.getId());
    }

    public void findById(Long id) {
        publishers.add(PublisherDAO.getInstance().find(id));
    }

    public void findByName(String name) {
        List<List> parameters = new ArrayList<>();
        parameters.add(Arrays.asList("name", name));
        publishers = PublisherDAO.getInstance().findByNamedQuery("Publisher.findByName", parameters);
    }

    public void findAll() {
        publishers = PublisherDAO.getInstance().getList();
    }

    public void clear() {
        publisher = Publisher.Builder
                .newInstance()
                .build();
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List getPublishers() {
        return publishers;
    }

    public void setPublishers(List publishers) {
        this.publishers = publishers;
    }

}