package org.wecancodeit.reviewssite;

public class Review {
	
	private long id;
	private String title;
	private String imageURL;
	private String reviewCategory;
	private String content;
	private String date;
	private String synopsis;
	private String tag;
	

	public Review(long id, String title, String imageURL, String reviewCategory, String content, String date,
			String synopsis, String tag) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.date = date;
		this.synopsis = synopsis;
		this.tag = tag;
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
	
	public String getTag() {
		return tag;
	}


}
