package vn.giasutinhoc.demothymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.giasutinhoc.demothymeleaf.entity.Users;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query(value="SELECT id, name, email, phone FROM user u where concat(u.id,' ', u.name,' ', u.email,' ', u.phone) like %?1%",nativeQuery = true)
 public List<Users> search(String pageable);
}
