package fr.yanni.portfolio2025.core.dto.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.yanni.portfolio2025.core.domain.LetsChat;
import fr.yanni.portfolio2025.core.dto.LetsChatDTO;

/**
 * Mapper class for converting between LetsChat and LetsChatDTO objects.
 */
@Component
public class LetsChatMapper {

	
    /**
     * Converts a LetsChat object to a LetsChatDTO object.
     *
     * @param letsChat The LetsChat object.
     * @return The LetsChatDTO object.
     */
    public LetsChatDTO letschatToDto(final LetsChat letsChat) {
        LetsChatDTO dto = null;
        if (letsChat != null) {
            dto = new LetsChatDTO();
            dto.setId(letsChat.getId());
            dto.setName(letsChat.getName());
            dto.setEmail(letsChat.getEmail());
            dto.setMessage(letsChat.getMessage());
        }
        return dto;
    }

    /**
     * Converts a LetsChatDTO object to a LetsChat entity object.
     *
     * @param dto The LetsChatDTO object.
     * @return The LetsChat entity object.
     */
    public LetsChat dtoToEntity(final LetsChatDTO dto) {
        LetsChat entity = null;
        if (dto != null) {
            entity = new LetsChat();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setMessage(dto.getMessage());
        }
        return entity;
    }
    
    
 
   
}