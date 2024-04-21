package com.test.wsocket.chat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.test.wsocket.chat.model.dto.ChatRoom;
import com.test.wsocket.chat.model.service.ChatService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatRoom createRoom(@RequestParam(value="name") String name) {
        return chatService.createRoom(name);
    }

    @GetMapping
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
    
}
