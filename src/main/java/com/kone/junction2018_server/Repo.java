package com.kone.junction2018_server;

import com.kone.junction2018_server.Haiku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Haiku, Long> {
}
