package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum InfixExpressionKind implements org.eclipse.emf.common.util.Enumerator{
	TIMES(1, "TIMES", "*"),
	DIVIDE(2, "DIVIDE", "/"),
	REMAINDER(3, "REMAINDER", "%"),
	PLUS(4, "PLUS", "+"),
	MINUS(5, "MINUS", "-"),
	LEFT_SHIFT(6, "LEFT_SHIFT", "<<"),
	RIGHT_SHIFT_SIGNED(7, "RIGHT_SHIFT_SIGNED", ">>"),
	RIGHT_SHIFT_UNSIGNED(8, "RIGHT_SHIFT_UNSIGNED", ">>>"),
	LESS(9, "LESS", "<"),
	GREATER(10, "GREATER", ">"),
	LESS_EQUALS(11, "LESS_EQUALS", "<="),
	GREATER_EQUALS(12, "GREATER_EQUALS", ">="),
	EQUALS(13, "EQUALS", "=="),
	NOT_EQUALS(14, "NOT_EQUALS", "!="),
	XOR(15, "XOR", "^"),
	AND(16, "AND", "&"),
	OR(17, "OR", "|"),
	CONDITIONAL_AND(18, "CONDITIONAL_AND", "&&"),
	CONDITIONAL_OR(19, "CONDITIONAL_OR", "||")
;	public static final int TIMES_VALUE = 1;
	public static final int DIVIDE_VALUE = 2;
	public static final int REMAINDER_VALUE = 3;
	public static final int PLUS_VALUE = 4;
	public static final int MINUS_VALUE = 5;
	public static final int LEFT_SHIFT_VALUE = 6;
	public static final int RIGHT_SHIFT_SIGNED_VALUE = 7;
	public static final int RIGHT_SHIFT_UNSIGNED_VALUE = 8;
	public static final int LESS_VALUE = 9;
	public static final int GREATER_VALUE = 10;
	public static final int LESS_EQUALS_VALUE = 11;
	public static final int GREATER_EQUALS_VALUE = 12;
	public static final int EQUALS_VALUE = 13;
	public static final int NOT_EQUALS_VALUE = 14;
	public static final int XOR_VALUE = 15;
	public static final int AND_VALUE = 16;
	public static final int OR_VALUE = 17;
	public static final int CONDITIONAL_AND_VALUE = 18;
	public static final int CONDITIONAL_OR_VALUE = 19;
	
	private static final InfixExpressionKind[] VALUES_ARRAY =
		new InfixExpressionKind[] {
		TIMES,
		DIVIDE,
		REMAINDER,
		PLUS,
		MINUS,
		LEFT_SHIFT,
		RIGHT_SHIFT_SIGNED,
		RIGHT_SHIFT_UNSIGNED,
		LESS,
		GREATER,
		LESS_EQUALS,
		GREATER_EQUALS,
		EQUALS,
		NOT_EQUALS,
		XOR,
		AND,
		OR,
		CONDITIONAL_AND,
		CONDITIONAL_OR
		};
	public static final List<InfixExpressionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static InfixExpressionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfixExpressionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static InfixExpressionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfixExpressionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static InfixExpressionKind get(int value) {
		switch (value) {
			
			case TIMES_VALUE: return TIMES;
			
			case DIVIDE_VALUE: return DIVIDE;
			
			case REMAINDER_VALUE: return REMAINDER;
			
			case PLUS_VALUE: return PLUS;
			
			case MINUS_VALUE: return MINUS;
			
			case LEFT_SHIFT_VALUE: return LEFT_SHIFT;
			
			case RIGHT_SHIFT_SIGNED_VALUE: return RIGHT_SHIFT_SIGNED;
			
			case RIGHT_SHIFT_UNSIGNED_VALUE: return RIGHT_SHIFT_UNSIGNED;
			
			case LESS_VALUE: return LESS;
			
			case GREATER_VALUE: return GREATER;
			
			case LESS_EQUALS_VALUE: return LESS_EQUALS;
			
			case GREATER_EQUALS_VALUE: return GREATER_EQUALS;
			
			case EQUALS_VALUE: return EQUALS;
			
			case NOT_EQUALS_VALUE: return NOT_EQUALS;
			
			case XOR_VALUE: return XOR;
			
			case AND_VALUE: return AND;
			
			case OR_VALUE: return OR;
			
			case CONDITIONAL_AND_VALUE: return CONDITIONAL_AND;
			
			case CONDITIONAL_OR_VALUE: return CONDITIONAL_OR;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private InfixExpressionKind(int value, String name, String literal) {
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
