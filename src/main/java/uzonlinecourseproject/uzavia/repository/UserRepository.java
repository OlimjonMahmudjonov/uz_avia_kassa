package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uzonlinecourseproject.uzavia.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
