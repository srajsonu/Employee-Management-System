package ml.srajsonu.userservice.controller;

import ml.srajsonu.userservice.dto.ResponseDto;
import ml.srajsonu.userservice.dto.UserDto;
import ml.srajsonu.userservice.dto.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private String name;

    private String email;

    @PostMapping("/user/register")
    public ResponseDto registerUser(@RequestBody UserDto userDto) {

        return new ResponseDto(
                HttpStatus.OK,
                new UserResponseDto(userDto.getId(), userDto.getFullName(), userDto.getEmail(), true)
        );

    }
}
