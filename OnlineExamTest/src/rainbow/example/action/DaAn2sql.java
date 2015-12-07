package rainbow.example.action;

import java.util.List;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.util.String2List;

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
	}

	public static void intoDaAn_zg(DaAnJuan daJuan,String string) {

	}

}
