/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipod;

import ipod.aparelhotelefonico.TelefoneInterface;
import ipod.navegadorinternet.NavegadorInterface;
import ipod.reprodutormusical.ReproducaoInterface;

/**
 *
 * @author tarci
 */
public class AparelhoMultiUso implements NavegadorInterface, ReproducaoInterface, TelefoneInterface {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina.......");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina..... ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina....");
    }

    @Override
    public void tocar() {
        System.out.println("tocando a musica ......" );
    }

    @Override
    public void pausar() {
        System.out.println("pausando a musica ....");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecione a musica ..... " + nome);
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando...."+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo....:");
    }

    @Override
    public void iniciarChamadaDeVoz() {
        System.out.println("chamando.....: ");
    }
    
    
    
}
