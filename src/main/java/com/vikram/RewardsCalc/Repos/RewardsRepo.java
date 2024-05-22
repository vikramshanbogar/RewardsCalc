package com.vikram.RewardsCalc.Repos;

import com.vikram.RewardsCalc.Models.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepo extends JpaRepository<Rewards,Integer> {
}
