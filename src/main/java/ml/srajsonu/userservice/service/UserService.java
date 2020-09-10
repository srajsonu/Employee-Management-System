package ml.srajsonu.userservice.service;

import ml.srajsonu.userservice.dto.UserDto;
import ml.srajsonu.userservice.model.User;

public interface UserService {

    User registerUser(UserDto userDto);

    User validateUser(String token);
}
