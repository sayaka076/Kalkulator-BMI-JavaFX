package com.mycompany.kalkulatorbmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtTinggi;

    @FXML
    private TextField txtBerat;

    @FXML
    private Button btnHitung;

    @FXML
    private Button btnReset;

    @FXML
    private Label lblSkorBmi;

    @FXML
    private Label lblKategori;

    @FXML
    private void hitungBmi(ActionEvent event) {
        String inputTinggi = txtTinggi.getText().trim().replace(",", ".");
        String inputBerat = txtBerat.getText().trim().replace(",", ".");

        if (inputTinggi.isEmpty() || inputBerat.isEmpty()) {
            tampilkanError("Harap isi tinggi & berat badan!");
            return;
        }

        try {
            double tinggiCm = Double.parseDouble(inputTinggi);
            double beratKg = Double.parseDouble(inputBerat);

            if (tinggiCm <= 0 || beratKg <= 0) {
                tampilkanError("Nilai harus lebih dari 0!");
                return;
            }

            // Konversi tinggi dari cm ke meter
            double tinggiMeter = tinggiCm / 100.0;

            // Rumus BMI
            double bmi = beratKg / (tinggiMeter * tinggiMeter);

            // Tampilkan skor dengan 1 angka di belakang koma
            lblSkorBmi.setText(String.format("%.1f", bmi));

            // Tentukan kategori dan warna aksen teks
            if (bmi < 18.5) {
                lblKategori.setText("Berat Badan Kurang (Underweight)");
                lblKategori.setStyle("-fx-text-fill: #fbbf24;"); // Kuning Amber
            } else if (bmi < 25.0) {
                lblKategori.setText("Normal (Ideal)");
                lblKategori.setStyle("-fx-text-fill: #4ade80;"); // Hijau Cerah
            } else if (bmi < 30.0) {
                lblKategori.setText("Berat Badan Lebih (Overweight)");
                lblKategori.setStyle("-fx-text-fill: #fb923c;"); // Oranye
            } else {
                lblKategori.setText("Obesitas (Obesity)");
                lblKategori.setStyle("-fx-text-fill: #ef4444;"); // Merah Terang
            }

        } catch (NumberFormatException e) {
            tampilkanError("Input hanya boleh berupa angka!");
        }
    }

    @FXML
    private void resetForm(ActionEvent event) {
        txtTinggi.clear();
        txtBerat.clear();
        lblSkorBmi.setText("--.-");
        lblKategori.setText("Masukkan tinggi & berat badan");
        lblKategori.setStyle("-fx-text-fill: #ef4444;");
        txtTinggi.requestFocus();
    }

    private void tampilkanError(String pesan) {
        lblSkorBmi.setText("!");
        lblKategori.setText(pesan);
        lblKategori.setStyle("-fx-text-fill: #f87171;");
    }
}