public class Main {
    
    public static void main(String[]args){
        
        System.out.print("1 - 100 arasindaki asal sayilar: ");
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;
            
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            
            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }    
    }
}
