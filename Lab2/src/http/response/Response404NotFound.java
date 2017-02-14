package http.response;

import java.io.File;

public class Response404NotFound extends Response {

	private final String RESPONSE = "HTTP/1.1 404 Not Found\r\n";
	private final String CONTENT = "<html><body><h1>404 Not Found</h1></body></html>";
	private final String EXTENSION = "text/html";
	private final ResponseType RESPONSE_TYPE = ResponseType.NOT_FOUND;

	@Override
	public String getResponseString(boolean connection) {
		return RESPONSE + super.getContentLengthAndType(CONTENT.getBytes().length, EXTENSION)
				+ super.getConnection(connection);
	}

	@Override
	public ResponseType getResponseType() {
		return RESPONSE_TYPE;
	}

	@Override
	public String getContent() {
		return CONTENT;
	}

	@Override
	public File getFile() {
		return null;
	}
}