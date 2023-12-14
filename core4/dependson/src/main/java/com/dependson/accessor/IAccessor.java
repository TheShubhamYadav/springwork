package com.dependson.accessor;

import java.io.IOException;

public interface IAccessor {
	String getKey();
	Object getData() throws IOException;
}
