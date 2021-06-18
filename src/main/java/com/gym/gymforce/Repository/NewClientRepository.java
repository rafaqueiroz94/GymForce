package com.gym.gymforce.Repository;

import com.gym.gymforce.Entity.NewClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewClientRepository extends JpaRepository<NewClientEntity, Long> {

    NewClientEntity findById (long id);

}
