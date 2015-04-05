package com.bingkun;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CtorPOJO {

	private String type, name;

//	@JsonCreator
//	public CtorPOJO(@JsonProperty("type") String x, @JsonProperty("name") String y) {
//		type = x;
//		name = y;
//	}

	public void setType(String type) {
		System.out.println("here");
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CtorPOJO{" +
				"type=" + type +
				", name=" + name +
				'}';
	}

	public static void main(String args[]) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			File file = new File("test2.json");
			CtorPOJO ctorPOJO = mapper.readValue(file, CtorPOJO.class);
			System.out.println(mapper.writeValueAsString(ctorPOJO));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


