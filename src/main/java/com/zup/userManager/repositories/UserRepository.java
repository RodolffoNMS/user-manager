package com.zup.userManager.repositories;

import com.zup.userManager.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, String> {

}
