package com.jbedu.board.command;

import com.jbedu.board.dao.FreeBoardDao;

public class FbDeleteCommand {
	
	public void execute(String fbnum) {
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		
		freeBoardDao.delete(fbnum);
	}
	
}
