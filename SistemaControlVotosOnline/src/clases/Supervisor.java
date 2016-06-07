package clases;

/**
 * @author BuiltApp
 */
public class Supervisor {
    
    private String Login;
    private String pass;
    private String tipoSupervisor;

    public Supervisor() {
    }

    public Supervisor(String Login, String pass, String tipoSupervisor) {
        this.Login = Login;
        this.pass = pass;
        this.tipoSupervisor = tipoSupervisor;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipoSupervisor() {
        return tipoSupervisor;
    }

    public void setTipoSupervisor(String tipoSupervisor) {
        this.tipoSupervisor = tipoSupervisor;
    }

    
    
}
