package com.wiggle.perf.repository;

import io.swagger.client.model.InlineResponse2003Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderEventRepository extends MongoRepository<InlineResponse2003Page, Long> {
    @Query(value = "{ 'referenceId' : ?0}")
    List<InlineResponse2003Page> findAll(String id);
}
