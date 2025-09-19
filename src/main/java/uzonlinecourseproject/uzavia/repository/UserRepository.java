package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Users;

public interface UserRepository  extends JpaRepository<Users, Integer> {
}
