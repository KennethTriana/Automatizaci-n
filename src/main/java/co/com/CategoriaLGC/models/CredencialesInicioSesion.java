package co.com.CategoriaLGC.models;



public class CredencialesInicioSesion {

    private String email;

    private String contrasena;

    public String getEmail(){
        return email;
    }

    public String getContrasena(){
        return contrasena;
    }

    public String setEmail() { return email; }

    public String setContrasena() { return contrasena; }

    public CredencialesInicioSesion (String email, String contrasena){
        this.email = email;
        this.contrasena = contrasena;
    }
}
