/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themis.themis;
import java.util.*;
/**
 *
 * @author Renan Alves Peregrino RA:00237721
 */
public class ComentariosProcessos {
    private int numAudiencia;
    private int numProcesso;
    public Date dataAudiencia;
    public String tribunal;
    public String vara;
    public String categoria;
    private String assunto;
    public String comentarios;
    public Date dataComentario;
    private String nomeEmpregador;
 

    public void comentariosProcesso(int anumProcesso, int anumAudiencia, Date adataAudiencia, String otribunal, String avara, String oassunto, String oscomentarios, Date adataComentario, String onomeEmpregador){
         Scanner coment = new Scanner(System.in);
            this.numProcesso = anumProcesso;
            this.numAudiencia = anumAudiencia;
            this.dataAudiencia = adataAudiencia;
            this.tribunal = otribunal;
            this.vara = avara;
            this.assunto = oassunto;
            this.comentarios = oscomentarios;
            this.dataComentario = adataComentario;
            this.nomeEmpregador = onomeEmpregador;
                
        
         
         System.out.println("O Processo:"+numProcesso);
         System.out.println("Com a Audiência"+numAudiencia);
         System.out.println("Com a data para : "+dataAudiencia);
         System.out.println("Do tribunal "+tribunal);
         System.out.println("Da Vara:"+vara);
         System.out.println("Do Empregador"+nomeEmpregador);
         System.out.println("A data deste comentário é: "+dataComentario);
         
        System.out.println("Escreva o comentário que deseja adicionar: ");
        comentarios = coment.nextLine();
       
    }

    public void indentificarComentario(int numProcesso, int numAudiencia, Date dataAudiencia, String tribunal, String vara, String assunto, String comentarios, Date dataComentario, String nomeEmpregador) {
        System.out.println("O comentário Feito foi:"+comentarios);
    }

    public void apagarComentario(String comentarios, Date dataComentario){
        System.out.println("O comentário foi apagado com sucesso");
    }
    
    }


