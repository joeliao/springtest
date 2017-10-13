package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.ModelAdmission2017;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelPosition2018Repository extends CrudRepository<ModelAdmission2017, Long> {

}
