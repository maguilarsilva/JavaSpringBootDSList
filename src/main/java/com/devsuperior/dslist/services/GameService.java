package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//registrar ele dentro do sistema. Sendo um componente do sistema (@component ou @service).
@Service
public class GameService { //chama o repository e retonar dto

    @Autowired     //Injetar GameRepositoy
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       List<Game> result =  gameRepository.findAll();
       // List<GameMinDTO>dtos = result.stream().map(game -> new GameMinDTO(game)).toList();
        return result.stream().map(GameMinDTO::new).toList();
    }


}
