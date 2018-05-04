package com.bootdo.common.utils;

import java.util.HashMap;
import java.util.Map;

public class Rest extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public Rest() {
		put("code", 0);
		put("msg", "操作成功");
	}

	public static Rest error() {
		return error(1, "操作失败");
	}

	public static Rest error(String msg) {
		return error(500, msg);
	}

	public static Rest error(int code, String msg) {
		Rest rest = new Rest();
		rest.put("code", code);
		rest.put("msg", msg);
		return rest;
	}

	public static Rest ok(String msg) {
		Rest rest = new Rest();
		rest.put("msg", msg);
		return rest;
	}

	public static Rest ok(Map<String, Object> map) {
		Rest rest = new Rest();
		rest.putAll(map);
		return rest;
	}

	public static Rest ok() {
		return new Rest();
	}

	@Override
	public Rest put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
