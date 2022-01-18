package mo.spring.hibernateeventstraceabilityservice.repositories;

import mo.spring.hibernateeventstraceabilityservice.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
