package branching;

public class SwicthStatement {
    public static void main(String[] args){
        scanner input = new scanner(source: system.in);
        system.out.println("Masukan nama hari (1-7 :");
        int nomerhari = input.nextInt();
        string namahari = "";
        switch(nomerhari){
            case 1:
                namahari = "Minggu";
                break;
            case 2:
                namahari = "Senin";
                break;
            case 3:
                namahari = "Selasa";
                break;
            case 4:
                namahari = "Rabu";
                break;
            case 5:
                namahari = "Kamis";
                break;
            case 6:
                namahari = "Jum'at";
                break;
            case 7:
                namahari = "Sabtu";
                break;
            default:
                system.out.println("Masukan nome antar 1 -7");
                system.exit(Max 8);


        }
    }
}
