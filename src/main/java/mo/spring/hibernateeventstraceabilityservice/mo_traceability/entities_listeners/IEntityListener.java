package mo.spring.hibernateeventstraceabilityservice.mo_traceability.entities_listeners;

public interface IEntityListener {
    void prePersist(Object entity);
    void postPersist(Object entity);
    void preUpdate(Object entity);
    void postUpdate(Object entity);
    void preRemove(Object entity);
    void postRemove(Object entity);
    void postLoad(Object entity);
}
