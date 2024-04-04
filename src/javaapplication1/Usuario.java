public class Usuario {
    public String usernome;

    public Usuario(String usernome) {
        this.usernome = usernome;
    }

    public void establecerRol() {
        Administrador admin = new Administrador();
        admin.trabajar();
    }

    public class Administrador {
        public void trabajar() {
            System.out.println("El usuario " + usernome +" Trabajando como administrador");
        }
    }
}
