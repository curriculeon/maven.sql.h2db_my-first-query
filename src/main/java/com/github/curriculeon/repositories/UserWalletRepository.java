package com.github.curriculeon.repositories;

import com.github.curriculeon.models.UserWallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWalletRepository extends CrudRepository<UserWallet, Long> {
}
