package hi.hispring.repository;

import hi.hispring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null을 optional 로 감싸서 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
