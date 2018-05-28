package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PrefixExpressionKind implements org.eclipse.emf.common.util.Enumerator{
	INCREMENT(1, "INCREMENT", "++"),
	DECREMENT(2, "DECREMENT", "--"),
	PLUS(3, "PLUS", "+"),
	MINUS(4, "MINUS", "-"),
	COMPLEMENT(5, "COMPLEMENT", "~"),
	NOT(6, "NOT", "!")
;	public static final int INCREMENT_VALUE = 1;
	public static final int DECREMENT_VALUE = 2;
	public static final int PLUS_VALUE = 3;
	public static final int MINUS_VALUE = 4;
	public static final int COMPLEMENT_VALUE = 5;
	public static final int NOT_VALUE = 6;
	
	private static final PrefixExpressionKind[] VALUES_ARRAY =
		new PrefixExpressionKind[] {
		INCREMENT,
		DECREMENT,
		PLUS,
		MINUS,
		COMPLEMENT,
		NOT
		};
	public static final List<PrefixExpressionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static PrefixExpressionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrefixExpressionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static PrefixExpressionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrefixExpressionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static PrefixExpressionKind get(int value) {
		switch (value) {
			
			case INCREMENT_VALUE: return INCREMENT;
			
			case DECREMENT_VALUE: return DECREMENT;
			
			case PLUS_VALUE: return PLUS;
			
			case MINUS_VALUE: return MINUS;
			
			case COMPLEMENT_VALUE: return COMPLEMENT;
			
			case NOT_VALUE: return NOT;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private PrefixExpressionKind(int value, String name, String literal) {
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
