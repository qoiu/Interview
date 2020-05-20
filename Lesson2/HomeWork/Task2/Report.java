import java.util.*;
class Report{
	private List<ReportItem> items;	// Отчетные данные
	private ReportOut reportOut;
	
	public Report(ReportOut reportOut){
		this.reportOut=reportOut;
	}
	
	// расчет отчетных данных
	public void calculate(){
		items =  new ArrayList<ReportItem>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));
	}
	
	public void setReportOut(ReportOut reportOut){
		this.reportOut = reportOut;
	}
	
	public void output(){
		PrintReport reportPrint = new PrintReport();
		reportPrint.output(items);
	}
}