package Ocllib;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class QuickSet<T> extends HashSet<T> implements Ocllib.Collection<T>{

    private Class<?> dataClass = null;

    public QuickSet(Class<?> dataClass)
    {
        this.dataClass = dataClass;
    }
	
	@Override
	public boolean equals(Ocllib.Collection<T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notEquals(Ocllib.Collection<T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includes(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excludes(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int count(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean includesAll(Ocllib.Collection<T> c2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excludesAll(Ocllib.Collection<T> c2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<T> asSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderedSet<T> asOrderedSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sequence<T> asSequence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bag<T> asBag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T any(Function<T, Boolean> lambda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Function<T, Boolean> lambda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean forAll(Function<T, Boolean> lambda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T2> boolean isUnique(Function<T, T2> lambda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean one(Function<T, Boolean> lambda) {
		// TODO Auto-generated method stub
		return false;
	}
	
    public <T2> Set<T2> collect(Class<T2> c, Function<T, T2> lambda){
    	Set<T2> result = new Set<T2>(c);

        for (T element : this)
        {
            result.add(lambda.apply(element));
        }

        return result;
    }
    
    public <T2> Set<T2> collect2(Class<T2> c, Function<T, Collection<T2>> lambda){
    	Set<T2> result = new Set<T2>(c);

    	
        for (T element : this)
        {
        	
        	Collection<T2> e = lambda.apply(element);
        	
        	for(T2 ee : e) {
        		result.add(ee);
        	}
            
        }

        return result;
    }
    
    public Set<T> select(Predicate<T> lambda)
    {
    	Set<T> result = new Set<T>(getDataClass());

        for (T element : this)
        {
        	if(lambda.test(element)) {
        		
        		result.add(element);
        	}
        }

        return result;
    }
    
	protected Class getDataClass() {
		return dataClass;
	}

	

}
