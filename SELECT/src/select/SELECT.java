/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package select;

/**
 *
 * @author LenovoThinkPad T470s
 */
public class SELECT {
    
    public static void main(String[] args) {
        String entrada = "Esta consulta usa Select para filtrar os dados.";
        int posicao = encontrarSelect(entrada);
        if (posicao != -1) {
            System.out.println("Palavra-chave SELECT encontrada na posiCao: " + posicao);
        } else {
            System.out.println("Palavra-chave SELECT nao encontrada.");
        }
    }
    
    
    public static int encontrarSelect(String texto) {
        int tamanho = texto.length();
        for (int i = 0; i <= tamanho - 6; i++) {
            if ((texto.charAt(i)   == 'S' || texto.charAt(i)   == 's') &&
                (texto.charAt(i+1) == 'E' || texto.charAt(i+1) == 'e') &&
                (texto.charAt(i+2) == 'L' || texto.charAt(i+2) == 'l') &&
                (texto.charAt(i+3) == 'E' || texto.charAt(i+3) == 'e') &&
                (texto.charAt(i+4) == 'C' || texto.charAt(i+4) == 'c') &&
                (texto.charAt(i+5) == 'T' || texto.charAt(i+5) == 't')) {
                return i;
            }
        }
        return -1;
    }
}
