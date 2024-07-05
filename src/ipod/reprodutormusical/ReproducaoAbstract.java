/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipod.reprodutormusical;

/**
 *
 * @author tarci
 */
public class ReproducaoAbstract implements ReproducaoInterface{
    
    protected String nome;
    
    public ReproducaoAbstract(String nome){
        this.nome=nome; 
    }
    
    @Override
    public void tocar() {
        System.out.println("pausando" + nome);
    }

    @Override
    public void pausar() {
        System.out.println("pausando" + nome);
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionando" + nome);
    }
    
}
