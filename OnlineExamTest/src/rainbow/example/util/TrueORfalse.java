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
		
		if (daJuan.getXuanze1() == listXuanZes.get(0).getDaAn()) {
			sumXuanZe += 2;
		}
		System.out.println(listXuanZes.get(0).getDaAn()+"**************************"+sumXuanZe+"**************************"+daJuan.getXuanze1()
				);
		return sumXuanZe;
	}

	public static int getListPangDuans() {
		int sumPangDuan = 0;
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
