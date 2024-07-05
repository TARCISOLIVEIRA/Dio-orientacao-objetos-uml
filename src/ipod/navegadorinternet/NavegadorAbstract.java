/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipod.navegadorinternet;

/**
 *
 * @author tarci
 */
public abstract class NavegadorAbstract implements NavegadorInterface {

    @Override
    public void exibirPagina() {
        System.out.println("exibindo página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
    
}
