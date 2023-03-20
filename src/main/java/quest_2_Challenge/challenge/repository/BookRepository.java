package quest_2_Challenge.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quest_2_Challenge.challenge.entity.Book;


@Repository
public interface BookRepository extends JpaRepository <Book,Integer> {
}
