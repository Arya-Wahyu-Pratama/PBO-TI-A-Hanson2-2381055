package branching;

public class IfStastement {
    public static void main(String[] args){
        scanner input = new scanner(source: system.in);
        system.out.println("Masukan nama hari (1-7 :");
        int nomerhari = input.nextInt();
                string namahari = "";
            if(nomerhari == 1){
                namahari = "Minggu";
            }
                else if(nomerhari == 2){
                    namahari = "senin";
                }
                    else if(nomerhari == 3){
                        namahari = "selasa";
                    }
                        else if(nomerhari == 4){
                            namahari = "Rabu";
                        }
                            else if(nomerhari == 5){
                                namahari = "Kamis";
                            }
                                else if(nomerhari == 6){
                                    namahari = "Jum'at";
                                } else if(nomerhari == 7){
                                        namahari = "sabtu";
                                    }
    }
}
