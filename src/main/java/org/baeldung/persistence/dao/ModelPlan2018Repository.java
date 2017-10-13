package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.ModelPlan2018;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelPlan2018Repository extends CrudRepository<ModelPlan2018, Long> {

}
