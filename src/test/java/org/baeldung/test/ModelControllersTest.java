package org.baeldung.test;

import java.util.List;

import org.baeldung.Application;
import org.baeldung.persistence.dao.ModelSystemViewRepository;
import org.baeldung.persistence.model.ModelSystemView;
import org.baeldung.spring.TestDbConfig;
import org.baeldung.spring.TestIntegrationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class, TestDbConfig.class, TestIntegrationConfig.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
@Transactional
public class ModelControllersTest {
	@Autowired
	ModelSystemViewRepository modelSystemRepo;

	@Test
	public void getModelSystem() {
		
		Iterable<ModelSystemView> modelSys=modelSystemRepo.findAll();
		for (ModelSystemView ms: modelSys) {
			System.out.println(ms.toString());;
		}
		
	}
}
