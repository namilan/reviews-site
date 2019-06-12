package org.wecancodeit.reviewssite;

public class Review {
	
	public long id;
	protected String title;
	protected String imageURL;
	protected String reviewCategory;
	protected String content;
	protected String date;
	protected String synopsis;
	

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
