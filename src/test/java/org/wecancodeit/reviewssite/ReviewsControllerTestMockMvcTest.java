package org.wecancodeit.reviewssite;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsController.class)
public class ReviewsControllerTestMockMvcTest {
	
	@Resource
	private MockMvc mvc;
	
	@Test
	public void shouldBeOkForAllReviews() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(status().isOk);
	}

}