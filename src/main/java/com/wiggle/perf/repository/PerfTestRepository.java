package com.wiggle.perf.repository;

import com.wiggle.perf.model.PerfTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PerfTestRepository extends MongoRepository<PerfTest, Long> {

    @Query(value = "{ 'orders._id' : ?0}")
    PerfTest findContainingOrder(String id);
}
