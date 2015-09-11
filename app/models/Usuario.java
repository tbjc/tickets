package models;

import com.avaje.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Project entity managed by Ebean
 */
@Entity
public class Usuario extends Model {


    @Id
    public Long id;

    @Column(unique = true)
    public String userName;

    private String nombreCompleto;

    private String password;

    //private String codigoSeguridad;

    private String preguntaSecreta;

    private String respuestaSecreta;

    private String perfil;

    private String email;

    /*@ManyToOne
    private Distrito distrito;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /*public String getCodigoSeguridad() {
        return codigoSeguridad;
    }*/

    /*public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = BCrypt.hashpw(codigoSeguridad, BCrypt.gensalt());
    }*/

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /*public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }*/

    public String getPreguntaSecreta() {
        return preguntaSecreta;
    }

    public void setPreguntaSecreta(String preguntaSecreta) {
        this.preguntaSecreta = preguntaSecreta;
    }

    public String getRespuestaSecreta() {
        return respuestaSecreta;
    }

    public void setRespuestaSecreta(String respuestaSecreta) {
        this.respuestaSecreta = respuestaSecreta;
    }

    public static final Finder<Long, Usuario> find = new Finder<Long, Usuario>(Long.class, Usuario.class);


    /**
     * Authenticate a User.
     */
    public static Usuario authenticate(String nameUser, String password) {//, String codigoSeguridad
        Usuario user = Usuario.find.where().eq("userName", nameUser).findUnique();
        /*if ((user != null && BCrypt.checkpw(password, user.getPassword())) && (user != null && BCrypt.checkpw(codigoSeguridad, user.getCodigoSeguridad()))) {
            return user;
        } else {
            return null;
        }*/
        if(user!=null){
            if (BCrypt.checkpw(password, user.getPassword())){
                return user;
            }
        }
        return null;
    }

    /*@Override
    public List<? extends Role> getRoles(){
        return roles;
    }


    public void setRoles(List<SecurityRole> roles){
        this.roles = roles;
    }

    @Override
    public List<? extends Permission> getPermissions(){
        return permissions;
    }*/

    public String getIdentifier(){
        return userName;
    }

    public static Usuario findByUserName(String userName)
    {
        return find.where()
                .eq("userName",
                        userName)
                .findUnique();
    }


    public static Usuario findById(Long id)
    {
        return find.where()
                .eq("id",
                        id)
                .findUnique();
    }

    public static void crearAdmin(){
        Usuario user = Usuario.find.where().eq("userName", "admin").findUnique();
        if(user==null){
            Usuario usuario = new Usuario();
            usuario.setUserName("admin");
            usuario.setNombreCompleto("Administrador de Sistema");
            usuario.setPassword("secret");
            //usuario.setCodigoSeguridad("secret");
            usuario.setEmail("contacto@evomatik.com");
            usuario.save();
            play.Logger.debug("El administrador a sido creado");
        }

    }

    /**
     * Return a page of Usuarios
     *
     * @param page Page to display
     * @param pageSize Number of usuarios per page
     * @param sortBy usuario property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */

    /*public static Page<Usuario> page(int page, int pageSize, String sortBy, String order, String filter) {
        return find.where()
                .disjunction()
                .ilike("distrito.distrito", "%" + filter + "%")
                .ilike("nombreCompleto", "%" + filter + "%")
                .ilike("userName", "%" + filter + "%")
                .endJunction()
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .getPage(page);
    }*/

    /*public static Map<String,String> optionsPerfil(){
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        options.put("admin", "admin");
        options.put("Asesor Jurídico", "Asesor Jurídico");
        options.put("Abogado Defensor", "Abogado Defensor");
        options.put("Autorizador de Representación","Autorizador de Representación");
        options.put("Supervisor", "Supervisor");
        options.put("Receptor de Solicitud", "Receptor de Solicitud");
        options.put("Autorizador de Conclusión de Representación", "Autorizador de Conclusión de Representación");
        options.put("Autorizador de Defensa","Autorizador de Defensa");
        options.put("Turnador de Defensa","Turnador de Defensa");
        options.put("Turnador de Representación","Turnador de Representación");
        options.put("Receptor Estudio Socioeconómico","Receptor Estudio Socioeconómico");
        return options;
    }*/


