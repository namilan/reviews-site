package org.wecancodeit.reviewssite;

import java.util.HashMap;

public class Review {
	
	public long id;
	protected String title = "title";
	protected String imageURL = "imageURL";
	protected String reviewCategory = "reviewCategory";
	protected String content = "Content";
	protected String date = "date";
	protected String synopsis = "synopsis";
	

	public Review(long id, String title, String imageURL, String reviewCategory, String content, String date,
			String synopsis) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.date = date;
		this.synopsis = synopsis;
	}

	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageURL() {
		return imageURL;
	}
	
	public String getReviewCategory(){
		return reviewCategory;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
}
