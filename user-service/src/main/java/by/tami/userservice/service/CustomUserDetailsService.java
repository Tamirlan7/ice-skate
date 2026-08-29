package by.tami.userservice.service;

import by.tami.userservice.dto.CustomUserDetails;
import by.tami.userservice.exception.NotFoundException;
import by.tami.userservice.model.User;
import by.tami.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByPhoneNumber(username)
                .orElseThrow(() -> new NotFoundException("Пользователь с таким номером телефона не найден " + username));

        CustomUserDetails userDetails = new CustomUserDetails();
        userDetails.setUsername(user.getPhoneNumber());
        userDetails.setPassword(user.getPassword());
        userDetails.setAuthorities(List.of());
        return userDetails;
    }
}