    /*public static Map<String,String> listaDefensores(String userName) {
        Usuario user = Usuario.findByUserName(userName);

        String sql  = "select usuario.user_name,usuario.nombre_completo, (SELECT COUNT(*) FROM defensa WHERE defensa.usuario_id=usuario.id) as num_defensas ";
        sql += "from usuario ";
        sql += "left outer join usuario_security_role  on usuario_security_role.usuario_id = usuario.id ";
        sql += "left outer join security_role on security_role.id = usuario_security_role.security_role_id  ";
        sql += "join usuario_security_role u1z_ on u1z_.usuario_id = usuario.id  ";
        sql += "join security_role u1 on u1.id = u1z_.security_role_id ";
        sql += "left outer join distrito on distrito.id = usuario.distrito_id  ";
        sql += "where u1.name = 'abogadodefensor' ";
        sql += "and distrito.distrito = '"+user.getDistrito().getDistrito()+"' ";
        sql += "group by usuario.nombre_completo ";

        play.Logger.debug("#### CONSULTA listaDefensores= "+sql);
        List<SqlRow> listaUsuarios = Ebean.createSqlQuery(sql).findList();

        Map<String, String> listaContador = new LinkedHashMap<String, String>();
        for(SqlRow defensor: listaUsuarios){
            play.Logger.debug("defensor="+defensor.getString("nombre_completo"));
            play.Logger.debug("num_defensas="+defensor.getInteger("num_defensas"));
            listaContador.put(defensor.getString("user_name"),defensor.getString("nombre_completo")+" ("+defensor.getInteger("num_defensas")+")");
        }
        return listaContador;

    }*/

    /*public static Map<String,String> listaTrabajadoresSociales(String userName) {
        Usuario user = Usuario.findByUserName(userName);

        List<Usuario> listaUsuarios = Usuario.find.where().eq("roles.name","psicologo").eq("distrito.id", user.getDistrito().getId()).findList();
        Map<String, Integer> listaContador = new LinkedHashMap<String, Integer>();
        for(Usuario usuario:listaUsuarios){
            int numCasos = AtencionPsicologica.find.where().eq("usuario.nombreCompleto",usuario.getNombreCompleto()).findRowCount();
            listaContador.put(usuario.getUserName(),numCasos);
        }
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<Map.Entry<String, Integer>>(listaContador.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
                return a.getValue().compareTo(b.getValue());
            }
        });
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Map.Entry<String, Integer> entry : entries) {
            play.Logger.debug("entry.getKey()"+entry.getKey());
            play.Logger.debug("entry.getValue()"+entry.getValue());
            Usuario usuario = Usuario.findByUserName(entry.getKey());
            sortedMap.put(usuario.getUserName(),usuario.getNombreCompleto()+" ("+entry.getValue()+")");
        }
        return sortedMap;

    }*/

    public static Map<String,Boolean> optionsCheckbox(){
        LinkedHashMap<String,Boolean> options = new LinkedHashMap<String,Boolean>();
        // options.put("Administrador", false);
        options.put("Autorizador Jurídico", false);
        options.put("Turnado Jurídico", false);
        options.put("Supervisor", false);
        options.put("Abogado", false);
        options.put("Receptor Solicitud", false);
        options.put("Supervisor Jurídico", false);
        options.put("Trabajador Social", false);
        options.put("Psicólogo", false);
        options.put("Externo", false);
        options.put("Ciudadano", false);
        return options;
    }

