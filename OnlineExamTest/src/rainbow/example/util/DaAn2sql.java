package rainbow.example.util;

import java.util.List;

import rainbow.example.domain.DaAnJuan;

public final class DaAn2sql {
	
	public static void intoDaAn_xz(DaAnJuan daJuan,String string) {
		String[] list = String2List.change(string);
		daJuan.setXuanze1(list[0]);
		daJuan.setXuanze2(list[1]);
		daJuan.setXuanze3(list[2]);
		daJuan.setXuanze4(list[3]);
		daJuan.setXuanze5(list[4]);
		daJuan.setXuanze6(list[5]);
		daJuan.setXuanze7(list[6]);
		daJuan.setXuanze8(list[7]);
		daJuan.setXuanze9(list[8]);
		daJuan.setXuanze10(list[9]);
	}

	public static void intoDaAn_pd(DaAnJuan daJuan,String string) {
		String[] list = String2List.change(string);
		daJuan.setPangduan1(list[0]);
		daJuan.setPangduan2(list[1]);
		daJuan.setPangduan3(list[2]);
		daJuan.setPangduan4(list[3]);
		daJuan.setPangduan5(list[4]);
		daJuan.setPangduan6(list[5]);
		daJuan.setPangduan7(list[6]);
		daJuan.setPangduan8(list[7]);
		daJuan.setPangduan9(list[8]);
		daJuan.setPangduan10(list[9]);		
	}

	public static void intoDaAn_zg(DaAnJuan daJuan,String string) {
		String[] list = String2List.change(string);
		daJuan.setZhuguan1(list[0]);
		daJuan.setZhuguan2(list[1]);
		daJuan.setZhuguan3(list[2]);
	}

}
