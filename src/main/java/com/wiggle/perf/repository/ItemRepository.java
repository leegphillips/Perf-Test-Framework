package com.wiggle.perf.repository;

import io.swagger.client.model.InlineResponse2002Page;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<InlineResponse2002Page, Long> {
}