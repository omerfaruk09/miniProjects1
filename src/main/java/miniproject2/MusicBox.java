package miniproject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicBox extends Methods {

    public static void main(String[] args) {
         /*
        Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
        Kullanıcılar, çalma listelerine şarkı ekleyebilmeli,
        şarkıları sıralayabilmeli ve
        şarkıları listeden silebilmelidir.
        Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
        Bir metot class i olustur ve incheritance ile bu metotları kullanarak kodlarını güncelle.
    */
        Scanner input = new Scanner(System.in);
        List<String> songList = new ArrayList<>();
        Methods methods01 = new Methods();

        System.out.println("My Song List");

        songList.add("BARİS MANCO  GULPEMBE");
        songList.add("NESET ERTAS GONUL DAGI");
        songList.add("ASIK VEYSEL UZUN INCE BIR YOLDAYIM");
        songList.add("CEM KARACA DENIZ USTU KOPURUR");
        songList.add("ASIK MAHSUNİ SERİF SARHOS");
        songList.add("MUSA EROGLU MIHRIBAN");
        int i = 1;
        for (String w : songList) {
            System.out.println(i + ". " + w);
            i++;
        }
        System.out.println("------------------------------------------");
        int choose;
        do {
            System.out.println("1.Add Song\n" + "2.Sort to List\n" + "3.Delete Song\n" +
                    "4.Delete List\n" + "5.Exit\n" + "What do you want to list?");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Please enter a song name");
                    input.nextLine();
                    String songName = input.nextLine().toUpperCase();
                    methods01.Add(songList, songName);
                    break;
                case 2:
                    methods01.sort(songList);
                    break;
                case 3:
                    System.out.println("Please enter the song name to be deleted");
                    input.nextLine();
                    String deleteSongName = input.nextLine().toUpperCase();
                    methods01.Delete(songList, deleteSongName);
                    break;
                case 4:
                    methods01.deleteList(songList);
                    break;
                case 5:
                    System.out.println("Good bye..");
                    break;
                default:
                    System.out.println("Wrong choose. Please enter a given a list number");
                    System.out.println("----------------------------");
            }


        } while (choose != 5);


    }
}