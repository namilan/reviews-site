package org.wecancodeit.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {
	
	ReviewRepository underTest;
	
	private long firstReviewId = 11111;
	private Review firstReview = new Review(firstReviewId, "title", "imageURL", "reviewCategory", "content", "date", "description");
	
	private long secondReviewId = 22222;
	private Review secondReview = new Review(secondReviewId, "title", "imageURL", "reviewCategory", "content", "date", "description");
	
	private long thirdReviewId = 33333;
	private Review thirdReview = new Review(thirdReviewId, "title", "imageURL", "reviewCategory", "content", "date", "description");
	
	private long fourthReviewId = 44444;
	private Review fourthReview = new Review(fourthReviewId, "title", "imageURL", "reviewCategory", "content", "date", "description");
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));		
	}
	
	@Test
	public void shouldFindAThirdReview() {
		underTest = new ReviewRepository(thirdReview);
		Review result = underTest.findOne(thirdReviewId);
		assertThat(result, is(thirdReview));		
	}
	
	@Test
	public void shouldFindAFourthReview() {
		underTest = new ReviewRepository(fourthReview);
		Review result = underTest.findOne(fourthReviewId);
		assertThat(result, is(fourthReview));
	}
	
}
