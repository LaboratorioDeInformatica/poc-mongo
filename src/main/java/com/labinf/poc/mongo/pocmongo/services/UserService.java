package com.labinf.poc.mongo.pocmongo.services;

import com.labinf.poc.mongo.pocmongo.domain.User;
import com.labinf.poc.mongo.pocmongo.dto.UserDTO;
import com.labinf.poc.mongo.pocmongo.repository.UserRepository;
import com.labinf.poc.mongo.pocmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user){
        return userRepository.insert(user);
    }

    public void delete(String id){
        Optional<User> obj = userRepository.findById(id);
        if(obj.isPresent()){
            userRepository.deleteById(id);
        }else{
            obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        }

    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }


}
