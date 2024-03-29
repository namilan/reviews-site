package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	//Review Map
	public Map<Long, Review> reviewMap = new HashMap<>();

	
	//Constructor
	public ReviewRepository() {
	Review review = new Review(11111, "Wild Star Online", "imageURL", "MMO", "Content", "6/3/14", "WildStar was a fantasy/science fiction in a multiplayer oline roleplaying environment developed by Carbine Studios");
	Review review2 = new Review(22222, "Elder Scrolls Online", "imageURL", "MMO", "Content","4/4/14", "Elder Scrolls is a multiplayer online role-playing game developed by ZeniMax Online Studios, but published by Bethesda.");
	Review review3 = new Review(33333, "Final Fantasy XIV", "imageURL", "MMO", "Content", "9/30/10", "Final Fantasy XIV is a massive multiplayer online and role-playing game for Microsoft Windows personal computers. This game was developed and published by Square Enix.");
	Review review4 = new Review(44444, "World of War Craft", "imageURL", "MMO", "Content", "11/23/04", "World of Warcraft, also known as WoW, is a multiplayer online role-playing game developed by Blizzard and also published by Blizzard as well.");		
	
	reviewMap.put(review.getId(), review);
	reviewMap.put(review.getId(), review2);
	reviewMap.put(review.getId(), review3);
	reviewMap.put(review.getId(), review4);
	
	}

	public ReviewRepository(Review...reviews) {
		for (Review review : reviews) {
			reviewMap.put(review.getId(), review);
		}
	}
	public Collection<Review> findAll(){
		return reviewMap.values();
	}
	
	public Review findOne(long id) {
		return reviewMap.get(id);
	}


}
