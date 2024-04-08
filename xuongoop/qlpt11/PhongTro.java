package qlpt11;

import java.util.Scanner;

public class PhongTro {

    private int soPhong;
    private String tenChuPhong;
    private double soDienDaDung;
    private double soNuocDaDung;
    private double tienWifi;
    private double tienChiPhiPhong;
    Scanner sc = new Scanner(System.in);

    public PhongTro() {
    }

    public PhongTro(int soPhong, String tenChuPhong, double soDienDaDung, double soNuocDaDung, double tienWifi, double tienChiPhiPhong) {
        this.soPhong = soPhong;
        this.tenChuPhong = tenChuPhong;
        this.soDienDaDung = soDienDaDung;
        this.soNuocDaDung = soNuocDaDung;
        this.tienWifi = tienWifi;
        this.tienChiPhiPhong = tienChiPhiPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public String getTenChuPhong() {
        return tenChuPhong;
    }

    public double getSoDienDaDung() {
        if (soDienDaDung > 0 && soDienDaDung <= 50) {
            return (soDienDaDung * 1.549);
        } else if (soDienDaDung > 50 && soDienDaDung <= 100) {
            return soDienDaDung * 1.600;
        } else if (soDienDaDung > 100 && soDienDaDung <= 200) {
            return soDienDaDung * 1.858;
        } else if (soDienDaDung > 200 && soDienDaDung <= 300) {
            return soDienDaDung * 2.340;
        } else if (soDienDaDung > 300 && soDienDaDung <= 400) {
            return soDienDaDung * 2.615;
        } else {
            return soDienDaDung * 2.701;
        }
    }

    public double getTienWifi() {
        return tienWifi;
    }


    public double getSoNuocDaDung() {
        if (soNuocDaDung > 0 && soNuocDaDung <= 50) {
            return (soNuocDaDung * 1.549);
        } else if (soNuocDaDung > 50 && soNuocDaDung <= 100) {
            return soNuocDaDung * 1.600;
        } else if (soNuocDaDung > 100 && soNuocDaDung <= 200) {
            return soNuocDaDung * 1.858;
        } else if (soNuocDaDung > 200 && soNuocDaDung <= 300) {
            return soNuocDaDung * 2.340;
        } else if (soNuocDaDung > 300 && soNuocDaDung <= 400) {
            return soNuocDaDung * 2.615;
        } else {
            return soNuocDaDung * 2.701;
        }
    }

    public double getTienChiPhiPhong() {
        return getSoDienDaDung() + getSoNuocDaDung() + getTienWifi();
    }


    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public void setSoDienDaDung(double soDienDaDung) {
        this.soDienDaDung = soDienDaDung;
    }

    public void setSoNuocDaDung(double soNuocDaDung) {
        this.soNuocDaDung = soNuocDaDung;
    }

    public void setTenChuPhong(String tenChuPhong) {
        this.tenChuPhong = tenChuPhong;
    }

    public void setTienWifi(double tienWifi) {
        this.tienWifi = tienWifi;
    }

    public void setTienChiPhiPhong(double tienChiPhiPhong) {
        this.tienChiPhiPhong = tienChiPhiPhong;
    }



    public void Nhap() {
        System.out.print("Moi nhap so phong: ");
        soPhong = sc.nextInt();
        System.out.print("Moi nhap ten chu phong: ");
        tenChuPhong = new Scanner(System.in).nextLine();
        System.out.print("Moi nhap so dien da dung: ");
        soDienDaDung = sc.nextInt();
        System.out.print("Moi nhap so nuoc da dung: ");
        soNuocDaDung = sc.nextInt();
        System.out.print("Moi tien wifi: ");
        tienWifi = sc.nextInt();
    }


//    public void Nhap() {
//        System.out.print("Moi nhap so phong: ");
//        while (!sc.hasNextInt()) {
//            System.out.print("Moi nhap so phong la mot so nguyen: ");
//            sc.next();
//            // Đọc và loại bỏ giá trị không hợp lệ khỏi luồng đầu vào
//        }
//        soPhong = sc.nextInt();
//
//        do {
//            System.out.print("Moi nhap ten chu phong: ");
//            tenChuPhong = sc.nextLine();
//            if (!kiemTraDinhDangTen(tenChuPhong) || sc.hasNextLine()) {
//                System.out.print("Ten khong duoc chua ky tu dac biet va so:   ");
//            }
//        } while (!kiemTraDinhDangTen(tenChuPhong));
//    public void Nhap() {
//        System.out.print("Moi nhap so phong: ");
//        while (!sc.hasNextInt()) {
//            System.out.print("Moi nhap so phong la mot so nguyen: ");
//            sc.next();
//            // Đọc và loại bỏ giá trị không hợp lệ khỏi luồng đầu vào
//        }
// 
//        System.out.print("Moi nhap so dien da dung: ");
//        while (!sc.hasNextDouble()) {
//            System.out.print("Moi nhap so dien da dung la mot so thuc:  ");
//            sc.next();
//        }
//        soDienDaDung = sc.nextDouble();
//
//        System.out.print("Moi nhap so nuoc da dung: ");
//        while (!sc.hasNextDouble()) {
//            System.out.print("Moi nhap so nuoc da dung la mot so thuc:  ");
//            sc.next();
//        }
//        soNuocDaDung = sc.nextDouble();
//
//        System.out.print("Moi tien wifi: ");
//        while (!sc.hasNextDouble()) {
//            System.out.print("Moi nhap tien wifi la mot so thuc:  ");
//            sc.next();
//        }
//        tienWifi = sc.nextDouble();
//    }
//
//    public boolean kiemTraDinhDangTen(String ten) {
//        // Kiểm tra xem tên có chứa ký tự đặc biệt không
//        if (ten.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
//            return false; // Nếu tên chứa ký tự đặc biệt, trả về false
//        }
//
//        // Kiểm tra xem tên có rỗng không
//        if (ten.trim().isEmpty()) {
//            return false; // Nếu tên rỗng, trả về false
//        }
//
//        // Nếu tên không chứa ký tự đặc biệt và không rỗng, trả về true
//        return true;
//    }

    public double tinhTienTro() {
        return getTienChiPhiPhong();
    }

    public void Xuat() {
        System.out.println("Chu phong: "+getTenChuPhong() + "| So phong: "+getSoPhong()+"| Tien dien: "+getSoDienDaDung()+"| Tien nuoc: "+getSoNuocDaDung()+"| Tien wifi: "+getTienWifi());
    }
}

