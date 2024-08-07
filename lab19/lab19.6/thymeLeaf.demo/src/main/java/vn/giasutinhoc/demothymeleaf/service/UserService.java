package vn.giasutinhoc.demothymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vn.giasutinhoc.demothymeleaf.entity.Users;
import vn.giasutinhoc.demothymeleaf.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private  final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }
    public List<Users> getAllUsers() {
    return (List<Users>) userRepository.findAll();
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public Optional<Users> findUserById(Long id) {
        return userRepository.findById(id);
    }
    public Page<Users> findPaginated(int pageNo,int pageSize) {
        PageRequest   pageable = PageRequest.of(pageNo -1, pageSize);
        return this.userRepository.findAll(pageable);
    }
    public  List<Users>searchUsers(String name){
        return userRepository.search(name);
    }
}
