package me.yuhee.practice.repositories;

import me.yuhee.practice.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long    > {
    User findById(@Param("id") long id);
    List<User> findByName(@Param("name") String name);
}
