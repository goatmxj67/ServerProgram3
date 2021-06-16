package command.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.BoardDAO;

public class DeleteBoardCommand implements BoardCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		
		long replyIdx = Long.parseLong(request.getParameter("replyIdx"));
		int no = Integer.parseInt(request.getParameter("no"));
		
		int result1 = BoardDAO.getInstance().deleteReply(replyIdx);
		int result2 = BoardDAO.getInstance().deleteBoard(no);
		ModelAndView mav = null;
		try {
			if (result1 == 0 || result2 == 0) {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('삭제되지 않았습니다.')");
				out.println("history.back()");
				out.println("</script>");
			} else {
				mav = new ModelAndView("/ServerProgram3/selectListBoardPage.do", true);  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mav;
		
	}

}