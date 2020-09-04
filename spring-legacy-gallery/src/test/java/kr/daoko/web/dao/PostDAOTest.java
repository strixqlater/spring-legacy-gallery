package kr.daoko.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.daoko.web.model.PostVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/dataSource-context.xml", "file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class PostDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(PostDAOTest.class);
	
	@Inject
	private PostDAO postDAO;
	
	@Test
	@Ignore
	public void testGetBoardList() throws Exception {
		List<PostVO> postList = postDAO.getPostList();
		
		logger.info("###### POST LIST ######");
		
		if(postList.size() > 0) {
			for(PostVO list: postList) {
				logger.info(list.getTitle());
			}
		}
		
		else {
			logger.info("데이터가 없습니다.");
		}
	}
	
	@Test
	@Ignore
	public void testGetPostContent() throws Exception {
		PostVO postVO = postDAO.getPostContent(1);
		
		logger.info("###### POST CONTENT ######");
		
		if(postVO != null) {
			logger.info("글 번호: " + postVO.getPost_id());
			logger.info("제목: " + postVO.getTitle());
			logger.info("내용: " + postVO.getContent());
			logger.info("조회 수: " + postVO.getView_cnt());
			logger.info("작성자: " + postVO.getReg_id());
			logger.info("작성일: " + postVO.getReg_dt());
			logger.info("최종 수정일: " + postVO.getEdit_dt());
		}
	}
	
	@Test
	@Ignore
	public void testInsert() throws Exception {
		PostVO postVO = new PostVO();
		
		for(int i = 1; i <= 5; i++ ) {
			postVO.setTitle("게시글" + i);
			postVO.setContent(i + "번째 게시글 입니다.");
			postVO.setReg_id("테스트");
			int result = postDAO.insertPost(postVO);

			if(result == 1) {
				logger.info(i + "번째 게시글 등록 성공");
			}
			
			else {
				logger.info(i + "번째 게시글 등록 실패");
			}
		}
	}
	
	@Test
	public void testUpdate() throws Exception {
		PostVO postVO = new PostVO();
		
		for(int i = 1; i <= 5; i++ ) {
			postVO.setPost_id(i);
			postVO.setTitle("게시글" + i);
			postVO.setContent(i + "번째 수정된 게시글 입니다.");
			int result = postDAO.updatePost(postVO);

			if(result == 1) {
				logger.info(i + "번째 게시글 수정 성공");
			}
			
			else {
				logger.info(i + "번째 게시글 수정 실패");
			}
		}
	}
	
	@Test
	@Ignore
	public void tesDeleteBoard() throws Exception {
		int result = postDAO.deletePost(1);

		logger.info("###### DELETE POST ######");

		if(result > 0) {
			logger.info("게시물 삭제 성공 ");
		}
		
		else {
			logger.info("게시물 삭제 실패");
		}
	}
	
	@Test
	@Ignore
	public void testUpdateViewCnt() throws Exception {
		int result = postDAO.updateViewCount(1);
		
		logger.info("###### UPDATE VIEW COUNT ######");

		if(result > 0) {
			logger.info("\n 게시물 조회수 업데이트 성공 ");
		}
		
		else {
			logger.info("\n 게시물 조회수 업데이트 실패");
		}
	}
}