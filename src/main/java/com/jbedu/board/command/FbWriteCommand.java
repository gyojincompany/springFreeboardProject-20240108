package com.jbedu.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jbedu.board.dao.FreeBoardDao;

public class FbWriteCommand {
	
//	public void execute(String fbtitle, String fbname, String fbcontent) {
//		
//		FreeBoardDao freeBoardDao = new FreeBoardDao();
//		
//		freeBoardDao.write(fbtitle, fbname, fbcontent);
//	}
	
	public void execute(Model model) {
		
		// model에서 request 객체 분리해서 가져오기
		Map<String, Object> requestMap = model.asMap();
		HttpServletRequest request = (HttpServletRequest) requestMap.get("request");
		
		String fbtitle = request.getParameter("fbtitle");
		String fbname = request.getParameter("fbname");
		String fbcontent = request.getParameter("fbcontent");
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();		
		freeBoardDao.write(fbtitle, fbname, fbcontent);
	}
	
}
