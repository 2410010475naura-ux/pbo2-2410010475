/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NilaiTableModel extends AbstractTableModel {
    private List<NilaiMahasiswa> listNilai = new ArrayList<>();
    private final String[] namaKolom = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};

    @Override
    public int getRowCount() { return listNilai.size(); }

    @Override
    public int getColumnCount() { return namaKolom.length; }

    @Override
    public String getColumnName(int column) { return namaKolom[column]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NilaiMahasiswa mhs = listNilai.get(rowIndex);
        switch (columnIndex) {
            case 0: return mhs.getNpm();
            case 1: return mhs.getNama();
            case 2: return mhs.getTugas();
            case 3: return mhs.getUts();
            case 4: return mhs.getUas();
            case 5: return String.format(Locale.of("id", "ID"), "%.2f", mhs.getNilaiAkhir());
            case 6: return mhs.getHurufMutu();
            default: return null;
        }
    }

    public void tambahData(NilaiMahasiswa mhs) {
        listNilai.add(mhs);
        fireTableRowsInserted(listNilai.size() - 1, listNilai.size() - 1);
    }

    public void hapusSemuaData() {
        listNilai.clear();
        fireTableDataChanged();
    }

    public boolean isNpmAda(String npm) {
        for (NilaiMahasiswa mhs : listNilai) {
            if (mhs.getNpm().equals(npm)) return true;
        }
        return false;
    }

    public int getJumlahMahasiswa() {
        return listNilai.size();
    }

    public double getRataRataAkhir() {
        if (listNilai.isEmpty()) return 0.0;
        double total = 0;
        for (NilaiMahasiswa mhs : listNilai) {
            total += mhs.getNilaiAkhir();
        }
        return total / listNilai.size();
    }
}