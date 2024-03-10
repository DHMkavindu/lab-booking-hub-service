package lk.kavi.labbookinghub.repo;


import lk.kavi.labbookinghub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

  User findByUserName(String userName);
}
