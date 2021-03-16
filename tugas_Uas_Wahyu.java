/*
*	Nama	: Wahyudi Lubis
*	NIM		: 202013043
*	Prodi	: TIF 1B
*	Makul	: Algoritma
*
*/

import java.util.*;
public class tugas_Uas_Wahyu{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println();
		System.out.println("\t\t\t\t\t\t=======================================");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=        Projek UAS Semester 1        =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=/////////////////////////////////////=");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=         Program kumpulan            =");
		System.out.println("\t\t\t\t\t\t=         Luas Bangun Ruang           =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=======================================");  
		System.out.println();
		login();

	}
// Masukkan Username dan Password

		static void login(){
		String data[]={"Wahyu","202013043"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data yang sudah kita inputkan di atas
		 */
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("=============================================");
			System.out.println("=                                           =");
			System.out.println("=            Selamat Datang Di              =");
			System.out.println("=         Program Menghitung Bangun         =");
			System.out.println("=                  Ruang                    =");
			System.out.println("=                                           =");
			System.out.println("=============================================");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println("Maaf Username atau Password yang Anda Masukkan Salah");
			System.out.println("Silahkan Masukkan Username dan Password Anda Kembali");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			login();
		}
		
		
	}

// Pemilihan di menu awal

	static void menu(){
		
		String menu_utama[]={"Mulai Program","Biodata Pemrogram","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			biodata();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Berhitung");
			System.out.println("Sistem Sekarang Akan keluar");
			System.out.println("Keluar Dari Sistem");
			System.exit(0);
		}
	}

