package batch;

import java.io.IOException;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import dao.BoardDAO;
import dto.BoardDTO;

public class TopHitJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		BoardDTO dto = BoardDAO.getInstance().topHitPerson();
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}