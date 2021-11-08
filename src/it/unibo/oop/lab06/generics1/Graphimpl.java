package it.unibo.oop.lab06.generics1;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Graphimpl<N> implements Graph <N>{
	
	private Map <N, Set<N>> m1 = new HashMap<>();
	
	public void addNode(N node) {
		m1.put(node, new HashSet<>());
	}

	public void addEdge(N source, N target) {
		if(source != null && target != null) {
			m1.get(source).add(target);
		}
	}

	public Set<N> nodeSet() {
		return m1.keySet();
	}

	public Set<N> linkedNodes(N node) {
		return m1.get(node);
	}

	public List<N> getPath(N source, N target) {
		List <N> l1 = new ArrayList<>();
		if(source==null || target==null) {
			return null;
		}
		l1.add(source);
		
		while(linkedNodes(source)!=target) {
			m1.get(linkedNodes(source));	
		}
		
		return l1;
	}
}
