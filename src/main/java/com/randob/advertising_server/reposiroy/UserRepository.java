package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
