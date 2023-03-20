public class Reto3 {
    public static void main(String[] args) {
        String[][] numero={{"Esc","f1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","power","sleep","wake up"," "," "," "," "," "," "},
        {"°","1","2","3","4","5","6","7","8","9","0","?","¿","<--","impr pant","bloq despl","pause inter ","blo qnum ","/","*","-"," "},
        {"-->|","Q","W","E","R","T","Y","U","I","O","P","[","]","enter","insert","inicio","re pag","7","8","9","+"," "},
        {"blocqmay","A","S","D","F","G","H","J","K","L","Ñ","{","}"," ","fin","supr","av pag","4","5","6"," "," "},
        {"shit","<>","Z","X","C","V","B","N","M",",",".","-","shit  "," ","arriba"," ","1","2","3","intro"," "},
        {"ctrl","windows","alt"," "," "," ","espacio"," "," "," ","altgr","windows","co","ctrl","<--","abajo","-->","0",".",""," "," "}};

        for(int i=0;i<6;i++){
            for(int j=0;j<21;j++){
                System.out.print(numero[i][j]+"\t");
            }
        }
        System.out.print(" ");
    }
}
