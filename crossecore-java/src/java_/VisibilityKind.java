package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum VisibilityKind implements org.eclipse.emf.common.util.Enumerator{
	NONE(1, "none", "none"),
	PUBLIC(2, "public", "public"),
	PRIVATE(3, "private", "private"),
	PROTECTED(4, "protected", "protected")
;	public static final int NONE_VALUE = 1;
	public static final int PUBLIC_VALUE = 2;
	public static final int PRIVATE_VALUE = 3;
	public static final int PROTECTED_VALUE = 4;
	
	private static final VisibilityKind[] VALUES_ARRAY =
		new VisibilityKind[] {
		NONE,
		PUBLIC,
		PRIVATE,
		PROTECTED
		};
	public static final List<VisibilityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static VisibilityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static VisibilityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static VisibilityKind get(int value) {
		switch (value) {
			
			case NONE_VALUE: return NONE;
			
			case PUBLIC_VALUE: return PUBLIC;
			
			case PRIVATE_VALUE: return PRIVATE;
			
			case PROTECTED_VALUE: return PROTECTED;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private VisibilityKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
	  return value;
	}

	public String getName() {
	  return name;
	}

	public String getLiteral() {
	  return literal;
	}

	@Override
	public String toString() {
		return literal;
	}
			
}
