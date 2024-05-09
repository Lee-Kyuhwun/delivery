package org.delivery.api;

import org.delivery.db.UserDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        SpringApplication.run(ApiApplication.class, args);
    }

}
