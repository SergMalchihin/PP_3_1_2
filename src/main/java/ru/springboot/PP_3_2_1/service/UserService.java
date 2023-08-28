package ru.springboot.PP_3_2_1.service;



import ru.springboot.PP_3_2_1.model.User;

import java.util.List;

public interface UserService {

    List <User> getAllUsers(); // запрос select
    User getUserById (long id);
    void addUser(User user);//запрос update
    void delete(long id); //запрос delete
    void updateUser (long id, User updateUser);

}
