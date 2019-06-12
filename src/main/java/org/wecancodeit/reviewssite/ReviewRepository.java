package org.wecancodeit.reviewssite;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository(Review review) {
		reviewList.put(review.getId(), review);
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

}
