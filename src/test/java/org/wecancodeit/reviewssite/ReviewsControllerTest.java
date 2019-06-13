package org.wecancodeit.reviewssite;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class ReviewsControllerTest {

	ReviewsController underTest = new ReviewsController();
	
	@Test
	public void isMapEmpty() {
		ReviewRepository repository = new ReviewRepository();
		repository = underTest.repository;
		Map<Long, Review> map = new HashMap<>();
		map = repository.reviewMap;
		assertFalse(map.isEmpty());

	}


}
