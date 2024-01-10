package com.jbedu.board.command;

import com.jbedu.board.dao.FreeBoardDao;

public class FbModifyCommand {
	public void execute(String fbtitle, String fbname, String fbcontent, String fbnum) {
			
			FreeBoardDao freeBoardDao = new FreeBoardDao();
			
			freeBoardDao.modify(fbtitle, fbname, fbcontent, fbnum);
	}
}
