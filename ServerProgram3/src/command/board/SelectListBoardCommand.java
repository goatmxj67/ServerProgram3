package command.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.BoardDAO;
import dto.BoardDTO;

public class SelectListBoardCommand implements BoardCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		
		int totalRecord = BoardDAO.getInstance().getTotalBoardCount();
		List<BoardDTO> list = BoardDAO.getInstance().selectList();
		request.setAttribute("list", list);
		request.setAttribute("totalRecord", totalRecord);
		
		ModelAndView mav = new ModelAndView("/board/listBoard.jsp", false);  
		return mav;
		
	}

}