package com.mycompany.board.dao;
 
import java.util.List;
 
import javax.annotation.Resource;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.mycompany.board.dto.BoardDto;
import com.mycompany.board.form.BoardForm;
 
@Repository
public class BoardDao {
 
    @Resource(name = "sqlSession")
    private SqlSession sqlSession;
 
    private static final String NAMESPACE = "com.mycompany.board.boardMapper";
 
    public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
 
        return sqlSession.selectList(NAMESPACE + ".getBoardList");
    }
}
