package rainbow.example.util;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.KeGuan;
import rainbow.example.domain.PangDuan;
import rainbow.example.domain.XuanZe;

/*2015.12.11
 * 改卷：选择：2分*10题，判断：2分*10题，主观：20分*3题
 */
public final class TrueORfalse {
	public static List<XuanZe> listXuanZes;
	public static List<PangDuan> listPangDuans;
	public static List<KeGuan> listZhuGuans;

	public static DaAnJuan daJuan;

	public static int getListXuanZes() {
		int sumXuanZe = 0;

		if (daJuan.getXuanze1() == listXuanZes.get(0).getDaAn()
				|| daJuan.getXuanze1().equals(listXuanZes.get(0).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze2() == listXuanZes.get(1).getDaAn()
				|| daJuan.getXuanze2().equals(listXuanZes.get(1).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze3() == listXuanZes.get(2).getDaAn()
				|| daJuan.getXuanze3().equals(listXuanZes.get(2).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze4() == listXuanZes.get(3).getDaAn()
				|| daJuan.getXuanze4().equals(listXuanZes.get(3).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze5() == listXuanZes.get(4).getDaAn()
				|| daJuan.getXuanze5().equals(listXuanZes.get(4).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze6() == listXuanZes.get(5).getDaAn()
				|| daJuan.getXuanze6().equals(listXuanZes.get(5).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze7() == listXuanZes.get(6).getDaAn()
				|| daJuan.getXuanze7().equals(listXuanZes.get(6).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze8() == listXuanZes.get(7).getDaAn()
				|| daJuan.getXuanze8().equals(listXuanZes.get(7).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze9() == listXuanZes.get(8).getDaAn()
				|| daJuan.getXuanze9().equals(listXuanZes.get(8).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		if (daJuan.getXuanze10() == listXuanZes.get(9).getDaAn()
				|| daJuan.getXuanze10().equals(listXuanZes.get(9).getDaAn())) {
			sumXuanZe = sumXuanZe + 2;
		}
		System.out.println(listXuanZes.get(0).getTiMu()
				+ "**************************"
				+ listXuanZes.get(0).getDaAn()
				+ "**************************" + sumXuanZe
				+ "**************************" + daJuan.getXuanze1());
		return sumXuanZe;
	}

	public static int getListPangDuans() {
		int sumPangDuan = 0;
		if (daJuan.getPangduan1() == listPangDuans.get(0).getDaAn()
				|| daJuan.getPangduan1().equals(listPangDuans.get(0).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan2() == listPangDuans.get(1).getDaAn()
				|| daJuan.getPangduan2().equals(listPangDuans.get(1).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan3() == listPangDuans.get(2).getDaAn()
				|| daJuan.getPangduan3().equals(listPangDuans.get(2).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan4() == listPangDuans.get(3).getDaAn()
				|| daJuan.getPangduan4().equals(listPangDuans.get(3).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan5() == listPangDuans.get(4).getDaAn()
				|| daJuan.getPangduan5().equals(listPangDuans.get(4).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan6() == listPangDuans.get(5).getDaAn()
				|| daJuan.getPangduan6().equals(listPangDuans.get(5).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan7() == listPangDuans.get(6).getDaAn()
				|| daJuan.getPangduan7().equals(listPangDuans.get(6).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan8() == listPangDuans.get(7).getDaAn()
				|| daJuan.getPangduan8().equals(listPangDuans.get(7).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan9() == listPangDuans.get(8).getDaAn()
				|| daJuan.getPangduan9().equals(listPangDuans.get(8).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		if (daJuan.getPangduan10() == listPangDuans.get(9).getDaAn()
				|| daJuan.getPangduan10().equals(listPangDuans.get(9).getDaAn())) {
			sumPangDuan = sumPangDuan + 2;
		}
		System.out.println(listPangDuans.get(0).getTiMu()
				+ "**************************"
				+ listPangDuans.get(0).getDaAn()
				+ "**************************" + sumPangDuan
				+ "**************************" + daJuan.getXuanze1());
		return sumPangDuan;
	}

	public static int getListZhuGuans() {
		int sumZhuGuan = 0;
		return sumZhuGuan;
	}

	public static DaAnJuan getDaJuan() {
		return daJuan;
	}

	public static void setDaJuan(DaAnJuan daJuan) {
		TrueORfalse.daJuan = daJuan;
	}

	public static void setListZhuGuans(List<KeGuan> listZhuGuans) {
		TrueORfalse.listZhuGuans = listZhuGuans;
	}

	public static void setListXuanZes(List<XuanZe> listXuanZes) {
		TrueORfalse.listXuanZes = listXuanZes;
	}

	public static void setListPangDuans(List<PangDuan> listPangDuans) {
		TrueORfalse.listPangDuans = listPangDuans;
	}

}
