package com.skilldistillery.cardbase.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CardTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Card card;

	@BeforeAll

	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("htu_mtgcards");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		card = em.find(Card.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		card = null;
	}

	// '1', '7', 'Mary', 'Smithers', 'MARY.SMITH@sdvidcustomer.org', '5', '1',
	// '2014-05-25 00:00:00', '2016-09-16 11:32:19'

	@Test
	@DisplayName("testing basic customer mappings")
	void test() {
		assertNotNull(card);
		assertEquals("Angel of Serenity", card.getCardName());
		assertEquals("RTR", card.getSetAbbr());

	}
}