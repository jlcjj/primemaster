package teste.junit;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {

	@Test
	public void testData() {
		try {
			assertEquals("23082017", DateUtils.getDateAtualReportName());
			assertEquals("'23/08/2017'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));
			assertEquals("23/08/2017", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
	
	}

}
