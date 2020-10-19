package fasam.faculdade.retrotrif.model;

public class Planestes {

    private String name;
    private Integer rotation_period;
    private Integer orbital_period;
    private Integer diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private Integer surface_water;
    private String residents;
    private String films;
    private String created;

    public Planestes(String name) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.residents = residents;
        this.films = films;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public Integer getRotation_period() {
        return rotation_period;
    }

    public Integer getOrbital_period() {
        return orbital_period;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public Integer getSurface_water() {
        return surface_water;
    }

    public String getResidents() {
        return residents;
    }

    public String getFilms() {
        return films;
    }

    public String getCreated() {
        return created;
    }
}
