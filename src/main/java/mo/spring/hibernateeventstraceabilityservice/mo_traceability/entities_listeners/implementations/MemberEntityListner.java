package mo.spring.hibernateeventstraceabilityservice.mo_traceability.entities_listeners.implementations;

import mo.spring.hibernateeventstraceabilityservice.mo_traceability.entities_listeners.IEntityListener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class MemberEntityListner implements IEntityListener {

    public MemberEntityListner() {
    }

    @Override
    @PrePersist
    public void prePersist(Object entity) {

    }

    @Override
    @PostPersist
    public void postPersist(Object entity) {

    }

    @Override
    @PreUpdate
    public void preUpdate(Object entity) {

    }

    @Override
    @PostUpdate
    public void postUpdate(Object entity) {

    }

    @Override
    @PreRemove
    public void preRemove(Object entity) {

    }

    @Override
    @PostRemove
    public void postRemove(Object entity) {

    }

    @Override
    @PostLoad
    public void postLoad(Object entity) {

    }
}
