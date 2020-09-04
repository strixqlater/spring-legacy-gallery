package kr.daoko.web.dao;

import java.util.List;

import kr.daoko.web.model.PostVO;

public interface PostDAO {
	public List<PostVO> getPostList() throws Exception;
	public PostVO getPostContent(int post_id) throws Exception;
	public int insertPost(PostVO postVO) throws Exception;
	public int updatePost(PostVO postVO) throws Exception;
	public int deletePost(int post_id) throws Exception;
	public int updateViewCount(int post_id) throws Exception;
}
