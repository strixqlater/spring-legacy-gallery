package kr.daoko.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.daoko.web.model.PostVO;

@Repository
public class PostDAOImpl implements PostDAO{
	private static String namespace = "kr.daoko.web.mapper.boardMapper";
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<PostVO> getPostList() throws Exception {
		return sqlSession.selectList(namespace + ".getPostList");
	}

	@Override
	public PostVO getPostContent(int post_id) throws Exception {
		return sqlSession.selectOne(namespace + ".getPostContent", post_id);
	}

	@Override
	public int insertPost(PostVO postVO) throws Exception {
		return sqlSession.insert(namespace + ".insertPost", postVO);
	}

	@Override
	public int updatePost(PostVO postVO) throws Exception {
		return sqlSession.update(namespace + ".updatePost", postVO);
	}

	@Override
	public int deletePost(int post_id) throws Exception {
		return sqlSession.delete(namespace + ".deletePost", post_id);
	}

	@Override
	public int updateViewCount(int post_id) throws Exception {
		return sqlSession.update(namespace + ".updateViewCount", post_id);
	}
}
