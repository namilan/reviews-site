package org.wecancodeit.reviewssite;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReviewsController {

	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	
//	@RequestMapping("/show-reviews")
//	public String findAllReviews() {
//		return "reviews";
//	}
//		
//	@RequestMapping("/reviews")
//	public String fetchReviews(Model model) {
//		model.addAttribute("reviewsAsCollection", repository.findAll());
//		return "reviews";
//	}
//	
//	@RequestMapping("/oneReview")
//    public String fetchOne(@RequestParam(value="id") Long id, Model model) {
//         model.addAttribute("oneReview", repository.findOne(id));
//         return "oneReview";
//     }
}
