/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

public class NilaiMahasiswa {
    private String npm;
    private String nama;
    private int tugas;
    private int uts;
    private int uas;

    public NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {
        this.npm = npm;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNpm() { return npm; }
    public String getNama() { return nama; }
    public int getTugas() { return tugas; }
    public int getUts() { return uts; }
    public int getUas() { return uas; }

    public double getNilaiAkhir() {
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    public String getHurufMutu() {
        double akhir = getNilaiAkhir();
        if (akhir >= 80) return "A";
        if (akhir >= 75) return "B+";
        if (akhir >= 70) return "B";
        if (akhir >= 65) return "C+";
        if (akhir >= 60) return "C";
        if (akhir >= 40) return "D";
        return "E";
    }
}
