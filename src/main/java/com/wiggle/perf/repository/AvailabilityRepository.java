package com.wiggle.perf.repository;

import io.swagger.client.model.InlineResponse200;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvailabilityRepository extends MongoRepository<InlineResponse200, Long> {
}
