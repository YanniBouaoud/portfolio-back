/**
 * 
 */
package fr.yanni.portfolio2025.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.portfolio2025.core.domain.LetsChat;
import fr.yanni.portfolio2025.core.dto.LetsChatDTO;
import fr.yanni.portfolio2025.core.dto.mapper.LetsChatMapper;
import fr.yanni.portfolio2025.core.service.ILetsChatService;




@RestController
@CrossOrigin
@RequestMapping("/letschat")
public class LetsChatController {

    @Autowired
    private ILetsChatService letsChatService;

    @Autowired
    private LetsChatMapper letsChatMapper;

    @PostMapping("/")
    public LetsChatDTO save(@RequestBody final LetsChatDTO order) {
        System.out.println("Received request for saving LetsChatDTO");
        LetsChat newOrder = letsChatMapper.dtoToEntity(order);
        LetsChat savedOrder = letsChatService.save(newOrder);
        return letsChatMapper.letschatToDto(savedOrder);
    }
}
