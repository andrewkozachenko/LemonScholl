package school.lemon.db.sample.dao.example1.best;

import school.lemon.db.work.with.table.entity.User;

public class UserDao implements DAO<User,Integer> {
    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public User read(Integer integer) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User model) {
        return false;
    }
}
