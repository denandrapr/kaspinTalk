package com.example.startfirestore;

public class Siswa {
    private String Nama;
    private String JenisKelamin;
    private int Kelas;
    private boolean Aktif;

    public Siswa(String nama, String jenisKelamin, int kelas, boolean aktif) {
        Nama = nama;
        JenisKelamin = jenisKelamin;
        Kelas = kelas;
        Aktif = aktif;
    }

    public String getNama() {
        return Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public int getKelas() {
        return Kelas;
    }

    public boolean isAktif() {
        return Aktif;
    }
}
