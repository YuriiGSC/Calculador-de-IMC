package me.yurii;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String genero;
		int idade;
		Double peso, altura;

		genero = JOptionPane.showInputDialog("Entre com seu sexo: masculino ou feminino");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com sua altura"));
		long imc = Math.round(peso / (altura * altura));
		if (genero.equals("masculino")) {

			if (imc < 15.6) {
				JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
						+ "\n Sua altura: " + altura + "\n Situação: MAGREZA" + "\n IMC: " + imc);
			} else {
				if (imc < 21.9) {
					JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
							+ "\n Sua altura: " + altura + "\n Situação: NORMAL" + "\n IMC: " + imc);
				} else {
					if (imc <= 25.3) {
						JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
								+ "\n Sua altura: " + altura + "\n Situação: SOBREPESO" + "\n IMC: " + imc);
					} else {
						if (imc > 25.3) {
							JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
									+ "\n Sua altura: " + altura + "\n Situação: OBESIDADE" + "\n IMC: " + imc);

						}
					}
				}
			}
		} else {
			if (genero.equals("feminino")) {

				if (imc < 16.4) {
					JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
							+ "\n Sua altura: " + altura + "\n Situação: MAGREZA" + "\n IMC: " + imc);
				} else {
					if (imc < 24.3) {
						JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
								+ "\n Sua altura: " + altura + "\n Situação: NORMAL" + "\n IMC: " + imc);
					} else {
						if (imc <= 28.3) {
							JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
									+ "\n Sua altura: " + altura + "\n Situação: SOBREPESO" + "\n IMC: " + imc);
						} else {
							if (imc > 28.3) {
								JOptionPane.showMessageDialog(null, " Seu genero: " + genero + "\n Seu peso: " + peso
										+ "\n Sua altura: " + altura + "\n Situação: OBESIDADE" + "\n IMC: " + imc);

							}
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "ERRO");
			}
		}
	}
}
