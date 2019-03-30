package school.lemon.db.sample.dao.example1.best;

public interface DAO<Entity, Key> {
    boolean create(Entity entity);
    Entity  read(Key key);
    boolean update(Entity entity);// entity also can be called model
    boolean delete(Entity model);
}
