package command.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.BoardDAO;
import dto.BoardDTO;

public class InsertBoardCommand implements BoardCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = null;
		try {
			
			String author = request.getParameter("author");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String ip = request.getParameter("ip");
			
			BoardDTO dto = new BoardDTO();
			dto.setAuthor(author);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setIp(ip);
			int result = BoardDAO.getInstance().insertBoard(dto);
			if (result == 0) {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('게시글이 저장되지 않았습니다.')");
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
