//public class Main4 {
//    public static void main(String[] args){
//
//        String str="2D10+10";
//        System.out.println("typ kostki to: "+kostka(str));
//    }
//
//    static void kostka(String str) {
//        StringBuilder typKostki = new StringBuilder();
//        String rodzajKostki = "";
//        int liczbaRzutkow;
//        if(indexD(str)==0){
//            System.out.println("liczba rzutow wynosi 1");
//        }else {
//            liczbaRzutkow = Integer.parseInt(str.substring(0, indexD(str)));
//            System.out.println("liczba rzutow wynosi: " + liczbaRzutkow);
//        }
//
//        int modyfikator = 0;
//
//
//
//
//        typKostki.append("rodzaj kostki to "+rodzajKostki+"ilosc rzutow "+liczbaRzutkow+ "modyfikator "+modyfikator);
//       // return typKostki.toString();
//    }
//
//        static int indexD(String str) {
//            int index=0;
//            for(int i=0; i<str.length() ; i++){
//                if (str.charAt(i)=='D'){
//                    index=i;
//                }
//            }
//            return index;
//        }
//
//
//
//
//
//
//
//
//}
