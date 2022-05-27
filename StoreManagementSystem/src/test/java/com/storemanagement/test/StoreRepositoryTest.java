package com.storemanagement.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.storemanagement.model.StoreDetail;
import com.storemanagement.service.StoreDetailRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class StoreRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private StoreDetailRepo repository;
     
    @Test
    public void testSaveNewProduct() {
        entityManager.persist(new StoreDetail("store1", "atp1", "atp2", "ap", "india",
    			"515110", "803279273", "thrilok@gmail.com"));
                 
       Optional<StoreDetail> storeDetail = repository.findById(1);
         
        assertThat(storeDetail).isEqualTo(storeDetail);
    }
}
