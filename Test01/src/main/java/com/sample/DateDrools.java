package main.java.com.sample;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;

public class DateDrools {

	public static void main(String[] args) {
		KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
		System.setProperty("drools.dateformat","yyyy-MM-dd");
		//kb.add(new ClassPathResource("Sample8.drl"), ResourceType.DRL);
		kb.add(new ClassPathResource("Sample9.drl"), ResourceType.DRL);
		Collection collection = kb.getKnowledgePackages();
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(collection);
		StatefulKnowledgeSession statefulKSession = knowledgeBase.newStatefulKnowledgeSession();
		statefulKSession.fireAllRules();
		statefulKSession.dispose();
		
		System.out.println("end ...");
		
		
		
	}
}
