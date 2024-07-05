/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipod.aparelhotelefonico;


public  class TelefoneAbstract implements TelefoneInterface {

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando o numero0" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.......");   
    }

    @Override
    public void iniciarChamadaDeVoz() {
        System.out.println("Correio de voz....... "); 
    }
    
    
}
