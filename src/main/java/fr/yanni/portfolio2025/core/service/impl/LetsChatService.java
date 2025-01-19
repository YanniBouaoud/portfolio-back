package fr.yanni.portfolio2025.core.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.portfolio2025.core.domain.LetsChat;
import fr.yanni.portfolio2025.core.repository.ILetsChatRepository;
import fr.yanni.portfolio2025.core.service.ILetsChatService;


@Service
@CrossOrigin
public class LetsChatService implements ILetsChatService {
	/**
	 * Autowired field for the DevisCar repository.
	 */
	@Autowired
	private ILetsChatRepository letschatRepo;

	@Override
	public final LetsChat save(final LetsChat letsChat) {
		return letschatRepo.saveAndFlush(letsChat);
	}

	@Override
	public final LetsChat getLetsChatById(final Short id) {
		Optional<LetsChat> optionalDevisBati = letschatRepo.findById(id);
		return optionalDevisBati.orElse(null);
	}
	}

