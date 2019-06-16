package org.wecancodeit.reviewssite;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	
ReviewRepository underTest;
	
	private long reviewOneId = 11111;
	private Review review = new Review(11111, "Wild Star Online", "imageURL", "MMO", "Content", "6/3/14", "WildStar was a fantasy/science fiction in a multiplayer oline roleplaying environment developed by Carbine Studios");
	private long reviewTwoId = 22222;
	private Review review2 = new Review(22222, "Elder Scrolls Online", "imageURL", "MMO", "Content","4/4/14", "Elder Scrolls is a multiplayer online role-playing game developed by ZeniMax Online Studios, but published by Bethesda.");
	private long reviewThreeId = 33333;
	private Review review3 = new Review(33333, "Final Fantasy XIV", "imageURL", "MMO", "Content", "9/30/10", "Final Fantasy XIV is a massive multiplayer online and role-playing game for Microsoft Windows personal computers. This game was developed and published by Square Enix.");
	private long reviewFourId = 44444;
	private Review review4 = new Review(44444, "World of War Craft", "imageURL", "MMO", "Content", "11/23/04", "World of Warcraft, also known as WoW, is a multiplayer online role-playing game developed by Blizzard and also published by Blizzard as well.");
	
	
	
	
	@Test
	public void ShouldFindAReview() {
		underTest = new ReviewRepository(review);
		Review result = underTest.findOne(reviewOneId);
		assertThat(result, is(review));
	}
	
	@Test
	public void ShouldFindReview2() {
		underTest = new ReviewRepository(review2);
		Review result = underTest.findOne(reviewTwoId);
		assertThat(result, is(review2));
	}
	
	@Test
	public void ShouldFindReview3() {
		underTest = new ReviewRepository(review3);
		Review result = underTest.findOne(reviewThreeId);
		assertThat(result, is(review3));
	}
	
	@Test
	public void ShouldFindReview4() {
		underTest = new ReviewRepository(review4);
		Review result = underTest.findOne(reviewFourId);
		assertThat(result, is(review4));
	}

	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(review, review2, review3, review4);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(review, review2, review3, review4));
	}
}

