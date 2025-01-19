package fr.yanni.portfolio2025.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.portfolio2025.core.domain.LetsChat;

@Repository

public interface ILetsChatRepository extends JpaRepository<LetsChat, Short> {

}
