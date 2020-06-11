package br.cesjf.library.controller;

import br.cesjf.library.dao.PublisherDAO;
import br.cesjf.library.model.Find;
import br.cesjf.library.model.FindPublisher;
import br.cesjf.library.model.Publisher;

import java.util.List;

public class PublisherController {

    private Publisher publisher;
    private List<Publisher> publishers;

    public PublisherController() {
        this.clear();
    }
    
    public PublisherController(Publisher publisher) {
        this.publisher = publisher;
    }

    public void save() {
        PublisherDAO.getInstance().persist(publisher);
    }

    public void delete() {
        PublisherDAO.getInstance().remove(publisher.getId());
    }

    public void findById(Long id) {
        Find find = new FindPublisher();
        publishers = find.find("Id", Long.toString(id));
    }

    public void findByName(String name) {
        Find find = new FindPublisher();
        publishers = find.find("Name", name);
    }

    public void findAll() {
        Find find = new FindPublisher();
        publishers = find.find("All", "");
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

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List publishers) {
        this.publishers = publishers;
    }

}