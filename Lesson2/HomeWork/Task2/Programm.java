class Programm{
	public static void main(String[] args){
		Report report = new Report(new ScreenReport());
		report.calculate();
		report.output();
		report.setReportOut(new PrintReport());
		report.output();
	}
}