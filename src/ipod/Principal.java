/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipod;


public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        AparelhoMultiUso ap = new AparelhoMultiUso();
        
        System.out.println("###############");
        ap.selecionarMusica("Itamaraca cidade maravilhosa");
        ap.tocar();
        ap.pausar();
        
        System.out.println("################");
        ap.atender();
        ap.iniciarChamadaDeVoz();
        ap.ligar(343330434);
        
        System.out.println("################");
        ap.exibirPagina();
        ap.atualizarPagina();
        ap.adicionarPagina();
        System.out.println("======= F I M   D O   P R O G R A M A ==========");
        
    }
    
}
