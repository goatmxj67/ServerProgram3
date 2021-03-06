package command.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.BoardDAO;
import dto.BoardDTO;
import dto.ReplyDTO;

public class SelectOneBoardCommand implements BoardCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		BoardDTO dto = BoardDAO.getInstance().selectOneBoardByNo(no);
		
		BoardDAO.getInstance().updateHit(no);
		
		
		List<ReplyDTO> replyList = BoardDAO.getInstance().selectListReply(no); 
		
		String referer = request.getHeader("referer"); 
		
		request.setAttribute("dto", dto);
		request.setAttribute("referer", referer);
		request.setAttribute("replyList", replyList);

		ModelAndView mav = new ModelAndView("/board/viewBoard.jsp", false); 
		return mav;
		
	}

}