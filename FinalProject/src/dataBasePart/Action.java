package dataBasePart;

public interface Action {
	public static final String SUCCESS = "success";
	public static final String NONE = "none";
	public static final String ERROR = "error";
	public static final String INPUT = "input";
	public static final String LOGIN = "login";
	public static final String TEST = "test";
	public String execute() throws Exception;
}
