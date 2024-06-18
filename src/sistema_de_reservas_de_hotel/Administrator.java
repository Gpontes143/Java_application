/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_reservas_de_hotel;

/**
 *
 * @author gpont
 */
public class Administrator {
    private String Senha;
    private String Usuario;
    
    public Administrator(String Usuario, String Senha)
    {
       this.Usuario = Usuario;
       this.Senha = Senha;
    }
    
    public String getUsuario()
    {
        return Usuario;
    }
    
    public void setUsuario(String Usuario)
    {
        this.Usuario = Usuario;
    }
    
        public String getSenha()
    {
        return Senha;
    }
        
    public void setSenha(String Senha)
    {
        this.Senha = Senha;
    }
    
    
}
