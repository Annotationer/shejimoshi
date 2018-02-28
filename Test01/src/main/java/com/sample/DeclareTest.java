package main.java.com.sample;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.type.FactType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;

public class DeclareTest {

	public static void main(String[] args) {
		KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kb.add(new ClassPathResource("Sample13.drl"), ResourceType.DRL);
		Collection collection  = kb.getKnowledgePackages();
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(collection);
		
		FactType type = knowledgeBase.getFactType("com.sample", "Address");
		try {
			Object object = type.newInstance();
			type.set(object, "city","≤‚ ‘");
			type.set(object, "addressName", "µÿ÷∑");
			
			
		
			StatefulKnowledgeSession statefulKSession = knowledgeBase.newStatefulKnowledgeSession();
			
			statefulKSession.insert(object);
			
			statefulKSession.fireAllRules();
			statefulKSession.dispose();	
			
			
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