    public static Map<String,Boolean> optionsCheckboxById(String userName) {
        LinkedHashMap<String,Boolean> options = new LinkedHashMap<String,Boolean>();
        Usuario usuario = Usuario.findByUserName(userName);
        //List<? extends Role> roles = usuario.getRoles();
        // SecurityRole admin = SecurityRole.find.where().eq("name","admin").findUnique();
        /*SecurityRole autdef = SecurityRole.find.where().eq("name","autdef").findUnique();
        SecurityRole turnadordef = SecurityRole.find.where().eq("name","turnadordef").findUnique();
        SecurityRole supervisor = SecurityRole.find.where().eq("name","supervisor").findUnique();
        SecurityRole abogadodefensor = SecurityRole.find.where().eq("name","abogadodefensor").findUnique();
        SecurityRole receptorsolicitud = SecurityRole.find.where().eq("name","receptorsolicitud").findUnique();
        SecurityRole supervisordef = SecurityRole.find.where().eq("name","supervisordef").findUnique();
        SecurityRole trabajadorSocial = SecurityRole.find.where().eq("name","trabajadorSocial").findUnique();
        SecurityRole psicologo = SecurityRole.find.where().eq("name","psicologo").findUnique();
        SecurityRole externo = SecurityRole.find.where().eq("name","externo").findUnique();
        SecurityRole ciudadano = SecurityRole.find.where().eq("name","ciudadano").findUnique();*/
        // if(roles.contains(admin)){
        //   options.put("Administrador", true);
        // } else {
        //   options.put("Administrador", false);
        // }
        /*if(roles.contains(autdef)){
            options.put("Autorizador Jurídico", true);
        } else {
            options.put("Autorizador Jurídico", false);
        }
        if(roles.contains(turnadordef)){
            options.put("Turnado Jurídico", true);
        } else {
            options.put("Turnado Jurídico", false);
        }
        if(roles.contains(supervisor)){
            options.put("Supervisor", true);
        } else {
            options.put("Supervisor", false);
        }
        if(roles.contains(abogadodefensor)){
            options.put("Abogado", true);
        } else {
            options.put("Abogado", false);
        }
        if(roles.contains(receptorsolicitud)){
            options.put("Receptor Solicitud", true);
        } else {
            options.put("Receptor Solicitud", false);
        }
        if(roles.contains(supervisordef)){
            options.put("Supervisor Jurídico", true);
        } else {
            options.put("Supervisor Jurídico", false);
        }
        if(roles.contains(trabajadorSocial)){
            options.put("Trabajador Social", true);
        } else {
            options.put("Trabajador Social", false);
        }
        if(roles.contains(psicologo)){
            options.put("Psicólogo", true);
        } else {
            options.put("Psicólogo", false);
        }
        if(roles.contains(externo)){
            options.put("Externo", true);
        } else {
            options.put("Externo", false);
        }
        if(roles.contains(ciudadano)){
            options.put("Ciudadano", true);
        } else {
            options.put("Ciudadano", false);
        }*/
        return options;
    }

    public static void crear(List<String> rolesUsuario, Usuario usuario,Boolean nuevo, Long id){
        /*List<SecurityRole> permisos = new ArrayList<SecurityRole>();
        for (String rol : rolesUsuario){
          /*if(rol.equals("Administrador")){
            SecurityRole rolUser = SecurityRole.find.where().eq("name","admin").findUnique();
            permisos.add(rolUser);
          } else */
        /*if(rol.equals("Autorizador Jurídico")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","autdef").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Turnado Jurídico")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","turnadordef").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Supervisor")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","supervisor").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Supervisor Jurídico")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","supervisordef").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Abogado")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","abogadodefensor").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Receptor Solicitud")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","receptorsolicitud").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Trabajador Social")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","trabajadorSocial").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Psicólogo")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","psicologo").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Externo")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","externo").findUnique();
                permisos.add(rolUser);
            } else if(rol.equals("Ciudadano")){
                SecurityRole rolUser = SecurityRole.find.where().eq("name","ciudadano").findUnique();
                permisos.add(rolUser);
            }

        }
        usuario.setRoles(permisos);
        if(nuevo){
            usuario.save();
        } else {
            usuario.update(id);
        }*/

    }

    public static Boolean checaRol(String userName){
        Usuario usuario = Usuario.findByUserName(userName);
        //List<? extends Role> roles = usuario.getRoles();
        //SecurityRole admin = SecurityRole.find.where().eq("name","admin").findUnique();
        //SecurityRole superusuario = SecurityRole.find.where().eq("name","superusuario").findUnique();
        /*if(roles.contains(admin)){
            return true;
        } else {
            return false;
        }*/
        return false;
    }

    public static Map<String,String> optionsPreguntaSecreta() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();

        options.put("¿Nombre de tu mascota favorita?", "¿Nombre de tu mascota favorita?");
        options.put("¿Color favorito?", "¿Color favorito?");
        options.put("¿Nombre de tu mejor amigo de la infancia?", "¿Nombre de tu mejor amigo de la infancia?");
        options.put("¿Libro favorito?", "¿Libro favorito?");
        options.put("¿Ciudad favorita?", "¿Ciudad favorita?");
        options.put("¿Fecha de aniversario?", "¿Fecha de aniversario?");
        options.put("¿A qué le tengo miedo?", "¿A qué le tengo miedo?");
        options.put("¿Nombre de tu maestro favorito de la primaria?", "¿Nombre de tu maestro favorito de la primaria?");
        options.put("¿Cuál es mi dia favorito del año?", "¿Cuál es mi dia favorito del año?");
        options.put("¿Mi película favorita?", "¿Mi película favorita?");
        options.put("¿En que ciudad nació mi abuelita?", "¿En que ciudad nació mi abuelita?");
        options.put("¿Mi bedida favorita?", "¿Mi bedida favorita?");

        return options;
    }


}
