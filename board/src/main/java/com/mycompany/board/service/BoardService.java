package com.mycompany.board.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.mycompany.board.dao.BoardDao;
import com.mycompany.board.dto.BoardDto;
import com.mycompany.board.form.BoardForm;

public class BoardService {
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception{
		return boardDao.getBoardList(boardForm);
	}

}
