import lombok.Data;
import java.util.UUID;

@Data
public class User {

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRocket() {
		return rocket;
	}

	public void setRocket(String rocket) {
		this.rocket = rocket;
	}

	private UUID id;
    private String name;
    private String rocket;

    public User(UUID id, String name, String rocket) {
        this.id = id;
        this.name = name;
        this.rocket = rocket;
    }
}
