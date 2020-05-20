import java.util.*;
class ScreenReport implements ReportOut{
	public void output(List<ReportItem> items){
		System.out.println("Output to screen");
		for(ReportItem item : items){
			System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
		}
	}
}