package controller;

import command.board.BoardCommand;
import command.board.DeleteBoardCommand;
import command.board.InsertBoardCommand;
import command.board.InsertBoardPageCommand;
import command.board.InsertReplyCommand;
import command.board.SelectListBoardCommand;
import command.board.SelectOneBoardCommand;
import command.board.UpdateBoardPageCommand;

public class BoardCommandMapper {

	private static BoardCommandMapper instance = new BoardCommandMapper();
	private BoardCommandMapper() {}
	public static BoardCommandMapper getInstance() {
		if (instance == null) {
			instance = new BoardCommandMapper();
		}
		return instance;
	}
	
	public BoardCommand getCommand(String cmd) {
		BoardCommand command = null;
		switch (cmd) {
		case "selectListBoardPage.do":
			command = new SelectListBoardCommand();
			break;
		case "insertBoardPage.do":
			command = new InsertBoardPageCommand();
			break;
		case "insertBoard.do":
			command = new InsertBoardCommand();
			break;
		case "selectOneBoard.do":
			command = new SelectOneBoardCommand();
			break;
		case "deleteBoard.do":
			command = new DeleteBoardCommand();
			break;
		case "updateBoardPage.do":
			command = new UpdateBoardPageCommand();
			break;
		case "insertReply.do":
			command = new InsertReplyCommand();
			break;
		}
		return command;
	}
	
}