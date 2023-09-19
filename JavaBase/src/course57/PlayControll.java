package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {
	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);

		int toresu = 0;

		int ransu = rnd.nextInt(5) + 1;
		int ransu1 = rnd.nextInt(5) + 1;
		int ransu2 = rnd.nextInt(5) + 1;
		int ransu3 = rnd.nextInt(5) + 1;

		Player me = new Player();

		me.setKinryoku(ransu);
		me.setGakuryoku(ransu1);
		me.setMitame(ransu2);
		me.setOmosiro(ransu3);

		Target koku = new Target();

		int ransu4 = rnd.nextInt(11) + 3;
		int ransu5 = rnd.nextInt(11) + 3;
		int ransu6 = rnd.nextInt(11) + 3;
		int ransu7 = rnd.nextInt(11) + 3;

		for (int count = 0; count < 7; count++) {

			System.out.println("自分の現在のパラメータ");
			System.out.println(ransu);
			System.out.println(ransu1);
			System.out.println(ransu2);
			System.out.println(ransu3);

			System.out.println("トレーニングメニューを選んでください! 1.筋トレ　2.勉強　3.整形 4.人と喋る");
			int tore = stdIn.nextInt();
			if (tore == 1) {
				System.out.println("筋肉が１上がり" + (++ransu) + "になりました！");
				me.setKinryoku(ransu);
			} else if (tore == 2) {
				System.out.println("学力が１上がり" + (++ransu1) + "になりました！");
				me.setGakuryoku(ransu1);
			} else if (tore == 3) {
				System.out.println("見た目が１上がり" + (++ransu2) + "になりました！");
				me.setMitame(ransu2);
			} else if (tore == 4) {
				System.out.println("面白さが１上がり" + (++ransu3) + "になりました！");
				me.setOmosiro(ransu3);
			}

			System.out.println("♡相手が求めてる条件の一つ♡");
			int hituyou = rnd.nextInt(4) + 1;
			if (hituyou == 1) {
				System.out.println("相手は筋力" + ransu4 + "を求めています");
			} else if (hituyou == 2) {
				System.out.println("相手は学力" + ransu5 + "を求めています");
			} else if (hituyou == 3) {
				System.out.println("相手は見た目" + ransu6 + "を求めています");
			} else if (hituyou == 4) {
				System.out.println("相手は面白さ" + ransu7 + "を求めています");
			}

			System.out.println("※現在トレーニング" + (++toresu) + "回目");

		}
		System.out.println("告白します❤");
		System.out.println("どの能力で勝負しますか？");
		int kokuhaku=stdIn.nextInt();
		int winf=0;
		
		if(kokuhaku==1 && me.getKinryoku()>= koku.getHituyouKin()) {
			System.out.println("筋肉が条件を満たしています！");
			winf =winf+1;
		}else if(kokuhaku==2 && me.getGakuryoku()>= koku.getHituyouGaku()) {
			System.out.println("学力が条件を満たしています！");
			winf =winf+1;
		}else if(kokuhaku==3 && me.getMitame()>= koku.getHituyouMita()) {
				System.out.println("見た目が条件を満たしています！");
				winf =winf+1;
		}else if(kokuhaku==4 && me.getOmosiro()>= koku.getHituyouOmo()) {
			System.out.println("見た目が条件を満たしています！");
			winf =winf+1;
		}
			int randomp=rnd.nextInt(4);
			if(randomp==0 && me.getKinryoku()>=koku.getHituyouKin()) {
				winf=winf+1;
			}
	else if (randomp==1 && me.getGakuryoku()>=koku.getHituyouGaku()){
				winf=winf+1;
	
			}
	else if (randomp==2 && me.getMitame()>=koku.getHituyouMita()){
		winf=winf+1;
	}
		else if (randomp==3 && me.getOmosiro()>=koku.getHituyouOmo()){
			winf=winf+1;
			if(winf>1) {
				System.out.println("告白成功！！おめでとう！");
			}else {
				System.out.println("死亡しました...");
				
			}
	}
}
}

