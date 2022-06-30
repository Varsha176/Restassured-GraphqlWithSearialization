import lombok.Data;

@Data
public class QueryLimit {

    public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	private int limit;
}
