package createapi;

public interface ResponseTransformer {
	String render(Object model) throws Exception;

}
