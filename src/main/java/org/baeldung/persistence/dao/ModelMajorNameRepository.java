package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.ModelAdmission2017;
import org.baeldung.persistence.model.ModelMajorName;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelMajorNameRepository extends CrudRepository<ModelMajorName, Long> {

}
