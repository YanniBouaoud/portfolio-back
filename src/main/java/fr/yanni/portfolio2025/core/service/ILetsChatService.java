package fr.yanni.portfolio2025.core.service;

import fr.yanni.portfolio2025.core.domain.LetsChat;

public interface ILetsChatService {
	LetsChat getLetsChatById(Short id);
	LetsChat save(LetsChat letsChat);
}


