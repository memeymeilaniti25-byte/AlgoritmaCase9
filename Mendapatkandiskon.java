public class Mendapatkandiskon {
    public static void main(String[] args) {
        Double totalPayment = 200000.00;
        Double diskon=0.00; 
        if(totalPayment > 200000.00){
            diskon=0.20;
            System.out.println("Selamat mendapatkan diskon 20%");
        }else if(totalPayment > 50000.00){
            diskon = 0.10;
            System.out.println("Selamat mendapatkan diskon 10%");
        }else{
            diskon = 0.00;
            System.out.println("Tidak mendapatkan diskon");
        }
        Double nilaiDiskon = totalPayment * diskon; 
        Double totalAkhir = totalPayment - nilaiDiskon;
        System.out.println("Pembayaran pertama : "+ totalPayment);
        System.out.println("Diskon didapat ("+(diskon *100+"%):"+nilaiDiskon));  
        System.out.println("Total Akhir : "+ totalAkhir); 
        }
    }        
            
        
    
    
    

