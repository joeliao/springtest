package org.baeldung.persistence.dao;

import java.util.Date;
import java.util.List;

import org.baeldung.persistence.model.ModelPlan2018;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelPlan2018Repository extends CrudRepository<ModelPlan2018, Long> {
    @Query("select p from ModelPlan2018 p where p.id<14797")
    List<ModelPlan2018> getSampleData();
}
