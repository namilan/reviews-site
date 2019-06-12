package org.wecancodeit.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {
	
	private long id = 1L;
	private Review review = new Review(id, "title", "imageURL", "reviewCategory", "content", "date", "description", "collection");
	
	@Test
	public void shouldFindAReview() {
		ReviewRepository underTest = new ReviewRepository(review);
		Review result = underTest.findOne(id);
		assertThat(result, is(review));
	}

}