// Pemilihan bangun ruang yang ingin dihitung

	static void mulai(){

		int daftar_bangun;
		String bangun_datar[]={"Luas Lingkaran","Luas Persegi Panjang","luas Jajar Genjang","luas Bujur Sangkar","luas Trapesium","luas Segitiga","luas Belah Ketupat","luas Layang layang","Luas semua Bangun Datar","keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_datar[0]);
		System.out.println("2. "+bangun_datar[1]);
		System.out.println("3. "+bangun_datar[2]);
		System.out.println("4. "+bangun_datar[3]);
		System.out.println("5. "+bangun_datar[4]);
		System.out.println("6. "+bangun_datar[5]);
		System.out.println("7. "+bangun_datar[6]);
		System.out.println("8. "+bangun_datar[7]);
		System.out.println("9. "+bangun_datar[8]);
		System.out.println("10. "+bangun_datar[9]);

		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :
					
				System.out.println();
				System.out.println("=======================================");
				System.out.println("=                                     =");
				System.out.println("=       Menghitung luas lingkaran     =");
				System.out.println("=                                     =");
				System.out.println("=======================================");
				System.out.println();
				System.out.print("\tMasukkan jari jari = ");

				double phi=3.14;
				double r,luas_lingkaran;

   			 	Scanner masukkan_jariJari=new Scanner(System.in);
				r=masukkan_jariJari.nextDouble();

				luas_lingkaran=phi*r*r;

				System.out.println();
				System.out.println("\tluas lingkaran adalah "+luas_lingkaran );
				System.out.println();
				System.out.println("\tjadi luas lingkaran adalah"+luas_lingkaran);
				System.out.println("\t==Dan perhitungan luas lingkaran selesai==");
	   		    next();
						// System.out.println("Proses Menghitung Telah Selesai");
				break;

			case 2:

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=  Menghitung Luas Persegi Panjang    =");
					System.out.println("=                                     =");
					System.out.println("=======================================");

					double p,l,luas_persegi_panjang;
					System.out.println();
					System.out.print("\tMasukkan Panjang persegi panjang = ");
					Scanner masukkan_Panjang=new Scanner(System.in);
					p=masukkan_Panjang.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan lebar persegi panjang = ");
					Scanner masukkan_Lebar=new Scanner(System.in);
					l=masukkan_Lebar.nextDouble();

					luas_persegi_panjang= p*l;

					System.out.println();
					System.out.println("\tluas Persegi Panjang adalah "+luas_persegi_panjang  );
					System.out.println();
					System.out.println("\tjadi Luas Persegi panjang adalah"+luas_persegi_panjang);
					System.out.println("\t ======Dan perhitungan selesai======="  );
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 3 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=  Menghitung Luas Jajar Genjang      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double e,tt,luas_jajar_Genjang;
					System.out.print("\tMasukkan Luas Alas = ");
					Scanner masukkan_alas_jajar_Genjang=new Scanner(System.in);
					e=masukkan_alas_jajar_Genjang.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner masukkan_tinggi_jajar_Genjang=new Scanner(System.in);
					tt=masukkan_tinggi_jajar_Genjang.nextDouble();

					luas_jajar_Genjang=e*tt;

					System.out.println();
					System.out.println("\tluas jajar Genjang adalah "+luas_jajar_Genjang);
					System.out.println("");
					System.out.println("\t jadi luas jajar Genjang adalah"+luas_jajar_Genjang);
					System.out.println("\t======= Dan Perhitungan luas Selesai============= ");
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 4 :

					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Luas Bujur Sangkar        =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();

					double s1,s2,luas_bujur_Sangkar;
					System.out.print("\tMasukkan sisi1 = ");
					Scanner masukkan_sisi1=new Scanner(System.in);
					s1=masukkan_sisi1.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan Sisi2 = ");
					Scanner masukkan_sisi2=new Scanner(System.in);
					s2=masukkan_sisi2.nextDouble();

					luas_bujur_Sangkar=s1*s2;

					System.out.println();
					System.out.println("\tluas Bujur Sangkar adalah"+luas_bujur_Sangkar);
					System.out.println("");
					System.out.println("\tJadi luas_bujur_Sangkar adalah"+luas_bujur_Sangkar);
					System.out.println("\t==== Dan perhitungan selesai=========");
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 5 :


					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=          Luas Trapesium              =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double a,b,t,luas_Trapesium;
					System.out.print("\tMasukkan alas atas Trapesium = ");
					Scanner masukkan_luas_atas_Trapesium=new Scanner(System.in);
					a=masukkan_luas_atas_Trapesium.nextDouble();
					System.out.print("\tMasukkan alas bawah Trapesium = ");
					Scanner masukkan_luas_bawah_Trapesium=new Scanner(System.in);
					b=masukkan_luas_bawah_Trapesium.nextDouble();
					System.out.print("\tMasukkan tinggi Trapesium = ");
					Scanner masukkan_tinggi_Trapesium=new Scanner(System.in);
					t=masukkan_tinggi_Trapesium.nextDouble();

					luas_Trapesium=((a+b/2)*t);

					System.out.println();
					System.out.println("\t luas Trapesium adalah "+luas_Trapesium);
					System.out.println();
					System.out.println("\tjadi luas Trapesium adalah"+luas_Trapesium);
					System.out.println("\tProses Menghitung luas trapesium Selesai");
					next();

					break;


			case 6 :

				
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=          Luas Segitiga             =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double aa,tT,luas_Segitiga;
					System.out.print("\tMasukkan alas Segitiga = ");
					Scanner masukkan_alas_Segitiga =new Scanner(System.in);
					aa=masukkan_alas_Segitiga.nextDouble();
					System.out.print("\tMasukkan tinggi Segitiga = ");
					Scanner masukkan_tinggi_Segitiga=new Scanner(System.in);
					tT=masukkan_tinggi_Segitiga.nextDouble();
					
					luas_Segitiga=aa*tT/2;

					System.out.println();
					System.out.println("\t luas Segitiga adalah "+luas_Segitiga);
					System.out.println();
					System.out.println("\tjadi luas Trapesium adalah"+luas_Segitiga);
					System.out.println("\tProses Menghitung luas Segitiga Selesai");
					next();

					break;

			case 7 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=         Luas Belah Ketupat          =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double d1,d2,luas_Belah_Ketupat;
					System.out.print("\tMasukkan Diagonal 1 = ");
					Scanner masukkan_Diagonal1 =new Scanner(System.in);
					d1=masukkan_Diagonal1.nextDouble();
					System.out.print("\tMasukkan Diagonal 2 = ");
					Scanner masukkan_Diagonal2=new Scanner(System.in);
					d2=masukkan_Diagonal2.nextDouble();
					
					luas_Belah_Ketupat=d1*d2/2;

					System.out.println();
					System.out.println("\t luas Belah Ketupat adalah "+luas_Belah_Ketupat);
					System.out.println();
					System.out.println("\tjadi luas Belah Ketupat adalah"+luas_Belah_Ketupat);
					System.out.println("\tProses Menghitung luas Belah Ketupat Selesai");
					next();

					break;
			
			case 8 :


					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=         Luas Layang Layang          =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double da1,da2,luas_Layang_Layang;
					System.out.print("\tMasukkan Diagonal 1 = ");
					Scanner masukkan_Diagonall1 =new Scanner(System.in);
					da1=masukkan_Diagonall1.nextDouble();
					System.out.print("\tMasukkan Diagonal 2 = ");
					Scanner masukkan_Diagonall2=new Scanner(System.in);
					da2=masukkan_Diagonall2.nextDouble();
					
					luas_Layang_Layang=da1*da2/2;

					System.out.println();
					System.out.println("\t luas Layang layang adalah "+luas_Layang_Layang);
					System.out.println();
					System.out.println("\tjadi Layang layang Ketupat adalah"+luas_Layang_Layang);
					System.out.println("\tProses Menghitung luas Layang layang Selesai");
					next();

					break;

			case 9 :
				
				//luas lingkaran
					System.out.println();
				System.out.println("=======================================");
				System.out.println("=                                     =");
				System.out.println("=       Menghitung luas lingkaran     =");
				System.out.println("=                                     =");
				System.out.println("=======================================");
				System.out.println();
				System.out.print("\tMasukkan jari jari = ");

				double phi1=3.14;
				double r1,luas_lingkaran1;

   			 	Scanner masukkan_jariJari1=new Scanner(System.in);
				r1=masukkan_jariJari1.nextDouble();

				luas_lingkaran1=phi1*r1*r1;

				System.out.println();
				System.out.println("\tluas lingkaran adalah "+luas_lingkaran1 );
				System.out.println();
				System.out.println("\tjadi luas lingkaran adalah"+luas_lingkaran1);
				System.out.println("\t==Dan perhitungan luas lingkaran selesai==");

			// luas Persegi Panjang

				System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=  Menghitung Luas Persegi Panjang    =");
					System.out.println("=                                     =");
					System.out.println("=======================================");

					double p1,l1,luas_persegi_panjang1;
					System.out.println();
					System.out.print("\tMasukkan Panjang persegi panjang = ");
					Scanner masukkan_Panjang1=new Scanner(System.in);
					p1=masukkan_Panjang1.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan lebar persegi panjang = ");
					Scanner masukkan_Lebar1=new Scanner(System.in);
					l1=masukkan_Lebar1.nextDouble();

					luas_persegi_panjang1= p1*l1;

					System.out.println();
					System.out.println("\tluas Persegi Panjang adalah "+luas_persegi_panjang1  );
					System.out.println();
					System.out.println("\tjadi Luas Persegi panjang adalah"+luas_persegi_panjang1);
					System.out.println("\t ======Dan perhitungan selesai======="  );

				// luas jajargenjang

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=  Menghitung Luas Jajar Genjang      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double a1,t1,luas_jajar_Genjang1;
					System.out.print("\tMasukkan Luas Alas = ");
					Scanner masukkan_alas_jajar_Genjang1=new Scanner(System.in);
					a1=masukkan_alas_jajar_Genjang1.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner masukkan_tinggi_jajar_Genjang1=new Scanner(System.in);
					t1=masukkan_tinggi_jajar_Genjang1.nextDouble();

					luas_jajar_Genjang1=a1*t1;

					System.out.println();
					System.out.println("\tluas jajar Genjang adalah "+luas_jajar_Genjang1);
					System.out.println("");
					System.out.println("\t jadi luas jajar Genjang adalah"+luas_jajar_Genjang1);
					System.out.println("\t======= Dan Perhitungan luas Selesai============= ");

			// luas Bujur Sangkar
					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Luas Bujur Sangkar        =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();

					double s11,s21,luas_bujur_Sangkar1;
					System.out.print("\tMasukkan sisi1 = ");
					Scanner masukkan_sisi11=new Scanner(System.in);
					s11=masukkan_sisi11.nextDouble();
					System.out.println();
					System.out.print("\tMasukkan Sisi2 = ");
					Scanner masukkan_sisi21=new Scanner(System.in);
					s21=masukkan_sisi21.nextDouble();

					luas_bujur_Sangkar1=s11*s21;

					System.out.println();
					System.out.println("\tluas Bujur Sangkar adalah"+luas_bujur_Sangkar1);
					System.out.println("");
					System.out.println("\tJadi luas_bujur_Sangkar adalah"+luas_bujur_Sangkar1);
					System.out.println("\t==== Dan perhitungan selesai=========");

			//Luas Trapesium

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=          Luas Trapesium              =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double aA1,b1,tT1,luas_Trapesium1;
					System.out.print("\tMasukkan alas atas Trapesium = ");
					Scanner masukkan_luas_atas_Trapesium1=new Scanner(System.in);
					aA1=masukkan_luas_atas_Trapesium1.nextDouble();
					System.out.print("\tMasukkan alas bawah Trapesium = ");
					Scanner masukkan_luas_bawah_Trapesium1=new Scanner(System.in);
					b1=masukkan_luas_bawah_Trapesium1.nextDouble();
					System.out.print("\tMasukkan tinggi Trapesium = ");
					Scanner masukkan_tinggi_Trapesium1=new Scanner(System.in);
					tT1=masukkan_tinggi_Trapesium1.nextDouble();

					luas_Trapesium1=((aA1+b1/2)*tT1);

					System.out.println();
					System.out.println("\t luas Trapesium adalah "+luas_Trapesium1);
					System.out.println();
					System.out.println("\tjadi luas Trapesium adalah"+luas_Trapesium1);
					System.out.println("\tProses Menghitung luas trapesium Selesai");

			//luas Segitiga

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=          Luas Segitiga             =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double aB1,tA1,luas_Segitiga1;
					System.out.print("\tMasukkan alas Segitiga = ");
					Scanner masukkan_alas_Segitiga1 =new Scanner(System.in);
					aB1=masukkan_alas_Segitiga1.nextDouble();
					System.out.print("\tMasukkan tinggi Segitiga = ");
					Scanner masukkan_tinggi_Segitiga1=new Scanner(System.in);
					tA1=masukkan_tinggi_Segitiga1.nextDouble();
					
					luas_Segitiga1=aB1*tA1/2;

					System.out.println();
					System.out.println("\t luas Segitiga adalah "+luas_Segitiga1);
					System.out.println();
					System.out.println("\tjadi luas Trapesium adalah"+luas_Segitiga1);
					System.out.println("\tProses Menghitung luas Segitiga Selesai");

			// Luas Belah Ketupat

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=         Luas Belah Ketupat          =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double d11,d21,luas_Belah_Ketupat1;
					System.out.print("\tMasukkan Diagonal 1 = ");
					Scanner masukkan_Diagonal11 =new Scanner(System.in);
					d11=masukkan_Diagonal11.nextDouble();
					System.out.print("\tMasukkan Diagonal 2 = ");
					Scanner masukkan_Diagonal21=new Scanner(System.in);
					d21=masukkan_Diagonal21.nextDouble();
					
					luas_Belah_Ketupat1=d11*d21/2;

					System.out.println();
					System.out.println("\t luas Belah Ketupat adalah "+luas_Belah_Ketupat1);
					System.out.println();
					System.out.println("\tjadi luas Belah Ketupat adalah"+luas_Belah_Ketupat1);
					System.out.println("\tProses Menghitung luas Belah Ketupat Selesai");


			// luas layang layang

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=         Luas Layang Layang          =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					double di11,di21,luas_Layang_Layang1;
					System.out.print("\tMasukkan Diagonal 1 = ");
					Scanner masukkan_Diiagonal11 =new Scanner(System.in);
					di11=masukkan_Diiagonal11.nextDouble();
					System.out.print("\tMasukkan Diagonal 2 = ");
					Scanner masukkan_Diiagonal21=new Scanner(System.in);
					di21=masukkan_Diiagonal21.nextDouble();
					
					luas_Layang_Layang1=di11*di21/2;

					System.out.println();
					System.out.println("\t luas Layang layang adalah "+luas_Layang_Layang1);
					System.out.println();
					System.out.println("\tjadi Layang layang Ketupat adalah"+luas_Layang_Layang1);
					System.out.println("\tProses Menghitung luas Layang layang Selesai");
					System.out.println();
					System.out.println();
					System.out.println("========================================================");
					System.out.println("\tsistem Pengurutan Seluruh Program Luas Bangun datar");
					System.out.println("\tdari data yang terendah sampai data yang paling besar");		



				  double luas[]={luas_lingkaran1,luas_persegi_panjang1,luas_jajar_Genjang1,luas_bujur_Sangkar1,luas_Trapesium1,luas_Segitiga1,luas_Belah_Ketupat1,luas_Layang_Layang1};//array
					double penampung=0;

	
					for(int x=0; x<(luas.length); x++){
						for(int i=0; i<(luas.length-1); i++){
						if(luas[i]>luas[i+1]){
						penampung=luas[i];
						luas[i]=luas[i+1];
						luas[i+1]=penampung;
					}
				 }
						System.out.print(x+1+" = ");
						for(int y=0; y<luas.length; y++){
						System.out.print(luas[y]+"  ");
					}
						System.out.println();
				}

					System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<luas.length; i++){
					System.out.print(luas[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();

					break;

			case 10 :

					System.out.println();
					System.out.println("============================================");
					System.out.println("                                            ");
					System.out.println("\tTerimakasih telah berkunjung di aplikasi  ");
					System.out.println("\t\tkumpulan pemrograman luas bangun datar  ");
					System.out.println("\t\t\t\t\t\tSemoga dapat membantu           ");
					System.out.println("                                            ");
					System.out.println("============================================");
					System.exit(0);

			default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					System.exit(0);

		}
	}

// Biodata Pemrogram

	static void biodata(){

		System.out.println("Biodata");
		System.out.println();
		System.out.println("\tNama      : Wahyudi Lubis");
		System.out.println("\tTTL       : Madina, 27 Desember 1999");
		System.out.println("\tUmur      : 21 Tahun");
		System.out.println("\tFakultas  : TIF 1B Politeknik Kampar");
		System.out.println("\tStatus    : Mahasiswa (Aktif)");
		System.out.println();
		System.out.println("\tSekian Dan Terima Kasih");
	}

	static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("Apakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			mulai();
		}else{
			penutup();
		}

	}
	static void penutup(){

		System.out.println();
		System.out.println("\tTerima Kasih Telah Berhitung");
		System.out.println("\tProses Telah Selesai");
		System.out.println("\tKeluar Dari Sistem");
	}	
}
