package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum InheritanceKind implements org.eclipse.emf.common.util.Enumerator{
	NONE(1, "none", "none"),
	ABSTRACT(2, "abstract", "abstract"),
	FINAL(3, "final", "final")
;	public static final int NONE_VALUE = 1;
	public static final int ABSTRACT_VALUE = 2;
	public static final int FINAL_VALUE = 3;
	
	private static final InheritanceKind[] VALUES_ARRAY =
		new InheritanceKind[] {
		NONE,
		ABSTRACT,
		FINAL
		};
	public static final List<InheritanceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static InheritanceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InheritanceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static InheritanceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InheritanceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static InheritanceKind get(int value) {
		switch (value) {
			
			case NONE_VALUE: return NONE;
			
			case ABSTRACT_VALUE: return ABSTRACT;
			
			case FINAL_VALUE: return FINAL;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private InheritanceKind(int value, String name, String literal) {
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
